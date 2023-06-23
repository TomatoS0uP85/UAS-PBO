import Interface.calcDough;

public class RotiManisDough extends Dough implements calcDough {

    // Add Dough Attributes
    @Override
    public double Tepung() {
        return 1000;
    }

    @Override
    public double Gula() {
        return 150;
    }

    @Override
    public double Butter() {
        return 150;
    }

    @Override
    public double Ragi() {
        return 20;
    }

    @Override
    public double SusuB() {
        return 300;
    }

    @Override
    public double SusuC() {
        return 250;
    }

    @Override
    public double Telur() {
        return 80;
    }

    @Override
    public double EsBatu() {
        return 400;
    }
    
    // Implements Dough Calculation
    @Override
    public double calcTepung() {
        return Tepung()/1000 * 40000;
    }

    @Override
    public double calcGula() {
        return Gula()/1000 * 25000;
    }

    @Override
    public double calcButter() {
        return Butter()/500 * 23000;
    }

    @Override
    public double calcRagi() {
        return Ragi()/11 * 5000;
    }

    @Override
    public double calcSusuB() {
        return SusuB()/1000 * 39000;
    }

    @Override
    public double calcSusuC() {
        return SusuC()/1000 * 24000;
    }

    @Override
    public double calcTelur() {
        return Telur()/1000 * 23000;
    }

    @Override
    public double calcEsBatu() {
        return EsBatu()/1000 * 2000;
    }
    
    
}
