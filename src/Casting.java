public class Casting {
    public static void main(String[] args) {

        double monthyDog = (30.0 / 2.0);

        // Estimacion
        int estimaredMonthyDogs = (int) monthyDog;
        System.out.println(estimaredMonthyDogs);

        // Explicacion: Cuando queremos tener un numero entero con estimacion teniendo decimales
        // Es recomendable utilizar el int para casterar el valor, para tener un valor exacto
        // Ejemplo de casting
        // Con double: double numero = 1.23232323232;
        // Con casting: int numero_two = (int) numero;
        // Resultado: 1


        // Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        // Si queremos saber el valor exacto de una poneracion es recomendable utilizar double para
        // obtener resultado con decimales

        //Casteo entre tipo de datos
        double c = (double) a/b;
        System.out.println(c);

        // CASTING DE CHAR IMPLICITO
        char n = '1';
        int nI = n;
        System.out.println("CASTING DE CHAR IMPLICITO: "+ nI);

        // CASTING DE CHAR EXPLICITO
        char n2 = '1';
        short ns = (short) n2;
        System.out.println("CASTING DE CHAR EXPLICITO: "+ ns);


    }
}