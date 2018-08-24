package cn.linkpal.model;

public class ProcessFlowCard  {

    private long Id ;
    /// <summary>
    ///流转卡编号
    /// </summary>
    private String CardNo ;

    /// <summary>
    ///父卡编号
    /// </summary>
    private String ParentCardNo ;

    /// <summary>
    ///合同号
    /// </summary>
    private String ContractNo ;

    /// <summary>
    ///生产任务编号
    /// </summary>
    private String WordNo ;

    /// <summary>
    ///需求单位
    /// </summary>
    private String DemandDeptID ;

    /// <summary>
    ///生产分厂
    /// </summary>
    private String DeptID ;

    /// <summary>
    ///生产分厂名称
    /// </summary>
    private String DeptName ;

    /// <summary>
    ///产品代码
    /// </summary>
    private String ItemNumber ;

    /// <summary>
    ///产品名称
    /// </summary>
    private String ItemName ;

    /// <summary>
    /// 技术标准
    /// </summary>
    private String TechStdNo ;

    /// <summary>
    ///规格型号
    /// </summary>
    private String ItemModel ;

    /// <summary>
    ///补充规格
    /// </summary>
    private String ItemModelMore ;

    /// <summary>
    ///数量
    /// </summary>
    private double Qty ;

    /// <summary>
    ///重量
    /// </summary>
    private double Weight ;

    /// <summary>
    ///计划开工日期
    /// </summary>
    private String PlannedCommencementDate ;

    /// <summary>
    ///计划完工日期
    /// </summary>
    private String IntendedCompletionDate ;

    /// <summary>
    ///制单人
    /// </summary>
    private String SinglePerson ;

    /// <summary>
    ///制单时间
    /// </summary>
    private String SingleDate ;

    /// <summary>
    ///是否审核
    /// </summary>
    private int Checked ;

    /// <summary>
    ///审核人
    /// </summary>
    private String Auditor ;

    /// <summary>
    ///审核时间
    /// </summary>
    private String AuditTime ;

    /// <summary>
    /// 批准人
    /// </summary>
    private String Approver ;

    /// <summary>
    /// 批准时间
    /// </summary>
    private String ApproveTime ;

    /// <summary>
    ///合同备注
    /// </summary>
    private String ContractNote ;

    /// <summary>
    ///备注
    /// </summary>
    private String Comment ;

    /// <summary>
    /// 编号
    /// </summary>
    private String BillNo ;

    /// <summary>
    /// 工艺规程编号
    /// </summary>
    private String ProcessProcedureCode ;

    /// <summary>
    /// 牌号
    /// </summary>
    private String BrandName ;

    /// <summary>
    /// 相变点
    /// </summary>
    private String PCPoint ;

    /// <summary>
    /// 合同公差
    /// </summary>
    private String ConventionalAllowance ;


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String cardNo) {
        CardNo = cardNo;
    }

    public String getParentCardNo() {
        return ParentCardNo;
    }

    public void setParentCardNo(String parentCardNo) {
        ParentCardNo = parentCardNo;
    }

    public String getContractNo() {
        return ContractNo;
    }

    public void setContractNo(String contractNo) {
        ContractNo = contractNo;
    }

    public String getWordNo() {
        return WordNo;
    }

    public void setWordNo(String wordNo) {
        WordNo = wordNo;
    }

    public String getDemandDeptID() {
        return DemandDeptID;
    }

    public void setDemandDeptID(String demandDeptID) {
        DemandDeptID = demandDeptID;
    }

    public String getDeptID() {
        return DeptID;
    }

    public void setDeptID(String deptID) {
        DeptID = deptID;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getTechStdNo() {
        return TechStdNo;
    }

    public void setTechStdNo(String techStdNo) {
        TechStdNo = techStdNo;
    }

    public String getItemModel() {
        return ItemModel;
    }

    public void setItemModel(String itemModel) {
        ItemModel = itemModel;
    }

    public String getItemModelMore() {
        return ItemModelMore;
    }

    public void setItemModelMore(String itemModelMore) {
        ItemModelMore = itemModelMore;
    }

    public double getQty() {
        return Qty;
    }

    public void setQty(double qty) {
        Qty = qty;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public String getPlannedCommencementDate() {
        return PlannedCommencementDate;
    }

    public void setPlannedCommencementDate(String plannedCommencementDate) {
        PlannedCommencementDate = plannedCommencementDate;
    }

    public String getIntendedCompletionDate() {
        return IntendedCompletionDate;
    }

    public void setIntendedCompletionDate(String intendedCompletionDate) {
        IntendedCompletionDate = intendedCompletionDate;
    }

    public String getSinglePerson() {
        return SinglePerson;
    }

    public void setSinglePerson(String singlePerson) {
        SinglePerson = singlePerson;
    }

    public String getSingleDate() {
        return SingleDate;
    }

    public void setSingleDate(String singleDate) {
        SingleDate = singleDate;
    }

    public int getChecked() {
        return Checked;
    }

    public void setChecked(int checked) {
        Checked = checked;
    }

    public String getAuditor() {
        return Auditor;
    }

    public void setAuditor(String auditor) {
        Auditor = auditor;
    }

    public String getAuditTime() {
        return AuditTime;
    }

    public void setAuditTime(String auditTime) {
        AuditTime = auditTime;
    }

    public String getApprover() {
        return Approver;
    }

    public void setApprover(String approver) {
        Approver = approver;
    }

    public String getApproveTime() {
        return ApproveTime;
    }

    public void setApproveTime(String approveTime) {
        ApproveTime = approveTime;
    }

    public String getContractNote() {
        return ContractNote;
    }

    public void setContractNote(String contractNote) {
        ContractNote = contractNote;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getBillNo() {
        return BillNo;
    }

    public void setBillNo(String billNo) {
        BillNo = billNo;
    }

    public String getProcessProcedureCode() {
        return ProcessProcedureCode;
    }

    public void setProcessProcedureCode(String processProcedureCode) {
        ProcessProcedureCode = processProcedureCode;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getPCPoint() {
        return PCPoint;
    }

    public void setPCPoint(String PCPoint) {
        this.PCPoint = PCPoint;
    }

    public String getConventionalAllowance() {
        return ConventionalAllowance;
    }

    public void setConventionalAllowance(String conventionalAllowance) {
        ConventionalAllowance = conventionalAllowance;
    }
}
