public class RotiTawar extends RotiTawarDough {
    
    // Attributes
    double Pesananvar1;
    double Pesananvar2;
    private final double Keju = 80;
    private final double Coklat = 80;

    // Calculate the variant 1 fillings cost
    private double calcVar1() {
        return this.Keju / 250 * 31000;
    }
    
    // Calculate the variant 2 fillings cost
    private double calcVar2() {
        return this.Coklat / 500 * 29000;
    }
    
    // Calculate the sum of all variants cost
    private double sumVar1() {
        return this.calcDoughPcs() + this.calcVar1();
    }
    
    private double sumVar2() {
        return this.calcDoughPcs() + this.calcVar2();
    }
    
    // Calculate price per pcs
    private double PriceVar1() {
        return (this.sumVar1() * 40) / 100 + this.sumVar1();
    }
    
    double PriceVar2() {
        return (this.sumVar2() * 40) / 100 + this.sumVar2();
    }
    
    // Calculate total price per variants
    double TotalPriceVar1() {
        return this.PriceVar1() * Pesananvar1;
    }
    
    double TotalPriceVar2() {
        return this.PriceVar2() * Pesananvar2;
    }
    
    // Calculate total price
    double TotalPrice() {
        return this.TotalPriceVar1() + this.TotalPriceVar2();
    }
    
    // Display the price
    void printData() {
        System.out.println("------------------Roti Tawar------------------");
        System.out.println("Harga Varian 1 Roti Tawar per pcs : Rp." + Math.round(this.PriceVar1()) + "/pcs");
        System.out.println("Harga Varian 2 Roti Tawar per pcs : Rp." + Math.round(this.PriceVar2()) + "/pcs");
        System.out.println("Harga Total Pesanan Variant 1 :     Rp." + Math.round(this.TotalPriceVar1()));
        System.out.println("Harga Total Pesanan Variant 2 :     Rp." + Math.round(this.TotalPriceVar2()));
        System.out.println("Harga Total Pesanan :               Rp." + Math.round(this.TotalPrice()));
        System.out.println("----------------------------------------------");
        System.out.println("");
    }
    
}