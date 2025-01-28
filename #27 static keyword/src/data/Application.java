package data;

public class Application {
    public static final int PROCESSORS;
    // block static
    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
