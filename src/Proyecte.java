import java.util.Scanner;

public class Proyecte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio;

        System.out.println("################################");
        System.out.println("Benvinguts al forum de BdeBarrio");
        System.out.println("################################");
        System.out.println();

        boolean opcions= true;
        while(opcions){
            System.out.println("Que vols fer?\n" +
                    "1. Registrar-te\n" +
                    "2. Iniciar sessió\n" +
                    "3. Sortir");
            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio){
                case 1:
                    System.out.println("Indica el nom de usuari");

                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Has sortit del programa.");
                    opcions=false;
                    break;
                default:
                    System.out.println("Aquesta opció no es valida torna a indicar-la.");
                    break;
            }

        }






    }
}
