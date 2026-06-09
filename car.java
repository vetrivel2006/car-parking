import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] parking = new String[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Vehicle Number: ");
                parking[i][j] = sc.next();
                System.out.println("Slot Booked");
            }
        }
        System.out.println("No Slot");
        System.out.print("Enter Vehicle Number to Exit: ");
        String search = sc.next();
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (parking[i][j].equals(search)) {
                    found = true;
                    System.out.println("Vehicle Found");
                    System.out.print("Enter Amount: ");
                    int amount = sc.nextInt();
                    System.out.println("Amount Paid: " + amount);
                    parking[i][j] = null; 
                    System.out.println("Vehicle Returned");
                }
            }
        }
        if (!found) {
            System.out.println("Invalid Number");
        }
    }
}