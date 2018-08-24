package cn.linkpal.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionInfo  {

    private long Id ;

    /// <summary>
    /// 分厂id
    /// </summary>
    private long FactId ;

    /// <summary>
    /// 分厂名称
    /// </summary>
    private String FactName ;

    /// <summary>
    /// 工序id
    /// </summary>
    private long ProcessId ;

    /// <summary>
    /// 工序名称
    /// </summary>
    private String ProcessName ;

    /// <summary>
    /// 流转卡id
    /// </summary>
    private long CardId ;

    /// <summary>
    /// 流转卡编号
    /// </summary>
    private String CardNo ;

    /// <summary>
    /// 车间id
    /// </summary>
    private long DeptId ;

    /// <summary>
    /// 车间
    /// </summary>
    private String DeptName ;

    /// <summary>
    /// 班组id
    /// </summary>
    private long TeamId ;

    /// <summary>
    /// 班组
    /// </summary>
    private String TeamName ;
    /// <summary>
    /// 异常编号
    /// </summary>
    private String ExceptionNo ;

    /// <summary>
    /// 分类编号
    /// </summary>
    private String ClassificatNo ;

    /// <summary>
    /// 分类名称
    /// </summary>
    private String ClassificatName ;

    /// <summary>
    /// 细类名称
    /// </summary>
    private String FineClassName ;

    /// <summary>
    /// 细类编号
    /// </summary>
    private String FineClassNo ;

    /// <summary>
    /// 异常描述
    /// </summary>
    private String ExceptionDesciption ;


    /// <summary>
    /// 报告人
    /// </summary>
    private String ReportUser ;

    /// <summary>
    /// 报告时间
    /// </summary>
    private String ReportTime ;

    /// <summary>
    /// 处理时间
    /// </summary>
    private String DealTime ;

    /// <summary>
    /// 关闭时间
    /// </summary>
    private String CloseTime ;

    /// <summary>
    /// 处理人
    /// </summary>
    private String DealUser ;

    /// <summary>
    /// 关闭人
    /// </summary>
    private String CloseUser ;

    public ExceptionInfo()
    {
       /* this.=false;*/
        this.Id=0;
        this.ReportTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.DealTime=null;
        this.CloseTime=null;
        this.DealUser=null;
        this.CloseUser=null;
        this.ExceptionStatus=0;
    }

    /// <summary>
    /// 异常状态
    /// </summary>
    private int ExceptionStatus ;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getFactId() {
        return FactId;
    }

    public void setFactId(long factId) {
        FactId = factId;
    }

    public String getFactName() {
        return FactName;
    }

    public void setFactName(String factName) {
        FactName = factName;
    }

    public long getProcessId() {
        return ProcessId;
    }

    public void setProcessId(long processId) {
        ProcessId = processId;
    }

    public String getProcessName() {
        return ProcessName;
    }

    public void setProcessName(String processName) {
        ProcessName = processName;
    }

    public long getCardId() {
        return CardId;
    }

    public void setCardId(long cardId) {
        CardId = cardId;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String cardNo) {
        CardNo = cardNo;
    }

    public long getDeptId() {
        return DeptId;
    }

    public void setDeptId(long deptId) {
        DeptId = deptId;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public long getTeamId() {
        return TeamId;
    }

    public void setTeamId(long teamId) {
        TeamId = teamId;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

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

    public String getClassificatName() {
        return ClassificatName;
    }

    public void setClassificatName(String classificatName) {
        ClassificatName = classificatName;
    }

    public String getFineClassName() {
        return FineClassName;
    }

    public void setFineClassName(String fineClassName) {
        FineClassName = fineClassName;
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

    public String getReportTime() {
        return ReportTime;
    }

    public void setReportTime(String reportTime) {
        ReportTime = reportTime;
    }

    public String getDealTime() {
        return DealTime;
    }

    public void setDealTime(String dealTime) {
        DealTime = dealTime;
    }

    public String getCloseTime() {
        return CloseTime;
    }

    public void setCloseTime(String closeTime) {
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

    public int getExceptionStatus() {
        return ExceptionStatus;
    }

    public void setExceptionStatus(int exceptionStatus) {
        ExceptionStatus = exceptionStatus;
    }
}
