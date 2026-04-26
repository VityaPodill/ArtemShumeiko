import java.util.Arrays;

public class ACER_1 implements FirstInterFace {
    public static void main(String[] args) {
        int ACER_11 = 1;
        int ACER_2 = 222;

        int ACER_3 = 333;
        System.out.println(ACER_11 + ACER_2 + ACER_3);

        String NEW_REVERT_TEST = "1 commit";
        System.out.println(NEW_REVERT_TEST);

        String ACER_MERGE_1 = "1 commit";
        System.out.println(ACER_MERGE_1);

        int a = 1;
        int b = 2;
        System.out.println(a + b);

        String From_HP = "HP";
        System.out.println(From_HP);

        int c = 333;
        int d = 4;
        int e = 5;
        System.out.println(a + b + c + d + e);
        //  GitHub ---------------------
        System.out.println(" ACER ==========================");
        //  HP +++++++++++++++++++

        int[] arr = {13, 11, 7, 6, 5, 4, 2};
        int t;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] > arr[k]) {
                    t = arr[i];
                    arr[i] = arr[k];
                    arr[k] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // Hello FORM ACER new Windows
    @Override
    public void first(int a) {
        System.out.println(a - 3);
    }
}
