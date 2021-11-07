import java.time.LocalDate;


public class Test {
    public static void main(String[] args) {
        PetShop shop = new PetShop(500);

        OrangeCat a = new OrangeCat("a", 1, "男", false);
        BlackCat b = new BlackCat("b", 12, "男");
        Customer c = new Customer("c", 2, LocalDate.of(2021, 10, 30));
        Customer d = new Customer("d", 3, LocalDate.of(2021, 10, 31));
        Customer e = new Customer("e", 1, LocalDate.of(2021, 10, 31));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        shop.entertain(c);
        shop.buy(a);
        shop.buy(b);
        System.out.println(shop.cats);
        System.out.println(shop.customers);
        System.out.println(shop.balance);

        shop.balance += 500;
        shop.buy(a);
        shop.buy(b);
        System.out.println(shop.cats);

        shop.entertain(c);
        shop.entertain(d);
        shop.entertain(e);

        shop.close();

    }
}
