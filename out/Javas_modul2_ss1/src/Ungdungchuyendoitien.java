import java.util.Scanner;

public class Ungdungchuyendoitien {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Nhap USD : ");
        int a = num.nextInt();
        System.out.println("Tong so vnd : " + (a * 23000) + "VND");
    }
}
