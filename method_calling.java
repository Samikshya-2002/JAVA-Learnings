import java.util.*;
class hello
{
    private String name;
    public hello() //constructor used to initialize the instance variables
    {
        name="Hena";
    }
    public String get(String s)
    {
        this.name=s;
        return name;
    }

}
public class method_calling
{
    public static void main(String args[])
    {
        Scanner sam=new Scanner(System.in);
        System.out.println("enter name ");
        String n1=sam.nextLine();
        hello obj=new hello();
        String name1=obj.get(n1);
        System.out.println(name1);
    }
}
