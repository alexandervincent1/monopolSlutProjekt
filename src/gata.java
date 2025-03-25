import java.util.ArrayList;

public class gata {
    public int Price;
    public String Name;

    public static void KöpGata() {
        System.out.println("Grattis du köpte " + App.Gator.get(App.Steg));
        App.ÄgdaGator.add(App.Gator.get(App.Steg));
        pengar.bank = pengar.bank - App.Gator.get(App.Steg).Price; 
    }
}

class Gå extends gata{
    public Gå(){
        pengar.bank=pengar.bank + 2000;
    }
}
class Västerlånggatan extends gata {
    public Västerlånggatan() {
        Price = 1200;
        Name = "Västerlånggatan";
    }

}

class Hornsgatan extends gata {
    public Hornsgatan() {
        Price = 1200;
        Name = "Hornsgatan";
    }
}

class SödraStation extends gata {
    public  SödraStation() {
        Price = 4000;
        Name = "SödraStation";
    }
}

class Folkkungagatan extends gata {
    public  Folkkungagatan() {
        Price = 2000;
        Name = "Folkkungagatan";
    }
}

class Götgatan extends gata {
    public  Götgatan() {
        Price = 2000;
      Name ="Götgatan";
    }
}

class Ringvägen extends gata {
    public  Ringvägen() {
        Price = 2400;
        Name = "Ringvägen";
    }
}

class StEriksgatan extends gata {
    public  StEriksgatan() {
        Price = 2800;
        Name = "StEriksgatan";
    }
}

class Elverket extends gata {
    public  Elverket() {
        Price = 3000;
        Name = "Elverket";
    }
}

class Odengatan extends gata {
    public  Odengatan() {
        Price = 2800;
        Name = "Odengatan";
    }
}

class Valhallavägen extends gata {
    public  Valhallavägen() {
        Price = 3300;
        Name = "Valhallavägen";
    }
}

class Östrastation extends gata {
    public  Östrastation() {
        Price = 4000;
        Name = "Östrastation";
    }
}

class Sturegatan extends gata {
    public  Sturegatan() {
        Price = 3600;
        Name = "Sturegatan";
    }
}