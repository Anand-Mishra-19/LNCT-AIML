public class compare 
{
    public static void main(String[] args) 
    {
        String name1 = "Anand";
        String name2 = "anand";

        if (name1.compareToIgnoreCase(name2) == 0)  //IgnoreCase A == a ;;
        {
            System.out.println("Names are equeal : ");
        }
        else 
        {
            System.out.println("Names are different : ");
        }
    }
}
