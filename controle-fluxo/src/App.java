import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try
        {
            
        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println("Digite a sua altura:");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println("Olá meu nome é: "+nome.toUpperCase()+" "+sobrenome.toUpperCase()+".");
        System.out.println("Tenho "+idade+", anos de idade.");
        System.out.println("Minha altura é "+altura+".");
        scanner.close();

        } 
        catch (InputMismatchException e)
        {
            System.err.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
