class SetGet1
{
    private String name;
    public void setName(String s)
    {
        this.name=s;
    }
    public String getName()
    {
        return name;
    }
}
public class SetGet {
    public static void main(String args[])
    {
        SetGet1 obj=new SetGet1();
        obj.setName("Ishu");
        String s1=obj.getName();
        System.out.println(s1);
    }
}
