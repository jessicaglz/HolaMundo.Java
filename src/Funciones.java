public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        //pi * r2

        circleArea(y);
        System.out.println(circleArea(y));

        //Area de una esfera
        //4*PI*r2
        sphereArea(y);
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //(4/3)*pi * r3
        sphereVolumen(y);
        System.out.println(sphereVolumen(y));

        System.out.println("Pesos a dolares: " + convertToDolar(1000, "COP"));
    }


    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolumen(double r) {
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    public static double convertToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.049;
                break;
            case "COP":
                quantity = quantity * 0.00023;
                break;
        }

        return quantity;
        /**
         * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares.
         *
         * @param quantity Cantidad de dinero
         * @param currency Tipo de Moneda: solo MXN, COP o ARS
         * @return quantity Cantidad actualizada en USD
         * */
    }
}