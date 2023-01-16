public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        //devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));
        //devuelve un entero hacia abajo
        System.out.println(Math.floor(x));
        //devuelve un numero elevado a otro numero
        System.out.println(Math.pow(x,y));
        //cual es el valor mas alto o mayor
        System.out.println(Math.max(x,y));
        //devuelve la raiz cuadrada de un numero
        System.out.println(Math.sqrt(y));
        //area un circulo pi*r^2
        System.out.println(Math.PI * Math.pow(y,2));
        //area de una esfera 4*PI*r^2
        System.out.println(4 * Math.PI * Math.pow(y,2));
        //Volumen de una esfera 4*PI*r^2
        System.out.println(4/3 * Math.PI * Math.pow(y,3));
    }
}
