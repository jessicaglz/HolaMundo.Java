public class WhileLoop{

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight();

        int aux=0;
        while (isTurnOnLight&&aux<=10){
            printSOS();
            aux++;
        }

    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}