package com.yao.search.biz.selfsp.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * 启动帮助类，main方法入口
 */
public class Bootstrap {

    private static Logger logger = LoggerFactory.getLogger("searcher-bootstrap");

    private static volatile CountDownLatch keepAliveLatch;


    private void setUp() throws IOException {

    }

    private void start() throws Exception {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(
                new String[]{"classpath:config/spring-database.xml",
                        "classpath:config/spring-redis.xml",
                        "classpath:config/elastic-env.xml",
                        "classpath:config/elastic-searcher.xml",
                        "classpath:config/dubbo-consumer.xml",
                        "classpath:config/spring-cache.xml",
                        "classpath:config/spring-job.xml",
                        "classpath:config/dubbo-provider.xml"});
        context.start();
    }

    private void stop() throws Exception {

    }

    public static void main(String[] args) {
        try {
            final Bootstrap bootstrap = new Bootstrap();
            bootstrap.setUp();
            bootstrap.start();

            logger.info("elastic-client-provider started!");

            keepAliveLatch = new CountDownLatch(1);
            // keep this thread alive (non daemon thread) until we shutdown
            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    try {
                        bootstrap.stop();
                    } catch (Exception e) {
                        logger.error("stop fail!", e);
                    } finally {
                        keepAliveLatch.countDown();
                    }
                }
            });
            Thread keepAliveThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        keepAliveLatch.await();
                    } catch (InterruptedException e) {
                        // bail out
                    }
                }
            }, "elastic-client[keepAlive/v1.0]");
            keepAliveThread.setDaemon(false);
            keepAliveThread.start();
        } catch (Exception e) {
            logger.error("system start fail!", e);
            System.exit(3);
        }

    }


}
