
package nameanddate;

import java.util.Scanner;

public class Nameanddate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("��� ��� �����: ");
        String name = scanner.nextLine ();
        System.out.print ("���� �������: ");
        String sername = scanner.nextLine ();
        System.out.print("������� �����: ");
        int month = scanner.nextInt ();
        System.out.print ("������� ���: ");
        int year = scanner.nextInt();
        System.out.println("������� ����: ");
        int days = scanner.nextInt();
        System.out.printf(name + " " +  sername + " ������� " + days + " " + month+ " " + year   + " ���� ");       
        
        

    }
    
}
