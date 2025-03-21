import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        Random RandOne = new Random();
        Random RandTwo = new Random();
        ArrayList Gator = new ArrayList();
        ArrayList ÄgdaGator = new ArrayList();
        Västerlånggatan gata1 = new Västerlånggatan();
        Hornsgatan gata2 = new Hornsgatan();
        SödraStation gata3 = new SödraStation();
        Folkkungagatan gata4 = new Folkkungagatan();
        Götgatan gata5 = new Götgatan();
        Ringvägen gata6 = new Ringvägen();
        StEriksgatan gata7 = new StEriksgatan();
        Elverket gata8 = new Elverket();
        Odengatan gata9 = new Odengatan();
        Valhallavägen gata10 = new Valhallavägen();
        Östrastation gata11 = new Östrastation();
        Sturegatan gata12 = new Sturegatan();
        Gator.add(gata1);
        Gator.add(gata2);
        Gator.add(gata3);
        Gator.add(gata4);
        Gator.add(gata5);
        Gator.add(gata6);
        Gator.add(gata7);
        Gator.add(gata8);
        Gator.add(gata9);
        Gator.add(gata10);
        Gator.add(gata11);
        Gator.add(gata12);
        boolean spel1 = true;
        boolean spel2 = true;
        int val;
        int RandOne_DiceOne = RandOne.nextInt(5);
        int RandTwo_DiceTwo = RandTwo.nextInt(5);
        int Steg = RandOne_DiceOne + RandTwo_DiceTwo - 1;
        while (spel1 == true) {
            System.out.println("Välkommen till monopol");
            System.out.println("Vad vill du göra\n1.Slå tärningarna");
            val = tangentbord.nextInt();
            if (val == 1) {
                System.out.println("Du fick " + RandOne_DiceOne + " och " + RandTwo_DiceTwo);
                spel2 = true;
                spel1 = false;
            }
        }
        while (spel2 == true) {
            System.out.println(
                    "1.Kolla hur mycket pengar du har\n2.Kolla vilka gator du äger\n3.Kolla vilken gata du står på och pris");
            val = tangentbord.nextInt();

            if (val == 1) {
                pengar.KollaPengar();
                spel1 = true;
                spel2 = false;
            }
            if (val == 2) {
                System.out.println(ÄgdaGator);
                spel1 = true;
                spel2 = false;
            }
            if (val == 3) {
                System.out.println("Du står på " + Gator.get(Steg) + " Som kostar "
                        + " Vill du köpa den?\n1 för att köpa\n2 för att inte köpa");
                int GatKöp = tangentbord.nextInt();
                if (GatKöp == 1) {
                    gata.KöpGata();
                    spel1 = true;
                    spel2 = false;
                }
            }
        }
    }
}
