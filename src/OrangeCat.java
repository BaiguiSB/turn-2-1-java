public class OrangeCat extends Cat
{
    protected boolean isFat;

    public OrangeCat(String name, int age, String sex, boolean isFat)
    {
        super(name, age, sex, 200.0);
        this.isFat = isFat;
    }

    @Override
    public String toString()
    {
        return "OrangeCat{" +
                "name:" + this.name +
                ", age:" + this.age +
                ", sex:" + this.sex +
                ", price:" + this.price +
                ", isFat:" + this.isFat +
                "}";
    }
}
