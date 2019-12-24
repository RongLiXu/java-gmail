package com.shinyu.gmall.bean;

import java.sql.Timestamp;

public class Shinyu_Article_cats {
    private int Id;
    private int ParentId;
    private int CatType;
    private boolean IsShow;
    private String CatName;

    @Override
    public String toString() {
        return "Shinyu_Article_cats{" +
                "Id=" + Id +
                ", ParentId=" + ParentId +
                ", CatType=" + CatType +
                ", IsShow=" + IsShow +
                ", CatName='" + CatName + '\'' +
                ", CatSort=" + CatSort +
                ", DataFlag=" + DataFlag +
                ", CreateTime=" + CreateTime +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getParentId() {
        return ParentId;
    }

    public void setParentId(int parentId) {
        ParentId = parentId;
    }

    public int getCatType() {
        return CatType;
    }

    public void setCatType(int catType) {
        CatType = catType;
    }

    public boolean isShow() {
        return IsShow;
    }

    public void setShow(boolean show) {
        IsShow = show;
    }

    public String getCatName() {
        return CatName;
    }

    public void setCatName(String catName) {
        CatName = catName;
    }

    public int getCatSort() {
        return CatSort;
    }

    public void setCatSort(int catSort) {
        CatSort = catSort;
    }

    public int getDataFlag() {
        return DataFlag;
    }

    public void setDataFlag(int dataFlag) {
        DataFlag = dataFlag;
    }

    public Timestamp getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Timestamp createTime) {
        CreateTime = createTime;
    }

    private int CatSort;
    private int DataFlag;
    private Timestamp CreateTime;
}
