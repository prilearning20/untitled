package Listeners;

public class ReportBase {
    public static final ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
    public static void statTrans(){
        threadLocal.set(100);
    }

}