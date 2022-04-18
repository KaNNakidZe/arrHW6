package KaNNaT.first;

import java.util.Arrays;

public class Main<arr> {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Наш массив");
        System.out.println(Arrays.toString(arr));

        // Task # 1

        float allMoney = 0;
        for (int i : arr) {
            allMoney += i;
        }
        System.out.println("Сумма трат за месяц составила " + allMoney + " рублей");

        // Task # 2

        int minMoney = arr[0];
        int maxMoney = arr[0];
        for (int i : arr) {
            if (i > maxMoney) {
                maxMoney = i;
            }
            if (minMoney > i) {
                minMoney = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minMoney + " рублей \n" +
                "Максимальная сумма трат за день составила " + maxMoney + " рублей");

        // Task # 3

        float averageSum;
        averageSum = allMoney / arr.length;
        System.out.println("Средняя сумма трат за один месяц составила " + averageSum + " рублей");

        // Task # 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
