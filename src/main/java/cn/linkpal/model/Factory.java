package cn.linkpal.model;

public class Factory {

    private int id;

    private String displayName;

    private String code;

    private String note ;


    public Factory(int id,String displayName,String code,String note)
    {
        this.id=id;
        this.displayName=displayName;
        this.code=code;
        this.note=note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
