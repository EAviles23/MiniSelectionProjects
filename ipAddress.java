import java.sql.SQLOutput;
import java.util.Scanner;

public class ipAddress {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first octet: ");
        int octet1 = scan.nextInt();
        System.out.println("Please enter the second octet: ");
        int octet2 = scan.nextInt();
        System.out.println("Please enter the third octet: ");
        int octet3 = scan.nextInt();
        System.out.println("Please enter the fourth octet: ");
        int octet4 = scan.nextInt();

        if(octet1 <= 255 && octet1 >= 0 && octet2 <= 255 && octet2 >= 0 && octet3 <= 255 && octet3 >= 0 && octet4 <= 255 && octet4 >= 0) {
            System.out.println("IP Address: " + octet1 + "." + octet2 + "." + octet3 + "." + octet4);
        }
        if(octet1 > 255 || octet1 < 0){
            System.out.println("Octet 1 is incorrect");
        }
        if(octet2 > 255 || octet2 < 0){
            System.out.println("Octet 2 is incorrect");
        }
        if(octet3 > 255 || octet3 < 0){
            System.out.println("Octet 3 is incorrect");
        }
        if(octet4 > 255 || octet4 < 0){
            System.out.println("Octet 4 is incorrect");
        }
    }
}
