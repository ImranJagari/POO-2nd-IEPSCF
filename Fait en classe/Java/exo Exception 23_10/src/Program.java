import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            int val = scanner.nextInt();

            if(val == 0)
                throw new Exception("Vous ne pouvez pas diviser par 0.");

            System.out.println(val);
        }catch(Exception e){

            System.out.println(e);
        }
    }
}

