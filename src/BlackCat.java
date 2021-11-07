public class BlackCat extends Cat
{
    public BlackCat(String name, int age, String sex)
    {
        super(name, age, sex, 350.0);
    }

    @Override
    public String toString()
    {
        return "BlackCat{" +
                "name:" + this.name +
                ", age:" + this.age +
                ", sex:" + this.sex +
                ", price:" + this.price +
                "}";
    }
}
