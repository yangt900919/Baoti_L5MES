package cn.linkpal.model;

import java.util.Date;

/**
 * 异常汇报
 */
public class ExceptionManage extends BaseModel {

    private String ExceptionNo;// 异常编号

    private String ClassificatNo;// 分类编号

    private String FineClassNo;// 细类编号

    private String ExceptionDesciption;// 异常描述

    private String ReportUser;// 报告人

    private String ReportUserWorkShop;// 报告人车间

    private String ReportUserTeam;// 报告人班组

    private String ReportUserBranchFactory;// 报告人分厂

    private Date ReportTime;// 报告时间

    private Date DealTime;// 处理时间


    private Date CloseTime;// 关闭时间

    private String DealUser;// 处理人

    private String CloseUser;// 关闭人

    private String ExceptionStatus;// 异常状态

    public String getExceptionNo() {
        return ExceptionNo;
    }

    public void setExceptionNo(String exceptionNo) {
        ExceptionNo = exceptionNo;
    }

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

    public String getExceptionDesciption() {
        return ExceptionDesciption;
    }

    public void setExceptionDesciption(String exceptionDesciption) {
        ExceptionDesciption = exceptionDesciption;
    }

    public String getReportUser() {
        return ReportUser;
    }

    public void setReportUser(String reportUser) {
        ReportUser = reportUser;
    }

    public String getReportUserWorkShop() {
        return ReportUserWorkShop;
    }

    public void setReportUserWorkShop(String reportUserWorkShop) {
        ReportUserWorkShop = reportUserWorkShop;
    }

    public String getReportUserTeam() {
        return ReportUserTeam;
    }

    public void setReportUserTeam(String reportUserTeam) {
        ReportUserTeam = reportUserTeam;
    }

    public String getReportUserBranchFactory() {
        return ReportUserBranchFactory;
    }

    public void setReportUserBranchFactory(String reportUserBranchFactory) {
        ReportUserBranchFactory = reportUserBranchFactory;
    }

    public Date getReportTime() {
        return ReportTime;
    }

    public void setReportTime(Date reportTime) {
        ReportTime = reportTime;
    }

    public Date getDealTime() {
        return DealTime;
    }

    public void setDealTime(Date dealTime) {
        DealTime = dealTime;
    }

    public Date getCloseTime() {
        return CloseTime;
    }

    public void setCloseTime(Date closeTime) {
        CloseTime = closeTime;
    }

    public String getDealUser() {
        return DealUser;
    }

    public void setDealUser(String dealUser) {
        DealUser = dealUser;
    }

    public String getCloseUser() {
        return CloseUser;
    }

    public void setCloseUser(String closeUser) {
        CloseUser = closeUser;
    }

    public String getExceptionStatus() {
        return ExceptionStatus;
    }

    public void setExceptionStatus(String exceptionStatus) {
        ExceptionStatus = exceptionStatus;
    }
}
