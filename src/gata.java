import java.util.ArrayList;

public class Gata {
    public int Price;
    public String Name;
    public boolean Köpt;
    public int Hyra1;
    public static void KöpGata() {
        System.out.println("Grattis du köpte " + App.Gator.get(App.Steg));
        App.ÄgdaGator.add(App.Gator.get(App.Steg));
        pengar.bank = pengar.bank - App.Gator.get(App.Steg).Price; 
    }
}

class Gå extends Gata{
    public Gå(){
        pengar.bank=pengar.bank + 2000;
    }
}
class Västerlånggatan extends Gata {
    public Västerlånggatan() {
        Price = 1200;
        Name = "Västerlånggatan";
        Köpt = true;
        Hyra1 = 50;
    }

}

class Hornsgatan extends Gata {
    public Hornsgatan() {
        Price = 1200;
        Name = "Hornsgatan";
        Köpt = true;
    }
}

class SödraStation extends Gata {
    public  SödraStation() {
        Price = 4000;
        Name = "SödraStation";
        Köpt = true;
    }
}

class Folkkungagatan extends Gata {
    public  Folkkungagatan() {
        Price = 2000;
        Name = "Folkkungagatan";
        Köpt = true;
    }
}

class Götgatan extends Gata {
    public  Götgatan() {
        Price = 2000;
      Name ="Götgatan";
      Köpt = true;
    }
}

class Ringvägen extends Gata {
    public  Ringvägen() {
        Price = 2400;
        Name = "Ringvägen";
        Köpt = true;
    }
}

class StEriksgatan extends Gata {
    public  StEriksgatan() {
        Price = 2800;
        Name = "StEriksgatan";
        Köpt = true;
    }
}

class Elverket extends Gata {
    public  Elverket() {
        Price = 3000;
        Name = "Elverket";
        Köpt = true;
    }
}

class Odengatan extends Gata {
    public  Odengatan() {
        Price = 2800;
        Name = "Odengatan";
        Köpt = true;
    }
}

class Valhallavägen extends Gata {
    public  Valhallavägen() {
        Price = 3300;
        Name = "Valhallavägen";
        Köpt = true;
    }
}

class Östrastation extends Gata {
    public  Östrastation() {
        Price = 4000;
        Name = "Östrastation";
        Köpt = true;
    }
}

class Sturegatan extends Gata {
    public  Sturegatan() {
        Price = 3600;
        Name = "Sturegatan";
        Köpt = true;
    }
}