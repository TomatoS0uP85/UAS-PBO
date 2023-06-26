public class RotiManis extends RotiManisDough {
    
    // Attributes
    double Pesananvar1;
    double Pesananvar2;
    double Pesananvar3;
    private final double varKeju1 = 5;
    private final double varKeju3 = 10;
    private final double Coklat = 10;
    private final double RedBean = 5;
    private final double KrimVanilla = 5;
    private final double Sosis = 10;
    
    // Calculate price per ingredients
    double calcvar1Keju() {
        return this.varKeju1 / 250 * 31000;
    }
    
    double calcvar3Keju() {
        return this.varKeju3 / 250 * 31000;
    }
    
    double calcCoklat() {
        return this.Coklat / 500 * 29000;
    }
    
    double calcRedBean() {
        return this.RedBean / 500 * 25000;
    }
    
    double calcKrimVanilla() {
        return this.KrimVanilla / 500 * 30000;
    }
    
    double calcSosis() {
        return this.Sosis / 250 * 80000;
    }
    
    // Calculate the sum of variant 1 toppings and fillings cost
    double calcRotiManisvar1() {
        return this.calcvar1Keju()+ this.calcCoklat();
    }
    
    // Calculate the sum of variant 2 toppings and fillings cost
    double calcRotiManisvar2(){
        return this.calcRedBean() + this.calcKrimVanilla();
    }
    
    // Calculate the sum of variant 3 fillings cost
    double calcRotiManisvar3(){
        return this.calcvar3Keju() + this.calcSosis();
    }
    
    // Calculate the sum of all variants cost
    double sumRotiManisvar1() {
        return this.calcDoughPcs() + this.calcRotiManisvar1();
    }
    
    double sumRotiManisvar2() {
        return this.calcDoughPcs() + this.calcRotiManisvar2();
    }
    
    double sumRotiManisvar3() {
        return this.calcDoughPcs() + this.calcRotiManisvar3();
    }
    
    // Calculate price per pcs
    double PriceRotiManisvar1() {
        return (this.sumRotiManisvar1() * 40) / 100 + this.sumRotiManisvar1();
    }
    
    double PriceRotiManisvar2() {
        return (this.sumRotiManisvar2() * 40) / 100 + this.sumRotiManisvar2();
    }
    
    double PriceRotiManisvar3() {
        return (this.sumRotiManisvar3() * 40) / 100 + this.sumRotiManisvar3();
    }
    
    // Calculate total price per variants
    double TotalPriceRotiManisvar1() {
        return this.PriceRotiManisvar1() * Pesananvar1;
    }
    
    double TotalPriceRotiManisvar2() {
        return this.PriceRotiManisvar2() * Pesananvar2;
    }
    
    double TotalPriceRotiManisvar3() {
        return this.PriceRotiManisvar3() * Pesananvar3;
    }
    
    // Calculate total price
    double TotalPrice() {
        return this.TotalPriceRotiManisvar1() + this.TotalPriceRotiManisvar2() + this.TotalPriceRotiManisvar3();
    }
    
    // Display the price
    void printData() {
        System.out.println("------------------Roti Manis------------------");
        System.out.println("Harga Varian 1 Roti Manis per pcs : Rp." + Math.round(PriceRotiManisvar1()) + "/pcs");
        System.out.println("Harga Varian 2 Roti Manis per pcs : Rp." + Math.round(PriceRotiManisvar2()) + "/pcs");
        System.out.println("Harga Varian 3 Roti Manis per pcs : Rp." + Math.round(PriceRotiManisvar3()) + "/pcs");
        System.out.println("Harga Total Pesanan Variant 1 :     Rp." + Math.round(TotalPriceRotiManisvar1()));
        System.out.println("Harga Total Pesanan Variant 2 :     Rp." + Math.round(TotalPriceRotiManisvar2()));
        System.out.println("Harga Total Pesanan Variant 3 :     Rp." + Math.round(TotalPriceRotiManisvar3()));
        System.out.println("Harga Total Pesanan :               Rp." + Math.round(this.TotalPrice()));
        System.out.println("----------------------------------------------");
        System.out.println("");
    }

}
