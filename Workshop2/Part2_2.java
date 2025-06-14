
import java.util.Scanner;

public class Part2_2 {

    public String InputString() throws Exception {
        String sothutu = "";
        String regex = "^SE\\d{3}";
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string : ");
        sothutu = sc.nextLine();
        if (!sothutu.matches(regex)) {
            throw new Exception();
        }
        return sothutu;
    }

    public static void main(String[] args) {
        Part2_2 obj = new Part2_2();                                        //create a new clone of Part2_2. This clone include all method in Part2_2
        boolean cont = true;
        do {
            try {
                String sothutu = obj.InputString();                         //obj : call method "InpuString()" from object "obj"
                                                                            //Ex: you have a method "InputString()" in class Part2_2, you need a object to call that method.
                System.out.println("The string is : " + sothutu);
                cont = false;
            }catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        }while (cont);
    }
}
