package app;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            String[] names = {
                "Ilham", "Kece", "abiss"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            // StackTraceElement[] stackTraceElements =  throwable.getStackTrace();
            throwable.printStackTrace();
        }
    }
}
