package cn.linkpal.model;

/***
 * 异常分类
 */
public class ExceptionClassificat extends BaseModel {


    private String ClassificatNo;//分类编号
    private String ClassificatName;//分类名称

    public String getClassificatNo() {
        return ClassificatNo;
    }

    public void setClassificatNo(String classificatNo) {
        ClassificatNo = classificatNo;
    }

    public String getClassificatName() {
        return ClassificatName;
    }

    public void setClassificatName(String classificatName) {
        ClassificatName = classificatName;
    }
}
