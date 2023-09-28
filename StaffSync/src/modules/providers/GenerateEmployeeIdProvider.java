package modules.providers;

public class GenerateEmployeeIdProvider {
    private static int id = 0;

    public static synchronized String generateId() {
        return String.valueOf(id++);
    }
}
