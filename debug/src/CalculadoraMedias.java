import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        String [] alunos = {"Odilon", "Luan", "Lú", "Kayla"};

        int media = calcularMediaTurma(alunos, scanner);
        System.out.println("A média da turma é: "+media);
    }

    static int calcularMediaTurma(String [] alunos, Scanner scanner)
    {

        int soma = 0;

        for (String aluno : alunos)
        {
            System.out.println(aluno+"\nNota:");
            int nota = scanner.nextInt();
            soma += nota;
        }

        return (soma / alunos.length);
    }
}
