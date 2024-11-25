import java.util.Scanner;
public class IT24610812Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


System.out.println("Enter the number of new member introduced:");
 int num = scanner.nextInt();

if(num==0)
{
   System.out.print("NO Prize");
}
else if (num==1)
{
    System.out.print("pen");
}
else if (num==2)
{
    System.out.print("Umbrella");
}
else if (num==3)
{
    System.out.print("Bag");
}
else if (num==4)
{
    System.out.print("travelling Chair");
}
else if (num>=5)
{
    System.out.print("headphone");
}
else
{
    System.out.print("Input must be a number 0 or greater");
}


}

}

     