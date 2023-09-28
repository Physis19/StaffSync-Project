package modules.providers;

public class GenerateSectorIdProvider {
    private static int id = 0;

    public static synchronized String generateId() {
        return String.valueOf(id++);
    }
}
