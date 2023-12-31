public class Pizza extends PizzaDough{

    // Attributes
    double Pesananvar1;
    private final double Keju = 30;
    private final double Sosis = 50;
    private final double SmokedBeef = 50;
    private final double BawangBombay = 30;
    
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
    private double calcPizzavar1() {
        return this.calcKeju() + this.calcSosis() + this.calcSmokedBeef() + calcBawangBombay();
    }
    
    // Calculate the sum of all variants cost
    private double sumPizzavar1() {
        return this.calcDoughPcs() + this.calcPizzavar1();
    }
    
    // Calculate price per pcs
    private double PricePizzavar1() {
        return (sumPizzavar1() * 40) / 100 + sumPizzavar1();
    }
    
    // Calculate total price
    double TotalPrice() {
        return PricePizzavar1() * Pesananvar1;
    }
    
    // Display the price
    void printData() {
        System.out.println("-----------------Pizza-----------------");
        System.out.println("Harga Varian Pizza per pcs : Rp." + Math.round(PricePizzavar1()));
        System.out.println("Harga Total Pesanan :        Rp." + Math.round(TotalPrice()));
        System.out.println("---------------------------------------");
        System.out.println("");
    }
    
}
