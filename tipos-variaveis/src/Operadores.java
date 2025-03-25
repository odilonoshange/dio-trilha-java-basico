public class Operadores {
    public static void main(String[] args)
    {
        //Operador ternário:
        
        int a, b;

        a = 5;
        b = 3;

        if (a == b)
        {
            System.out.println("Verdadeiro.");
        }
        else
        {
            System.out.println("Falso.");
        }



        String resultado = (a == b ? "Verdadeiro." : "Falso.");

        System.out.println(resultado);


    }
}