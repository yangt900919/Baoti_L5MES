package cn.linkpal.model;

public class UserInfo {

    private int UserID;

    private String Username;

    private int FactID;//所在分厂

    private String FactName;

    private int DeptID;//所在车间

    private String DeptName;

    private int TeamID;//所在班组

    private String TeamName;


    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getFactID() {
        return FactID;
    }

    public void setFactID(int factID) {
        FactID = factID;
    }

    public String getFactName() {
        return FactName;
    }

    public void setFactName(String factName) {
        FactName = factName;
    }

    public int getDeptID() {
        return DeptID;
    }

    public void setDeptID(int deptID) {
        DeptID = deptID;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public int getTeamID() {
        return TeamID;
    }

    public void setTeamID(int teamID) {
        TeamID = teamID;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }
}
