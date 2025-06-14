import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        boolean cont = true;
        Scanner sc = new Scanner (System.in);
        do {
            try {
                String sothutu = "";
                String regex = "^SE\\d{3}";
                System.out.println("Enter the string : ");
                sothutu = sc.nextLine();
                
                if (!sothutu.matches(regex)) {
                    throw new Exception();
                }
                System.out.println("The string is : " + sothutu);
                cont = false;
            }catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        }while (cont);
    }
    
}
