import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class App {
    public static int Steg = 0;
    public static ArrayList<gata> Gator = new ArrayList();
    public static ArrayList<gata> ÄgdaGator = new ArrayList();
    
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        Random RandOne = new Random();
        Random RandTwo = new Random();
        Gå gata0 = new Gå();
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
        Gator.add(gata0);
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
        int GammalSteg = 0;
        while (spel1 == true) {
            System.out.println("Välkommen till monopol");
            System.out.println("Vad vill du göra\n1.Slå tärningarna");
            int RandOne_DiceOne = RandOne.nextInt(5);
            int RandTwo_DiceTwo = RandTwo.nextInt(5);
            // Steg = RandOne_DiceOne + RandTwo_DiceTwo + GammalSteg;
            Steg = 1;
            val = tangentbord.nextInt();
            if (val == 1) {
                System.out.println("Du fick " + RandOne_DiceOne + " och " + RandTwo_DiceTwo);
                spel2 = true;
                spel1 = false;
                if (Steg==0) {
                    System.out.println("Du har passerat gå och inkasserar 2000kr");
                    spel2=false;
                    spel1=true;
                }
            }
        
        while (spel2 == true) {
            if (Steg>=13) {
                Steg = 0;
            }
            System.out.println(
                    "1.Kolla hur mycket pengar du har\n2.Kolla vilka gator du äger\n3.Kolla vilken gata du står på och pris");
            val = tangentbord.nextInt();

            if (val == 1) {
                pengar.KollaPengar();
            }
            if (val == 2) {
                System.out.println(ÄgdaGator);
                
            }
            if (val == 3) {
                if (Gator.get(Steg).Köpt == true) {
                    System.out.println("Den här gatan är redan köpt du behöver betala "+Gator.get(Steg).Hyra1+" i hyra");
                    pengar.bank = pengar.bank -gata.Hyra1;
                    spel1 = true;
                    spel2 = false;
                }
                if (Gator.get(Steg).Köpt==false) {
                    
                
                GammalSteg = Steg;
                System.out.println("Du står på " + Gator.get(Steg).Name + " Som kostar "
                        +Gator.get(Steg).Price + " Vill du köpa den?\n1 för att köpa\n2 för att inte köpa");
                int GatKöp = tangentbord.nextInt();
                if (GatKöp == 1) {
                    gata.KöpGata();
                    
                    
                }
                spel1 = true;
                    spel2 = false;
            }
        }
        }
        }
    }
}
