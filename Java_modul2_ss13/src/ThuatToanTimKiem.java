import java.util.Arrays;

public class ThuatToanTimKiem {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 1, 6, 4};
        bubbleSort(num);
        System.out.println(binarySearch(num, 3, 0, num.length - 1));
    }

    public static void bubbleSort(int[] num) {
        boolean check = true;
        for (int i = 0; i < num.length; i++) {
            check = false;
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    check = true;
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(num));
    }


    public static int binarySearch(int[] num, int k, int left, int right) {
        if (right >= left) {

            int mid = (left + right) / 2;

            if (k == num[mid]) {
                return mid;
            }

            if (k > num[mid]) {
                return binarySearch(num, k, mid + 1, right);
            }
            return binarySearch(num, k, left, mid - 1);
        }
        return -1;
    }


}
