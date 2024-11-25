import java.util.Scanner;
public class IT24610812Lab5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Start date:");
        double Startdate = scanner.nextDouble();

        System.out.print("End date:");
        double Endtdate = scanner.nextDouble();

        double dayReserved = Endtdate - Startdate;

        if(1<dayReserved && dayReserved < 3)
        {
             System.out.print("Room charge per day: ");
             double perday = scanner.nextDouble();
              System.out.println("number of Day Rserved: " + dayReserved );

              double totalamount =  perday*dayReserved;
              System.out.print("Total amount to be paid: " + totalamount);
        }
        else if(3 <= dayReserved && dayReserved<= 4  )
        {
          System.out.print("Room charge per day: ");
             double perday = scanner.nextDouble();
              System.out.println("number of Day Rserved: " + dayReserved );

              double discountamount =  0.1*perday;
              double totalamount =(perday - discountamount) * dayReserved ;
              System.out.print("Total amount to be paid: " + totalamount);


        }

            else if (dayReserved>=5)
             {
          System.out.print("Room charge per day: ");
             double perday = scanner.nextDouble();
              System.out.println("number of Day Rserved: " + dayReserved );

              double discountamount =  0.2*perday;
              double totalamount =(perday - discountamount) * dayReserved ;
              System.out.print("Total amount to be paid: " + totalamount);

        }
          else 
              {
                System.out.print("put your correct Reserve day");
              }

    }
    
    }