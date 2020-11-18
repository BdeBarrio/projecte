import java.util.Scanner;

public class Proyecte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcio, x = 0;
        String usuari, contra;

        String array[][] = new String[10][2];

        System.out.println("################################");
        System.out.println("Benvinguts al forum de BdeBarrio");
        System.out.println("################################");
        System.out.println();

        boolean opcions = true;
        while (opcions) {
            System.out.println();
            System.out.println("Que vols fer?\n" +
                    "1. Registrar-te\n" +
                    "2. Iniciar sessió\n" +
                    "3. Sortir");
            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
                case 1:
                    System.out.println("Enregistrament:");
                    System.out.println("------------------------");
                    System.out.print("Indica el nom de usuari: ");
                    usuari = sc.nextLine();
                    System.out.print("Indica la contrasenya: ");
                    contra = sc.nextLine();
                    System.out.println();
                    array [x][0] = usuari;
                    array [x][1] = contra;
                    x++;
                    break;
                case 2:
                    boolean validació=true;
                    while (validació) {
                        System.out.println("Inici de sessió:");
                        System.out.println("----------------");
                        System.out.println();
                        System.out.print("Introdueix l'usuari:");
                        usuari = sc.nextLine();
                        System.out.print("Introdueix la contrasenya:");
                        contra = sc.nextLine();


                        for (int i = 0; i < array.length; i++) {
                            if (usuari.equalsIgnoreCase(array[i][0])) {
                                if (contra.equalsIgnoreCase(array[i][1])) {
                                    System.out.println("Has iniciat sessió. Benvingut " + usuari);
                                    validació = false;
                                } else {
                                    System.out.println("La contrasenya no és correcta. Torna a provar. ");
                                    System.out.println();
                                }

                            }
                        }
                    }




                    break;

                default:
                    System.out.println("Aquesta opció no es valida torna a indicar-la.");
                    break;

            }

        }
    }
}
