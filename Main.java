class Sami
{
    String name;
    int age;

    void hi()
    {
        System.out.println("Hello");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        /* Create an object for class Sami */
        Sami sam= new Sami();
        sam.name="Samikshya";
        sam.age=21;
        sam.hi();
        System.out.println(sam.name);
    }
}