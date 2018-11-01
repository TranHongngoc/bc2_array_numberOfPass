import java.util.Scanner;

public class NumberOfStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int[]array;
        do {
            System.out.println("Enter the number of stuent: ");
            num = scanner.nextInt();
            if (num>30) System.out.println("Maximun of student is 30.");
        }while (num >30);

        array = new int[num];

        for (int i = 0; i<num; i++){
            System.out.println("Enter the score of student " + (i+1) + " :");
            array[i] = scanner.nextInt();
        }
        int count = 0;

        for (int i = 0; i< array.length;i++){
            if (array[i] > 5){
                count += 1;
            }
        }
        System.out.println("The number students of pass is:" + count);

    }
}
