import java.util.Scanner;

public class Inversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "/" + array.length + " Digite um número: ");
            array[i] = scanner.nextInt();
        }
        show(array);
        invert(array);
    }
    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void invert(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
