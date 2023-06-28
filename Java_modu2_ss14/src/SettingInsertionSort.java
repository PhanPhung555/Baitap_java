import java.util.Arrays;

public class SettingInsertionSort {
    public static void main(String[] args) {
        int[] num = {1,4,5,2,3,79,5,3,12,10};
        insertionSort(num);
    }
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > current) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = current;
        }
        System.out.println(Arrays.toString(list));
    }
}
