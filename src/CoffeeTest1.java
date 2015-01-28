enum CoffeeSize {
    BIG(8), HUGE(10), OVERWHELMING(16);


    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }


private int ounces;
public int getOunces() {
    return ounces;
}
}
public class CoffeeTest1 {
    CoffeeSize size;
    public static void main(String[] args) {
        CoffeeTest1 drink1 = new CoffeeTest1();
        drink1.size = CoffeeSize.BIG;
        CoffeeTest1 drink2 = new CoffeeTest1();
        drink2.size = CoffeeSize.OVERWHELMING;

    System.out.println(drink1.size.getOunces());
        for (CoffeeSize cs: CoffeeSize.values())
            System.out.print(cs + " " + cs.getOunces());

    }

}