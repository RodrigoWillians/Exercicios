
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, a = 0, b = 1, c;
        boolean pertence = false;
    
        System.out.print("Informe um número inteiro: ");
        num = input.nextInt();
        
        while (a <= num) {
            if (a == num) {
                pertence = true;
                break;
            }
            
            c = a + b;
            a = b;
            b = c;
        }
        
        if (pertence) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
        
        input.close();
    }
}