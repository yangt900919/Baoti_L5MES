package cn.linkpal.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class BaseModel {

    private boolean isDeleted;

    private int deleterUserId;

    private String deletionTime;

    private String lastModificationTime;

    private int lastModifierUserId;

    private String creationTime;

    private int creatorUserId;

    private int id;

    BaseModel ()
    {
        this.isDeleted=false;

        this.deleterUserId=0;
        this.deletionTime=null;
        this.lastModificationTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.creationTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.id=0;
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
