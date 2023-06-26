import Interface.calcDough;

public class RotiManisDough extends Dough implements calcDough {

    // Add Dough's Attributes
    @Override
    double Tepung() {
        return 1000;
    }

    @Override
    double Gula() {
        return 150;
    }

    @Override
    double Butter() {
        return 150;
    }

    @Override
    double Ragi() {
        return 20;
    }

    @Override
    double SusuB() {
        return 300;
    }

    @Override
    double SusuC() {
        return 250;
    }

    @Override
    double Telur() {
        return 80;
    }

    @Override
    double EsBatu() {
        return 400;
    }
    
    @Override
    double sumWeight() {
        return 2350;
    }
    
    // Implements Dough Calculation
    @Override
    public double calcTepung() {
        return this.Tepung()/1000 * 40000;
    }

    @Override
    public double calcGula() {
        return this.Gula()/1000 * 25000;
    }

    @Override
    public double calcButter() {
        return this.Butter()/500 * 23000;
    }

    @Override
    public double calcRagi() {
        return this.Ragi()/11 * 5000;
    }

    @Override
    public double calcSusuB() {
        return this.SusuB()/1000 * 39000;
    }

    @Override
    public double calcSusuC() {
        return this.SusuC()/1000 * 24000;
    }

    @Override
    public double calcTelur() {
        return this.Telur()/1000 * 23000;
    }

    @Override
    public double calcEsBatu() {
        return this.EsBatu()/1000 * 2000;
    }
    
    // Calculate the sum cost of dough
    double sumcalcDough() {
        return this.calcTepung() + this.calcGula() + this.calcButter() + this.calcRagi() + this.calcSusuB() + this.calcSusuC() + this.calcTelur() + this.calcEsBatu();
    }
    
    // Calculate the cost of dough per pcs
    double calcDoughPcs() {
        return 50 / this.sumWeight() * this.sumcalcDough();
    }
    
}
