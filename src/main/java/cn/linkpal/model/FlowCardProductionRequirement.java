package cn.linkpal.model;

public class FlowCardProductionRequirement  {

    private long Id ;
    /// <summary>
    /// 流转卡Id
    /// </summary>
    private long CardId ;

    /// <summary>
    ///流转卡编号
    /// </summary>
    private String CardNo ;

    /// <summary>
    /// 生产需求编号
    /// </summary>
    private String WorkNo ;

    /// <summary>
    /// 合同号
    /// </summary>
    private String ContractNo ;

    /// <summary>
    /// 签定部门Id
    /// </summary>
    private long IdentifyDeptID ;

    /// <summary>
    /// 签定部门代码
    /// </summary>
    private String IdentifyDeptNumber ;

    /// <summary>
    /// 签定部门名称
    /// </summary>
    private String IdentifyDeptName ;

    /// <summary>
    /// 生产分厂Id
    /// </summary>
    private long DeptID ;

    /// <summary>
    /// 生产分厂代码
    /// </summary>
    private String DeptNumber ;

    /// <summary>
    /// 生产分厂名称
    /// </summary>
    private String DeptName ;

    /// <summary>
    /// 技术条件
    /// </summary>
    private String TechStdNo ;

    /// <summary>
    /// 产品代码
    /// </summary>
    private String ItemNumber ;

    /// <summary>
    /// 产品名称
    /// </summary>
    private String ItemName ;

    /// <summary>
    /// 产品全名
    /// </summary>
    private String ItemFullName ;

    /// <summary>
    /// MES物料ID
    /// </summary>
    private long MESItemID ;

    /// <summary>
    /// MES物料编码
    /// </summary>
    private String MESItemNumber ;

    /// <summary>
    /// MES物料名称
    /// </summary>
    private String MESItemName ;

    /// <summary>
    /// 产品规格
    /// </summary>
    private String ItemModel ;

    /// <summary>
    /// 牌号
    /// </summary>
    private String BrandName ;


    /// <summary>
    /// 产品类型
    /// </summary>
    private String ItemType ;

    /// <summary>
    /// 补充规格
    /// </summary>
    private String ItemModelMore ;

    /// <summary>
    /// 数量
    /// </summary>
    private double Qty ;

    /// <summary>
    /// 数量单位
    /// </summary>
    private String QtyUnit ;

    /// <summary>
    /// 重量
    /// </summary>
    private double Weight ;

    /// <summary>
    /// 重量单位
    /// </summary>
    private String WeightUnit ;

    /// <summary>
    /// 交货日期
    /// </summary>
    private String DeliveryDate ;

    /// <summary>
    /// 合同备注
    /// </summary>
    private String ContractComment ;

    /// <summary>
    /// 备注
    /// </summary>
    private String Comment ;

    /// <summary>
    /// 产品ID
    /// </summary>
    private long ItemID ;



    /// <summary>
    /// 行号
    /// </summary>
    private int FEntryID ;



    /// <summary>
    /// 物料是否已经转换为MES物料
    /// </summary>
    private boolean HasTransfer ;

    /// <summary>
    /// 是否已经下达
    /// </summary>
    private boolean IsAssign ;

    /// <summary>
    /// 下达日期
    /// </summary>
    private String AssignDate ;

    /// <summary>
    /// 下达者
    /// </summary>
    private String Assigner ;

    /// <summary>
    /// 下达者ID
    /// </summary>
    private long AssignerID ;

    /// <summary>
    /// 是否已接受
    /// </summary>
    private boolean IsAccept ;

    /// <summary>
    /// 是否已经生成工艺卡片
    /// </summary>
    private boolean HasCreatedTechCard ;

    /// <summary>
    /// 计划开工日期
    /// </summary>
    private String PlanStartWorkDate ;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
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

    public String getWorkNo() {
        return WorkNo;
    }

    public void setWorkNo(String workNo) {
        WorkNo = workNo;
    }

    public String getContractNo() {
        return ContractNo;
    }

    public void setContractNo(String contractNo) {
        ContractNo = contractNo;
    }

    public long getIdentifyDeptID() {
        return IdentifyDeptID;
    }

    public void setIdentifyDeptID(long identifyDeptID) {
        IdentifyDeptID = identifyDeptID;
    }

    public String getIdentifyDeptNumber() {
        return IdentifyDeptNumber;
    }

    public void setIdentifyDeptNumber(String identifyDeptNumber) {
        IdentifyDeptNumber = identifyDeptNumber;
    }

    public String getIdentifyDeptName() {
        return IdentifyDeptName;
    }

    public void setIdentifyDeptName(String identifyDeptName) {
        IdentifyDeptName = identifyDeptName;
    }

    public long getDeptID() {
        return DeptID;
    }

    public void setDeptID(long deptID) {
        DeptID = deptID;
    }

    public String getDeptNumber() {
        return DeptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        DeptNumber = deptNumber;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getTechStdNo() {
        return TechStdNo;
    }

    public void setTechStdNo(String techStdNo) {
        TechStdNo = techStdNo;
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

    public String getItemFullName() {
        return ItemFullName;
    }

    public void setItemFullName(String itemFullName) {
        ItemFullName = itemFullName;
    }

    public long getMESItemID() {
        return MESItemID;
    }

    public void setMESItemID(long MESItemID) {
        this.MESItemID = MESItemID;
    }

    public String getMESItemNumber() {
        return MESItemNumber;
    }

    public void setMESItemNumber(String MESItemNumber) {
        this.MESItemNumber = MESItemNumber;
    }

    public String getMESItemName() {
        return MESItemName;
    }

    public void setMESItemName(String MESItemName) {
        this.MESItemName = MESItemName;
    }

    public String getItemModel() {
        return ItemModel;
    }

    public void setItemModel(String itemModel) {
        ItemModel = itemModel;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String itemType) {
        ItemType = itemType;
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

    public String getQtyUnit() {
        return QtyUnit;
    }

    public void setQtyUnit(String qtyUnit) {
        QtyUnit = qtyUnit;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public String getWeightUnit() {
        return WeightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        WeightUnit = weightUnit;
    }

    public String getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        DeliveryDate = deliveryDate;
    }

    public String getContractComment() {
        return ContractComment;
    }

    public void setContractComment(String contractComment) {
        ContractComment = contractComment;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public long getItemID() {
        return ItemID;
    }

    public void setItemID(long itemID) {
        ItemID = itemID;
    }

    public int getFEntryID() {
        return FEntryID;
    }

    public void setFEntryID(int FEntryID) {
        this.FEntryID = FEntryID;
    }

    public boolean isHasTransfer() {
        return HasTransfer;
    }

    public void setHasTransfer(boolean hasTransfer) {
        HasTransfer = hasTransfer;
    }

    public boolean isAssign() {
        return IsAssign;
    }

    public void setAssign(boolean assign) {
        IsAssign = assign;
    }

    public String getAssignDate() {
        return AssignDate;
    }

    public void setAssignDate(String assignDate) {
        AssignDate = assignDate;
    }

    public String getAssigner() {
        return Assigner;
    }

    public void setAssigner(String assigner) {
        Assigner = assigner;
    }

    public long getAssignerID() {
        return AssignerID;
    }

    public void setAssignerID(long assignerID) {
        AssignerID = assignerID;
    }

    public boolean isAccept() {
        return IsAccept;
    }

    public void setAccept(boolean accept) {
        IsAccept = accept;
    }

    public boolean isHasCreatedTechCard() {
        return HasCreatedTechCard;
    }

    public void setHasCreatedTechCard(boolean hasCreatedTechCard) {
        HasCreatedTechCard = hasCreatedTechCard;
    }

    public String getPlanStartWorkDate() {
        return PlanStartWorkDate;
    }

    public void setPlanStartWorkDate(String planStartWorkDate) {
        PlanStartWorkDate = planStartWorkDate;
    }
}
