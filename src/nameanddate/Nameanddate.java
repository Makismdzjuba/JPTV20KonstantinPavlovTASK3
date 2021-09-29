
package nameanddate;

import java.util.Scanner;

public class Nameanddate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("как вас зовут: ");
        String name = scanner.nextLine ();
        System.out.print ("¬аша фамили€: ");
        String sername = scanner.nextLine ();
        System.out.print("¬ведите мес€ц: ");
        int month = scanner.nextInt ();
        System.out.print ("¬ведите год: ");
        int year = scanner.nextInt();
        System.out.println("¬ведите день: ");
        int days = scanner.nextInt();
        System.out.printf(name + " " +  sername + " родилс€ " + days + " " + month+ " " + year   + " года ");       
        
        

    }
    
}
