import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class PetShop implements CatCafe {

    double balance;
    ArrayList<Object> cats;
    ArrayList<Customer> customers;

    public PetShop(double balance) {
        this.balance = balance;
        cats = new ArrayList<Object>();
        customers = new ArrayList<Customer>();
    }


    @Override
    public void buy(Object cat) {
        try {
            if (((Cat) cat).price > this.balance) {
                throw new InsufficientBalanceException("余额不足");
            } else {
                this.balance -= ((Cat) cat).price;
                this.cats.add(cat);
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void entertain(Customer customer) {
        try {
            if (this.cats.isEmpty()) {
                throw new CatNotFoundException("你猫没了");
            }
            this.customers.add(customer);
            Random random = new Random();
            for (int i = 0; i < customer.frequency; i++) {
                this.balance += 15;
                System.out.println(this.cats.get(random.nextInt(this.cats.size())));
            }
        } catch (CatNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public void close() {
        int size = this.customers.size();
        LocalDate today = this.customers.get(size - 1).time;
        int profit = 0;
        for (int i = 0; i < size; i++) {
            if (today.isEqual(this.customers.get(size - 1 - i).time)) {
                profit += 15 * this.customers.get(size - 1 - i).frequency;
            } else {
                break;
            }
        }
        System.out.println("Profit:" + profit);
    }
}
