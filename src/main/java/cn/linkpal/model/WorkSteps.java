package cn.linkpal.model;



public class WorkSteps {

    private String operNumber;

    private String operName;

    private String operDescription;

    private String  operType;

    private String deptName;

    private int deptID;

    private String deptNumber;

    private String comment;

    private boolean isMasterKey;

    private boolean whetherStartWorkReport;

    private boolean isQACheck;

    private boolean isDeleted;

    private int deleterUserId;

    private String deletionTime;

 private String lastModificationTime;

 private int lastModifierUserId;

 private String creationTime;

 private int creatorUserId;

 private int id;

    public String getOperNumber() {
        return operNumber;
    }

    public void setOperNumber(String operNumber) {
        this.operNumber = operNumber;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getOperDescription() {
        return operDescription;
    }

    public void setOperDescription(String operDescription) {
        this.operDescription = operDescription;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isMasterKey() {
        return isMasterKey;
    }

    public void setMasterKey(boolean masterKey) {
        isMasterKey = masterKey;
    }

    public boolean isWhetherStartWorkReport() {
        return whetherStartWorkReport;
    }

    public void setWhetherStartWorkReport(boolean whetherStartWorkReport) {
        this.whetherStartWorkReport = whetherStartWorkReport;
    }

    public boolean isQACheck() {
        return isQACheck;
    }

    public void setQACheck(boolean QACheck) {
        isQACheck = QACheck;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public int getDeleterUserId() {
        return deleterUserId;
    }

    public void setDeleterUserId(int deleterUserId) {
        this.deleterUserId = deleterUserId;
    }

    public String getDeletionTime() {
        return deletionTime;
    }

    public void setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
    }

    public String getLastModificationTime() {
        return lastModificationTime;
    }

    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    public int getLastModifierUserId() {
        return lastModifierUserId;
    }

    public void setLastModifierUserId(int lastModifierUserId) {
        this.lastModifierUserId = lastModifierUserId;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public int getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(int creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
