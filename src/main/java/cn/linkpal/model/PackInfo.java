package cn.linkpal.model;

public class PackInfo {

    /// <summary>
    /// 箱号
    /// </summary>
    public String PackNo ;
    /// <summary>
    /// 包装方式
    /// </summary>
    public String PackType ;
    /// <summary>
    /// 工艺卡ID
    /// </summary>
    public long CardId ;
    /// <summary>
    /// 工艺卡号
    /// </summary>
    public String CardNo ;
    /// <summary>
    /// 生产任务ID
    /// </summary>
    public long WorkID ;
    /// <summary>
    /// 生产任务编号
    /// </summary>
    public String WorkNo ;
    /// <summary>
    /// 包装数量
    /// </summary>
    public double Qty ;
    /// <summary>
    /// 包装重量
    /// </summary>
    public double Weight ;
    /// <summary>
    /// 摆放区号
    /// </summary>
    public String PositionNo ;
    /// <summary>
    /// 包装时间
    /// </summary>
    public String PackTime ;
    /// <summary>
    /// 包装汇报人
    /// </summary>
    public String PackUser ;
    /// <summary>
    /// 完工人班组
    /// </summary>
    public String PackUserTeam ;
    /// <summary>
    /// 备注
    /// </summary>
    public String Comment ;
    /// <summary>
    /// 分厂ID
    /// </summary>
    public long FactId ;
    /// <summary>
    /// 分厂名
    /// </summary>
    public String FactName ;
    /// <summary>
    /// 班组ID
    /// </summary>
    public long TeamId ;
    /// <summary>
    /// 班组名
    /// </summary>
    public String TeamName ;
    /// <summary>
    /// 车间ID
    /// </summary>
    public long DeptId ;
    /// <summary>
    /// 车间名
    /// </summary>
    public String DeptName ;

    /// <summary>
    /// 合同号
    /// </summary>
    public String ContractNo ;

    /// <summary>
    /// 产品名称
    /// </summary>
    public String ProductName ;

    /// <summary>
    /// 规格
    /// </summary>
    public String SPEC ;

    /// <summary>
    /// 牌号
    /// </summary>
    public String BrandName ;

    /// <summary>
    /// 标准
    /// </summary>
    public String TechStdNo ;

    /// <summary>
    /// 补充规格
    /// </summary>
    public String ItemModelMore ;

    /// <summary>
    /// 状态
    /// </summary>
    public int Status ;


    public PackInfo()
    {
        //this.PackNo="";
        /*this.Weight=0;
        this.Qty=0;*/
       /* this.QACheckTime=null;
        this.QACheckUser=null;
        this.BeginTime=null;
        this.BeginUser=null;
        this.BeginUserTeam=null;
        *//*  this.Id=0;*//*
        this.CardLineNo=0;*/

    }

    public String getPackNo() {
        return PackNo;
    }

    public void setPackNo(String packNo) {
        PackNo = packNo;
    }

    public String getPackType() {
        return PackType;
    }

    public void setPackType(String packType) {
        PackType = packType;
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

    public long getWorkID() {
        return WorkID;
    }

    public void setWorkID(long workID) {
        WorkID = workID;
    }

    public String getWorkNo() {
        return WorkNo;
    }

    public void setWorkNo(String workNo) {
        WorkNo = workNo;
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

    public String getPositionNo() {
        return PositionNo;
    }

    public void setPositionNo(String positionNo) {
        PositionNo = positionNo;
    }

    public String getPackTime() {
        return PackTime;
    }

    public void setPackTime(String packTime) {
        PackTime = packTime;
    }

    public String getPackUser() {
        return PackUser;
    }

    public void setPackUser(String packUser) {
        PackUser = packUser;
    }

    public String getPackUserTeam() {
        return PackUserTeam;
    }

    public void setPackUserTeam(String packUserTeam) {
        PackUserTeam = packUserTeam;
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

    public String getContractNo() {
        return ContractNo;
    }

    public void setContractNo(String contractNo) {
        ContractNo = contractNo;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getSPEC() {
        return SPEC;
    }

    public void setSPEC(String SPEC) {
        this.SPEC = SPEC;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getTechStdNo() {
        return TechStdNo;
    }

    public void setTechStdNo(String techStdNo) {
        TechStdNo = techStdNo;
    }

    public String getItemModelMore() {
        return ItemModelMore;
    }

    public void setItemModelMore(String itemModelMore) {
        ItemModelMore = itemModelMore;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
