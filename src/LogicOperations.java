public class LogicOperations
{
    public static void main(String[] args)
    {
        int a = 8;
        int b = 5;

        //Operadores de Asignacion
        System.out.println("a es igual a b -->" + (a == b));
        System.out.println("a es diferente a b -->" + (a != b));

        //Operadores Relacionales
        System.out.println("a es menor que b -->" + (a<b));
        System.out.println("a es mayor que b -->" + (a>b));
        System.out.println("a es menor o igual que b -->" + (a<=b));
        System.out.println("a es mayor o igual que b -->" + (a>=b));

        if ((a == b))
        {
            System.out.println("a es igual a b -->" + (a == b));
        } else
        {
            System.out.println("a es diferente a b -->" + (a != b));
        }

        if ((a<=b))
        {
            System.out.println("a es menor o igual que b -->" + (a<=b));
        } else
        {
            System.out.println("a es mayor o igual que b -->" + (a>=b));
        }

    }
}