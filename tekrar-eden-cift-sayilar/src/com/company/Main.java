import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 7, 3, 3, 2, 8, 10, 21, 1, 32, 8, 1};
        int[] duplicates = new int[list.length];
        int duplicateCount = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j] && list[i] % 2 == 0 && !contains(duplicates, list[i], duplicateCount)) {
                    duplicates[duplicateCount] = list[i];
                    duplicateCount++;
                    break;
                }
            }
        }

        for (int i = 0; i < duplicateCount; i++) {
            System.out.println(duplicates[i]);
        }
    }

    static boolean contains(int[] arr, int value, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}

