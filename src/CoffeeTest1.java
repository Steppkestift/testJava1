/**
 * Created by heiko-linke on 28.01.15.
 */
enum CoffeeSize { BIG, HUGE, OVERWHELMING}

class Coffee {
        CoffeeSize size;
}

public class CoffeeTest1 {
    public static void main(String[] args)
    {
       Coffee drink = new Coffee();
       drink.size = CoffeeSize.BIG;
    }
}
