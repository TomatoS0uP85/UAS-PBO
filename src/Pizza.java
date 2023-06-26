public class Pizza extends PizzaDough{

    // Attributes
    double Pesananvar1;
    final double Keju = 30;
    final double Sosis = 50;
    final double SmokedBeef = 50;
    final double BawangBombay = 30;
    
    // Calculate the price per ingredients
    private double calcKeju() {
        return this.Keju / 250 * 31000;
    }
    
    private double calcSosis() {
        return this.Sosis / 250 * 80000;
    }
    
    private double calcSmokedBeef() {
        return this.SmokedBeef / 250 * 90000;
    }
    
    private double calcBawangBombay() {
        return this.BawangBombay / 250 * 40000;
    }
    
    // Calculate the sum of variant 1 Toppings cost
    private double calcVar1() {
        return this.calcKeju() + this.calcSosis() + this.calcSmokedBeef() + this.calcBawangBombay();
    }
    
    // Calculate the sum of all variants cost
    private double sumVar1() {
        return this.calcDoughPcs() + this.calcVar1();
    }
    
    // Calculate price per pcs
    private double PriceVar1() {
        return (this.sumVar1() * 40) / 100 + this.sumVar1();
    }
    
    // Calculate total price
    private double TotalPrice() {
        return PriceVar1() * this.Pesananvar1;
    }
    
    // Display the price
    void printData() {
        System.out.println("------------------Pizza-------------------");
        System.out.println("Harga Varian Pizza per pcs : Rp." + Math.round(this.PriceVar1()) + "/pcs");
        System.out.println("Harga Total Pesanan :        Rp." + Math.round(this.TotalPrice()));
        System.out.println("---------------============---------------");
        System.out.println("");
    }
    
}