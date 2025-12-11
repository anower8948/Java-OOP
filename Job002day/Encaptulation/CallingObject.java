package job002day.Encaptulation;

public class CallingObject {
    public static void main(String[] args) {
        LockedObject lock1 = new LockedObject();
        LockedObject lock2 = new LockedObject();

        System.out.println("Lock1: "+ lock1.name);
        System.out.println("Lock2: "+ lock2.name);
        System.out.println("Lock1: "+ lock1.getLockpass());
        lock1.setLockpass(2003);
        System.out.println("Lock1: "+ lock1.getLockpass());
        lock1.getEverything();
        lock1.setLockaddress("Savar Dhaka");
        System.out.println(lock1.getLockaddress());
    }
}
