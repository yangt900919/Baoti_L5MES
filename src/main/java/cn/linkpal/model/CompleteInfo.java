package cn.linkpal.model;

public class CompleteInfo {

    private long Id ;
    /// <summary>
    /// 汇报编号
    /// </summary>
    private String ReportNo ;

    /// <summary>
    /// 工艺卡ID
    /// </summary>
    private long CardId ;

    /// <summary>
    /// 工艺卡号
    /// </summary>
    private String CardNo ;

    /// <summary>
    /// 工艺卡行号
    /// </summary>
    private long CardLineNo ;

    /// <summary>
    /// 工序ID
    /// </summary>
    private long ProcessId ;

    /// <summary>
    /// 工序名称
    /// </summary>
    private String ProcessName ;

    /// <summary>
    /// 完工数量
    /// </summary>
    private double CompletionQty ;

    /// <summary>
    /// 完工重量
    /// </summary>
    private double CompletionWeight ;
    /// <summary>
    /// 摆放区号
    /// </summary>
    private String PositionNo ;

    /// <summary>
    /// 完工规格
    /// </summary>
    private String CompletionSPEC ;

    /// <summary>
    /// 开工时间
    /// </summary>
    private String BeginTime ;

    /// <summary>
    /// 开工人
    /// </summary>
    private String BeginUser ;

    /// <summary>
    /// 开工人班组
    /// </summary>
    private String BeginUserTeam ;

    /// <summary>
    /// 完工时间
    /// </summary>
    private String CompletionTime ;

    /// <summary>
    /// 完工人
    /// </summary>
    private String CompletionUser ;

    /// <summary>
    /// 完工人班组
    /// </summary>
    private String CompletionUserTeam ;

    /// <summary>
    /// QA检查时间
    /// </summary>
    private String QACheckTime ;

    /// <summary>
    /// QA检查人
    /// </summary>
    private String QACheckUser ;

    /// <summary>
    /// 节余数量
    /// </summary>
    private double SurplusQty ;

    /// <summary>
    /// 节余重量
    /// </summary>
    private double SurplusWeight ;
    /// <summary>
    /// 节余料摆放区号
    /// </summary>
    private String SurplusPositionNo ;

    /// <summary>
    /// 废料数量
    /// </summary>
    private double WasteQty ;

    /// <summary>
    /// 废料重量
    /// </summary>
    private double WasteWeight ;

    /// <summary>
    /// 备注
    /// </summary>
    private String Comment ;

    /// <summary>
    /// 分厂ID
    /// </summary>
    private long FactId ;
    /// <summary>
    /// 分厂名
    /// </summary>
    private String FactName ;

    /// <summary>
    /// 班组ID
    /// </summary>
    private long TeamId ;
    /// <summary>
    /// 班组名
    /// </summary>
    private String TeamName ;

    /// <summary>
    /// 车间ID
    /// </summary>
    private long DeptId ;
    /// <summary>
    /// 车间名
    /// </summary>
    private String DeptName ;

    /// <summary>
    /// 加工设备
    /// </summary>
    public String MachiningEquipment ;

    /// <summary>
    /// 结余料规格
    /// </summary>
    public String SurplusSPEC ;

    /// <summary>
    /// 废料规格
    /// </summary>
    public String WasteSPEC ;

    public CompleteInfo()
    {
        this.ReportNo="";
        this.QACheckTime=null;
        this.QACheckUser=null;
        this.BeginTime=null;
        this.BeginUser=null;
        this.BeginUserTeam=null;
      /*  this.Id=0;*/
        this.CardLineNo=0;

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getReportNo() {
        return ReportNo;
    }

    public void setReportNo(String reportNo) {
        ReportNo = reportNo;
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

    public long getCardLineNo() {
        return CardLineNo;
    }

    public void setCardLineNo(long cardLineNo) {
        CardLineNo = cardLineNo;
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

    public double getCompletionQty() {
        return CompletionQty;
    }

    public void setCompletionQty(double completionQty) {
        CompletionQty = completionQty;
    }

    public double getCompletionWeight() {
        return CompletionWeight;
    }

    public void setCompletionWeight(double completionWeight) {
        CompletionWeight = completionWeight;
    }

    public String getPositionNo() {
        return PositionNo;
    }

    public void setPositionNo(String positionNo) {
        PositionNo = positionNo;
    }

    public String getCompletionSPEC() {
        return CompletionSPEC;
    }

    public void setCompletionSPEC(String completionSPEC) {
        CompletionSPEC = completionSPEC;
    }

    public String getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(String beginTime) {
        BeginTime = beginTime;
    }

    public String getBeginUser() {
        return BeginUser;
    }

    public void setBeginUser(String beginUser) {
        BeginUser = beginUser;
    }

    public String getBeginUserTeam() {
        return BeginUserTeam;
    }

    public void setBeginUserTeam(String beginUserTeam) {
        BeginUserTeam = beginUserTeam;
    }

    public String getCompletionTime() {
        return CompletionTime;
    }

    public void setCompletionTime(String completionTime) {
        CompletionTime = completionTime;
    }

    public String getCompletionUser() {
        return CompletionUser;
    }

    public void setCompletionUser(String completionUser) {
        CompletionUser = completionUser;
    }

    public String getCompletionUserTeam() {
        return CompletionUserTeam;
    }

    public void setCompletionUserTeam(String completionUserTeam) {
        CompletionUserTeam = completionUserTeam;
    }

    public String getQACheckTime() {
        return QACheckTime;
    }

    public void setQACheckTime(String QACheckTime) {
        this.QACheckTime = QACheckTime;
    }

    public String getQACheckUser() {
        return QACheckUser;
    }

    public void setQACheckUser(String QACheckUser) {
        this.QACheckUser = QACheckUser;
    }

    public double getSurplusQty() {
        return SurplusQty;
    }

    public void setSurplusQty(double surplusQty) {
        SurplusQty = surplusQty;
    }

    public double getSurplusWeight() {
        return SurplusWeight;
    }

    public void setSurplusWeight(double surplusWeight) {
        SurplusWeight = surplusWeight;
    }

    public String getSurplusPositionNo() {
        return SurplusPositionNo;
    }

    public void setSurplusPositionNo(String surplusPositionNo) {
        SurplusPositionNo = surplusPositionNo;
    }

    public double getWasteQty() {
        return WasteQty;
    }

    public void setWasteQty(double wasteQty) {
        WasteQty = wasteQty;
    }

    public double getWasteWeight() {
        return WasteWeight;
    }

    public void setWasteWeight(double wasteWeight) {
        WasteWeight = wasteWeight;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
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

    public String getMachiningEquipment() {
        return MachiningEquipment;
    }

    public void setMachiningEquipment(String machiningEquipment) {
        MachiningEquipment = machiningEquipment;
    }

    public String getSurplusSPEC() {
        return SurplusSPEC;
    }

    public void setSurplusSPEC(String surplusSPEC) {
        SurplusSPEC = surplusSPEC;
    }

    public String getWasteSPEC() {
        return WasteSPEC;
    }

    public void setWasteSPEC(String wasteSPEC) {
        WasteSPEC = wasteSPEC;
    }
}
