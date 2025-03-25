import java.util.ArrayList;

public class gata {
    public int Price;
    public String Name;

    public static void KöpGata() {
        System.out.println("Grattis du köpte " + App.Gator.get(App.Steg));
        App.ÄgdaGator.add(App.Gator.get(App.Steg));
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
        
    }
}

class SödraStation extends gata {
    public  SödraStation() {
        Price = 4000;
        
    }
}

class Folkkungagatan extends gata {
    public  Folkkungagatan() {
        Price = 2000;
        
    }
}

class Götgatan extends gata {
    public  Götgatan() {
        Price = 2000;
      
    }
}

class Ringvägen extends gata {
    public  Ringvägen() {
        Price = 2400;
        
    }
}

class StEriksgatan extends gata {
    public  StEriksgatan() {
        Price = 2800;
        
    }
}

class Elverket extends gata {
    public  Elverket() {
        Price = 3000;
        
    }
}

class Odengatan extends gata {
    public  Odengatan() {
        Price = 2800;
        
    }
}

class Valhallavägen extends gata {
    public  Valhallavägen() {
        Price = 3300;
        
    }
}

class Östrastation extends gata {
    public  Östrastation() {
        Price = 4000;
        
    }
}

class Sturegatan extends gata {
    public  Sturegatan() {
        Price = 3600;
        
    }
}