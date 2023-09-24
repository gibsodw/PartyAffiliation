import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = "";
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your party affiliation [D R I other]: ");

        party = userInput.next();

        if(party.equals("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if(party.equals("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if(party.equals("I"))
        {
            System.out.println("you get an Independent Man");
        }
        else
        {
            System.out.println("Your party is " + party);
        }
    }
}