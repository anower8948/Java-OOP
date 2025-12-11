package job002day.Encaptulation;

public class LockedObject {
    public String name = "GoponTottoh";
    private int lockpass = 1234;
    private String lockname = "LockedObject";
    private String lockaddress = "LockedObject Address";
    private String lockphone = "LockedObject Phone";

    public int getLockpass(){
        return this.lockpass;
    }
    public String getLockname(){
        return this.lockname;
    }
    public String getLockaddress(){
        return this.lockaddress;
    }
    public String getLockphone(){
        return this.lockphone;
    }
    public void getEverything(){
        System.out.println("Lockpass: " + this.lockpass);
        System.out.println("Lockname: " + this.lockname);
        System.out.println("Lockaddress: " + this.lockaddress);
        System.out.println("Lockphone: " + this.lockphone);
    }
    public void setLockpass(int lockpass){
        this.lockpass = lockpass;
    }
    public void setLockname(String lockname){
        this.lockname = lockname;
    }
    public void setLockaddress(String lockaddress){
        this.lockaddress = lockaddress;
    }
    public void setLockphone(String lockphone){
        this.lockphone = lockphone;
    }
    public void setEverything(int lockpass, String lockname, String lockaddress, String lockphone){
        this.lockpass = lockpass;
        this.lockname = lockname;
        this.lockaddress = lockaddress;
        this.lockphone = lockphone;
    }

}
