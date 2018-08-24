package cn.linkpal.model;

/*
异常细类
 */
public class ExceptionFineClass extends BaseModel{

    private String ClassificatNo;//分类编号

    private String FineClassNo;//细类编号

    private String FineClassName;//细类名称

    private String FineClassDesciption;//xi类描述

    public String getClassificatNo() {
        return ClassificatNo;
    }

    public void setClassificatNo(String classificatNo) {
        ClassificatNo = classificatNo;
    }

    public String getFineClassNo() {
        return FineClassNo;
    }

    public void setFineClassNo(String fineClassNo) {
        FineClassNo = fineClassNo;
    }

    public String getFineClassName() {
        return FineClassName;
    }

    public void setFineClassName(String fineClassName) {
        FineClassName = fineClassName;
    }

    public String getFineClassDesciption() {
        return FineClassDesciption;
    }

    public void setFineClassDesciption(String fineClassDesciption) {
        FineClassDesciption = fineClassDesciption;
    }
}
