import java.util.Scanner;
import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        for (int age : ages) {
            count[age - minAge]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = new int[n];

        System.out.println("Enter student ages (between 10 and 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        countingSort(ages, 10, 18);

        System.out.println("Sorted Ages: " + Arrays.toString(ages));

        sc.close();
    }
}
