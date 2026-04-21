@FunctionalInterface
public interface FirstInterFace {
    int A = 111;
    String B = "bb";

    void first(int a);

    static String second(String b) {
        return b + "---";
    }

    default int third(int a) {
        return a * a;
    }

    private int _4(int a) {
        return a + 100;
    }
}
