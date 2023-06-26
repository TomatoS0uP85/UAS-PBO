public class main {
    
    public static void main(String[] args){
        
        // Call the needed class
        RotiManis a = new RotiManis();
        RotiTawar b = new RotiTawar();
        Pizza c = new Pizza();
        
        // Fill the requested order for Roti Manis
        a.Pesananvar1 = 50;
        a.Pesananvar2 = 100;
        a.Pesananvar3 = 70;
        a.printData();
        
        // Fill the requested order for Roti Tawar
        b.Pesananvar1 = 20;
        b.Pesananvar2 = 15;
        b.printData();
        
        // Fill the requested order for Pizza
        c.Pesananvar1 = 10;
        c.printData();
        
        // Display and calculate the needed weights for each ingredients
        System.out.println("-----Minimal Bahan yang diperlukan-----");
        System.out.println("Tepung        : " + Math.round((50 / a.sumWeight() * a.Tepung() * (a.Pesananvar1 + a.Pesananvar2 + a.Pesananvar3)) + (400 / b.sumWeight() * b.Tepung() * (b.Pesananvar1 + b.Pesananvar2)) + (190 / c.sumWeight() * c.Tepung() * c.Pesananvar1)) + " gr");
        System.out.println("Gula          : " + Math.round((50 / a.sumWeight() * a.Gula() * (a.Pesananvar1 + a.Pesananvar2 + a.Pesananvar3)) + (400 / b.sumWeight() * b.Gula() * (b.Pesananvar1 + b.Pesananvar2)) + (190 / c.sumWeight() * c.Gula() * c.Pesananvar1)) + " gr");
        System.out.println("Mentega       : " + Math.round((50 / a.sumWeight() * a.Butter() * (a.Pesananvar1 + a.Pesananvar2 + a.Pesananvar3)) + (400 / b.sumWeight() * b.Butter() * (b.Pesananvar1 + b.Pesananvar2)) + (190 / c.sumWeight() * c.Butter() * c.Pesananvar1)) + " gr");
        System.out.println("Ragi          : " + Math.round((50 / a.sumWeight() * a.Ragi() * (a.Pesananvar1 + a.Pesananvar2 + a.Pesananvar3)) + (400 / b.sumWeight() * b.Ragi() * (b.Pesananvar1 + b.Pesananvar2)) + (190 / c.sumWeight() * c.Ragi() * c.Pesananvar1)) + " gr");
        System.out.println("Susu Bubuk    : " + Math.round((50 / a.sumWeight() * a.SusuB() * (a.Pesananvar1 + a.Pesananvar2 + a.Pesananvar3)) + (400 / b.sumWeight() * b.SusuB() * (b.Pesananvar1 + b.Pesananvar2)) + (190 / c.sumWeight() * c.SusuB() * c.Pesananvar1)) + " gr");
        System.out.println("Susu Cair     : " + Math.round((50 / a.sumWeight() * a.SusuC() * (a.Pesananvar1 + a.Pesananvar2 + a.Pesananvar3)) + (400 / b.sumWeight() * b.SusuC() * (b.Pesananvar1 + b.Pesananvar2)) + (190 / c.sumWeight() * c.SusuC() * c.Pesananvar1)) + " gr");
        System.out.println("Telur         : " + Math.round((50 / a.sumWeight() * a.Telur() * (a.Pesananvar1 + a.Pesananvar2 + a.Pesananvar3)) + (400 / b.sumWeight() * b.Telur() * (b.Pesananvar1 + b.Pesananvar2)) + (190 / c.sumWeight() * c.Telur() * c.Pesananvar1)) + " gr");
        System.out.println("Es Batu       : " + Math.round((50 / a.sumWeight() * a.EsBatu() * (a.Pesananvar1 + a.Pesananvar2 + a.Pesananvar3)) + (400 / b.sumWeight() * b.EsBatu() * (b.Pesananvar1 + b.Pesananvar2)) + (190 / c.sumWeight() * c.EsBatu() * c.Pesananvar1)) + " gr");
        System.out.println("Keju          : " + Math.round((a.KejuVar1 * a.Pesananvar1) + (a.KejuVar3 * a.Pesananvar3) + (b.Keju * b.Pesananvar2) + (c.Keju * c.Pesananvar1)) +" gr");
        System.out.println("Coklat        : " + Math.round((a.Coklat * a.Pesananvar1) + (b.Coklat * b.Pesananvar1)) +" gr");
        System.out.println("Kacang Merah  : " + Math.round((a.RedBean * a.Pesananvar2)) +" gr");
        System.out.println("Krim Vanilla  : " + Math.round((a.KrimVanilla * a.Pesananvar2)) +" gr");
        System.out.println("Sosis         : " + Math.round((a.Sosis * a.Pesananvar3) + (c.Sosis * c.Pesananvar1)) +" gr");
        System.out.println("Smoked Beef   : " + Math.round((c.SmokedBeef * c.Pesananvar1)) +" gr");
        System.out.println("Bawang Bombay : " + Math.round((c.BawangBombay * c.Pesananvar1)) +" gr");
        System.out.println("------------===============------------");
        System.out.println("");
    }

}
