package ConstructorPerson;

public class Pensioner extends Person { // екстенс обозначает расширение класса Персон
    double pension;
    int age2;

    public Pensioner(String name, int age, double height, double weight, int money, double pension, int age2) {
        super(name, age, height, weight, money);// супер -это конструктор Персон
        this.pension = pension;
        this.age2 = age2;


    }

    @Override
   public void die() {
        double calculatedPension = (age2 - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + calculatedPension);
    }
}
