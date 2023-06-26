public class RotiManis extends RotiManisDough {
    
    // Attributes
    double Pesananvar1;
    double Pesananvar2;
    double Pesananvar3;
    
    // Varian 1
    double KejuVar1 = 5;
    double Coklat = 10;
    
    // Varian 2
    double KejuVar3 = 10;
    double RedBean = 5;
    double KrimVanilla = 5;
    double Sosis = 10;
    
    // Calculate price per ingredients
    private double calcvar1Keju() {
        return this.KejuVar1 / 250 * 31000;
    }
    
    private double calcvar3Keju() {
        return this.KejuVar3 / 250 * 31000;
    }
    
    private double calcCoklat() {
        return this.Coklat / 500 * 29000;
    }
    
    private double calcRedBean() {
        return this.RedBean / 500 * 25000;
    }
    
    private double calcKrimVanilla() {
        return this.KrimVanilla / 500 * 30000;
    }
    
    private double calcSosis() {
        return this.Sosis / 250 * 80000;
    }
    
    // Calculate the sum of variant 1 toppings and fillings cost
    private double calcVar1() {
        return this.calcvar1Keju()+ this.calcCoklat();
    }
    
    // Calculate the sum of variant 2 toppings and fillings cost
    private double calcVar2(){
        return this.calcRedBean() + this.calcKrimVanilla();
    }
    
    // Calculate the sum of variant 3 fillings cost
    private double calcVar3(){
        return this.calcvar3Keju() + this.calcSosis();
    }
    
    // Calculate the sum of all variants cost
    private double sumVar1() {
        return this.calcDoughPcs() + this.calcVar1();
    }
    
    private double sumVar2() {
        return this.calcDoughPcs() + this.calcVar2();
    }
    
    private double sumVar3() {
        return this.calcDoughPcs() + this.calcVar3();
    }
    
    // Calculate price per pcs
    private double PriceVar1() {
        return (this.sumVar1() * 40) / 100 + this.sumVar1();
    }
    
    private double PriceVar2() {
        return (this.sumVar2() * 40) / 100 + this.sumVar2();
    }
    
    private double PriceVar3() {
        return (this.sumVar3() * 40) / 100 + this.sumVar3();
    }
    
    // Calculate total price per variants
    private double TotalPriceVar1() {
        return this.PriceVar1() * this.Pesananvar1;
    }
    
    private double TotalPriceVar2() {
        return this.PriceVar2() * this.Pesananvar2;
    }
    
    private double TotalPriceVar3() {
        return this.PriceVar3() * this.Pesananvar3;
    }
    
    // Calculate total price
    private double TotalPrice() {
        return this.TotalPriceVar1() + this.TotalPriceVar2() + this.TotalPriceVar3();
    }
    
    // Display the price
    void printData() {
        System.out.println("-------------------Roti Manis--------------------");
        System.out.println("Harga Varian 1 Roti Manis per pcs : Rp." + Math.round(this.PriceVar1()) + "/pcs");
        System.out.println("Harga Varian 2 Roti Manis per pcs : Rp." + Math.round(this.PriceVar2()) + "/pcs");
        System.out.println("Harga Varian 3 Roti Manis per pcs : Rp." + Math.round(this.PriceVar3()) + "/pcs");
        System.out.println("Harga Total Pesanan Variant 1     : Rp." + Math.round(this.TotalPriceVar1()));
        System.out.println("Harga Total Pesanan Variant 2     : Rp." + Math.round(this.TotalPriceVar2()));
        System.out.println("Harga Total Pesanan Variant 3     : Rp." + Math.round(this.TotalPriceVar3()));
        System.out.println("Harga Total Pesanan               : Rp." + Math.round(this.TotalPrice()));
        System.out.println("---------------===================---------------");
        System.out.println("");
    }
}

