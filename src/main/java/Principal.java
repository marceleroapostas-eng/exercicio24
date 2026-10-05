import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
Scanner leitor = new
        Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = leitor.nextLine();
        
        System.out.println("Digite um numero; ");
        int numero = leitor.nextInt();
        
        int i = 0;
        
        
        while (i < numero) {
            System.out.println(frase);
            i++;
        }
    }
}
