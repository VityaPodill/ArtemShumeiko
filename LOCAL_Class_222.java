public class LOCAL_Class_222 {
    public static void main(String[] args) {
        String c = "qwerty", result = "";
        for (int i = c.length() - 1; i >= 0; i--)
            result += c.substring(i, i + 1);
        System.out.println(result);
    }
}
