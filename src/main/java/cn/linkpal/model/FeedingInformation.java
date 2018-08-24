package cn.linkpal.model;

public class FeedingInformation {

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
    /// 行号
    /// </summary>
    private long FEntryID ;

    /// <summary>
    /// 物料来源方式
    /// </summary>
    private String MaterialSourceMode ;

    /// <summary>
    /// 物料来源单位
    /// </summary>
    private String MaterialSourceUnit ;

    /// <summary>
    ///  K/3物料代码
    /// </summary>
    private String K3MaterialCode ;

    /// <summary>
    ///  物料名称
    /// </summary>
    private String MaterialName ;

    /// <summary>
    ///  规格型号
    /// </summary>
    private String Specifications ;

    /// <summary>
    ///  补充规格
    /// </summary>
    private String SupplementarySpec ;

    /// <summary>
    ///  牌号
    /// </summary>
    private String BrandName ;

    /// <summary>
    ///  锭号
    /// </summary>
    private String IngotNo ;

    /// <summary>
    ///  节号
    /// </summary>
    private String SectionNo ;

    /// <summary>
    ///  批号
    /// </summary>
    private String BatchNo ;

    /// <summary>
    ///  质证书编号
    /// </summary>
    private String QCertNo ;

    /// <summary>
    ///  数量
    /// </summary>
    private double Qty ;

    /// <summary>
    ///  重量
    /// </summary>
    private double Weight ;

    /// <summary>
    ///  投料重量
    /// </summary>
    private double FeedingWeight ;

    /// <summary>
    /// 备注
    /// </summary>
    private String Comment ;

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

    public long getFEntryID() {
        return FEntryID;
    }

    public void setFEntryID(long FEntryID) {
        this.FEntryID = FEntryID;
    }

    public String getMaterialSourceMode() {
        return MaterialSourceMode;
    }

    public void setMaterialSourceMode(String materialSourceMode) {
        MaterialSourceMode = materialSourceMode;
    }

    public String getMaterialSourceUnit() {
        return MaterialSourceUnit;
    }

    public void setMaterialSourceUnit(String materialSourceUnit) {
        MaterialSourceUnit = materialSourceUnit;
    }

    public String getK3MaterialCode() {
        return K3MaterialCode;
    }

    public void setK3MaterialCode(String k3MaterialCode) {
        K3MaterialCode = k3MaterialCode;
    }

    public String getMaterialName() {
        return MaterialName;
    }

    public void setMaterialName(String materialName) {
        MaterialName = materialName;
    }

    public String getSpecifications() {
        return Specifications;
    }

    public void setSpecifications(String specifications) {
        Specifications = specifications;
    }

    public String getSupplementarySpec() {
        return SupplementarySpec;
    }

    public void setSupplementarySpec(String supplementarySpec) {
        SupplementarySpec = supplementarySpec;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getIngotNo() {
        return IngotNo;
    }

    public void setIngotNo(String ingotNo) {
        IngotNo = ingotNo;
    }

    public String getSectionNo() {
        return SectionNo;
    }

    public void setSectionNo(String sectionNo) {
        SectionNo = sectionNo;
    }

    public String getBatchNo() {
        return BatchNo;
    }

    public void setBatchNo(String batchNo) {
        BatchNo = batchNo;
    }

    public String getQCertNo() {
        return QCertNo;
    }

    public void setQCertNo(String QCertNo) {
        this.QCertNo = QCertNo;
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

    public double getFeedingWeight() {
        return FeedingWeight;
    }

    public void setFeedingWeight(double feedingWeight) {
        FeedingWeight = feedingWeight;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}
