import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListTest {

        public static void main(String[] args) {
                boolean runProgram = true;


        Scanner scan = new Scanner(System.in);
        ArrayList<String> serier = new ArrayList<String>();

        while (runProgram) {

                /*System.out.println("1. Lägg till favoritserie");
                System.out.println("2. Ta bort serie");
                System.out.println("3. Visa favoritserier");
                System.out.println("4. Avsluta program");

                */

                meny();
                int menyVal = scan.nextInt();

                switch (menyVal) {
                        case 1:
                                System.out.println("Vilken serie vill du lägga till?");
                                serier.add(scan.next());
                                break;
                        case 2:
                                System.out.println("Vilken serie vill du ta bort?");
                                serier.remove(scan.next());
                                break;
                        case 3:
                                System.out.println(serier);
                                break;
                        case 4:
                                System.out.println("Programmet avslutas");
                                runProgram = false;
                                break;
                        default:
                                System.out.println("Felaktigt menyval, försök igen!");

                }
        }

        }

        public static void meny() {
                System.out.println("1. Lägg till favoritserie");
                System.out.println("2. Ta bort serie");
                System.out.println("3. Visa favoritserier");
                System.out.println("4. Avsluta program");
        }

       /* public static String läggTill () {
                System.out.println("Vilken serie vill du lägga till?");


        }

        */







        }

