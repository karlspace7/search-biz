package com.yao.search.biz.core.model.po;

/**
 * 移动端，标签，TagsCacheJob中用到，id，gender
 */
public class BtocCustomTag {

    private int id;

    private String name;

    private String rolName;

    private int virtualNumber;

    private int buyNumberOfAll;

    private int buyNumber;

    private String rolName1;

    private String gender;

    private int tagCataId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public int getVirtualNumber() {
        return virtualNumber;
    }

    public void setVirtualNumber(int virtualNumber) {
        this.virtualNumber = virtualNumber;
    }

    public int getBuyNumberOfAll() {
        return buyNumberOfAll;
    }

    public void setBuyNumberOfAll(int buyNumberOfAll) {
        this.buyNumberOfAll = buyNumberOfAll;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }

    public String getRolName1() {
        return rolName1;
    }

    public void setRolName1(String rolName1) {
        this.rolName1 = rolName1;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTagCataId() {
        return tagCataId;
    }

    public void setTagCataId(int tagCataId) {
        this.tagCataId = tagCataId;
    }
}
