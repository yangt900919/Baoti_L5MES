package cn.linkpal.model;

public class CardAttachment  {

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
    /// 附件名称
    /// </summary>
    private String AttachmentName ;

    /// <summary>
    /// 附件类型
    /// </summary>
    private String AttachmentType ;

    /// <summary>
    /// 关联工序
    /// </summary>
    private String ReferToProcess ;

    /// <summary>
    /// 文件内容
    /// </summary>
    private String Attachment ;

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

    public String getAttachmentName() {
        return AttachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        AttachmentName = attachmentName;
    }

    public String getAttachmentType() {
        return AttachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        AttachmentType = attachmentType;
    }

    public String getReferToProcess() {
        return ReferToProcess;
    }

    public void setReferToProcess(String referToProcess) {
        ReferToProcess = referToProcess;
    }

    public String getAttachment() {
        return Attachment;
    }

    public void setAttachment(String attachment) {
        Attachment = attachment;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}
