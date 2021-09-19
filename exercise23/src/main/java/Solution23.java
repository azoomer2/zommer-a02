import java.util.Scanner;

public class Solution23 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Is the car silent when you turn the key? ");
        String in = scan.nextLine();

        if(in.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            in = scan.nextLine();
            if(in.equals("y"))
                System.out.println("Clean terminals and try starting again.");
            else
                System.out.println("Replace cables and try again.");
        }
        else
        {
            System.out.print("Does the car make a clicking noise? ");
            in = scan.nextLine();
            if(in.equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                in = scan.nextLine();
                if(in.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    in = scan.nextLine();
                    if(in.equals("y"))
                    {
                        System.out.print("Does the car have fuel injection? ");
                        in = scan.nextLine();
                        if(in.equals("y"))
                            System.out.println("Get it in for service.");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}


/*
    Follow decision tree in solution23.puml to make if else tree

 */