import java.util.Scanner;

public class Main {
    private final static String requiredName = "Вячеслав";
    private final static int[] arr = {1, 3, 7, 12, 8, 9};

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 1
        System.out.print("Введите цифру: ");
        int num = in.nextInt();
        first(num);

        // 2
        System.out.print("Введите имя: ");
        String name = in.next();
        second(name);

        // 3
        third(arr);

        // 4
        /*
        Скобочная последотельность [((())()(())]] неправильная,
        чтобы она стала правильной нужно заметь вторую в последовательности квадратную на круглую:
        [((())()(()))]
        */
    }

    public static void first(int num) {
        if (num > 7) {
            System.out.println("Привет");
        }
    }

    public static void second(String name) {
        if (name.equals(requiredName)) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void third(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
