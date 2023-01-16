public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        System.out.println(lives); // 5

        lives --; //decremento
        System.out.println(lives); //4

        lives ++; //Incremento
        System.out.println(lives); //5

        // forma prefijaprefija
        // gana un regalo por ganar una vida
        int gitf = 100 + lives++;//forma postfija
        System.out.println(gitf);
        System.out.println(lives);

        gitf = 100 + ++lives;  // forma pretfija se ejecuta la suma primero
        System.out.println(gitf);
        System.out.println(lives);
    }
}