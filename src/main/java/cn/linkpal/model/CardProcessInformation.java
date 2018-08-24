package cn.linkpal.model;

public class CardProcessInformation  {

    private long Id ;
    /// <summary>
    /// 流转卡Id
    /// </summary>
    private long CardID ;

    /// <summary>
    ///流转卡编号
    /// </summary>
    private String CardNo ;

    /// <summary>
    /// 行号
    /// </summary>
    private long FEntryID ;

    /// <summary>
    /// 工序
    /// </summary>
    private long OperID ;

    /// <summary>
    /// 工序名
    /// </summary>
    private String OperName ;

    /// <summary>
    /// 工序编码
    /// </summary>
    private String OperNumber ;

    /// <summary>
    /// 设备
    /// </summary>
    private String Equipment ;

    /// <summary>
    /// 设备ID
    /// </summary>
    private long EquipmentId ;

    /// <summary>
    /// 工艺要求
    /// </summary>
    private String TechRequirements ;

    /// <summary>
    /// 操作工
    /// </summary>
    private String Operator ;

    /// <summary>
    /// 加工时间
    /// </summary>
    private String ProcessTime ;

    /// <summary>
    /// 自互检人
    /// </summary>
    private String SelfMutualRummager ;

    /// <summary>
    /// 自互检时间
    /// </summary>
    private String SelfMutualRummageTime ;

    /// <summary>
    /// 检查人
    /// </summary>
    private String CheckPeople ;

    /// <summary>
    /// 检查时间
    /// </summary>
    private String CheckTime ;

    /// <summary>
    /// 备注
    /// </summary>
    private String Comment ;

    /// <summary>
    /// 是否关键工序
    /// </summary>
    private boolean IsMasterKey ;

    /// <summary>
    /// 开工是否汇报
    /// </summary>
    private boolean WhetherStartWorkReport ;

    /// <summary>
    /// 是否加工到当前工序
    /// </summary>
    private boolean IsOperateCurrent ;

    /// <summary>
    /// 是否QA检查
    /// </summary>
    private boolean IsQACheck ;


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getCardID() {
        return CardID;
    }

    public void setCardID(long cardID) {
        CardID = cardID;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String cardNo) {
        CardNo = cardNo;
    }

    public long getFEntryID() {
        return FEntryID;
    }

    public void setFEntryID(long FEntryID) {
        this.FEntryID = FEntryID;
    }

    public long getOperID() {
        return OperID;
    }

    public void setOperID(long operID) {
        OperID = operID;
    }

    public String getOperName() {
        return OperName;
    }

    public void setOperName(String operName) {
        OperName = operName;
    }

    public String getOperNumber() {
        return OperNumber;
    }

    public void setOperNumber(String operNumber) {
        OperNumber = operNumber;
    }

    public String getEquipment() {
        return Equipment;
    }

    public void setEquipment(String equipment) {
        Equipment = equipment;
    }

    public long getEquipmentId() {
        return EquipmentId;
    }

    public void setEquipmentId(long equipmentId) {
        EquipmentId = equipmentId;
    }

    public String getTechRequirements() {
        return TechRequirements;
    }

    public void setTechRequirements(String techRequirements) {
        TechRequirements = techRequirements;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public String getProcessTime() {
        return ProcessTime;
    }

    public void setProcessTime(String processTime) {
        ProcessTime = processTime;
    }

    public String getSelfMutualRummager() {
        return SelfMutualRummager;
    }

    public void setSelfMutualRummager(String selfMutualRummager) {
        SelfMutualRummager = selfMutualRummager;
    }

    public String getSelfMutualRummageTime() {
        return SelfMutualRummageTime;
    }

    public void setSelfMutualRummageTime(String selfMutualRummageTime) {
        SelfMutualRummageTime = selfMutualRummageTime;
    }

    public String getCheckPeople() {
        return CheckPeople;
    }

    public void setCheckPeople(String checkPeople) {
        CheckPeople = checkPeople;
    }

    public String getCheckTime() {
        return CheckTime;
    }

    public void setCheckTime(String checkTime) {
        CheckTime = checkTime;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public boolean isMasterKey() {
        return IsMasterKey;
    }

    public void setMasterKey(boolean masterKey) {
        IsMasterKey = masterKey;
    }

    public boolean isWhetherStartWorkReport() {
        return WhetherStartWorkReport;
    }

    public void setWhetherStartWorkReport(boolean whetherStartWorkReport) {
        WhetherStartWorkReport = whetherStartWorkReport;
    }

    public boolean isOperateCurrent() {
        return IsOperateCurrent;
    }

    public void setOperateCurrent(boolean operateCurrent) {
        IsOperateCurrent = operateCurrent;
    }

    public boolean isQACheck() {
        return IsQACheck;
    }

    public void setQACheck(boolean QACheck) {
        IsQACheck = QACheck;
    }
}
