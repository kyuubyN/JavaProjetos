/*Somente testando como funciona o Java (Se parece bastante com linguagem C, achei isso incrivel)*/ 
import java.util.Scanner;

public class First {
    public static void main(String[] arg) throws Exception {
        System.out.println("Olá");
        int numero = 10;
        if (numero > 1) {
            System.out.println("Você tem um numero maior do que 1");
        } else {
            System.out.println("Você tem um numero menor ou igual a 1");
        }
        for (int i = 1; i < numero; i++) {
            System.out.println(i);
        }

        Scanner a = new Scanner(System.in);
        int num;
        do { 
            System.out.print("Insira um numero:");
            num = a.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("\nFuncionou !!!\n");
                    break;
                }
                case 2 -> {
                    System.out.println("\nFuncionou !!!\n");
                    break;
                }
                default -> {
                    System.out.println("\nNumero errado");
                    break;
                }
            }
            
        } while (num != 0);
        if (num == 0) {
            System.out.print("Encerrando\n\n");
        }

        String primeiroNome = "Jorge ";
        String segundoNome = "Oliveira";

        String nomeCompleto = teste(primeiroNome, segundoNome);
        System.out.printf("Seu nome é %s\n", nomeCompleto);
        
    }

    public static String teste(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(segundoNome);
    }
}
