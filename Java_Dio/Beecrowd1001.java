/* Arquivo utilizado para fazer um exercicio basico do beecrowd */
import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1001 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int soma = A + B;
        System.out.printf("X = %d\n", soma);
        

        
        String primeiroNome = "Jorge ";
        String segundoNome = "Oliveira";

        String nomeCompleto = First.teste(primeiroNome, segundoNome);
        System.out.printf("Seu nome é %s\n", nomeCompleto);
    }
}