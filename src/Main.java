import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = "";
        String republican = "R";
        String democrat = "D";
        String independent = "I";
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your party affiliation [D R I]: ");

        party = userInput.next();

        if(party == republican)
        {
            System.out.println("You get a Republican Elephant");
        }
        else if(party == democrat)
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if(party == independent)
        {
            System.out.println("you get an Independent Man");
        }
        else
        {
            System.out.println("Your party is " + party);
        }
    }
}