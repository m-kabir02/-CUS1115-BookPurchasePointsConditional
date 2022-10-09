package bookspurchased;

import java.util.Scanner;//must be used each time you use the keyboard

public class bookspurchased
{

    public static void main(String[] args)
    {

        int booksPurchased;//must be assigned before using this variable for the keyboard input
        Scanner kb=new Scanner(System.in);// always import the scanner before using this

        System.out.println("Enter number of books purchased.");
        booksPurchased=kb.nextInt();//assigns the keyboard input to the int/double created
//nextInt is case sensitive
        if(booksPurchased==0)
            //when you're asking if a statement is true,
            // use == for equal, != for not equal
            // > or < or <= or >=
            //for more than one statement being true use && for both
            // or use || for OR meaning one must be true

            System.out.println("You have purchased 0 books so you have 0 points ");
        else
        if(booksPurchased==1)
            System.out.println("You have purchased 1 book so you have 5 points");
        else
        if(booksPurchased==2)
            System.out.println("You have purchased 2 books so you have 10 points");
        else
        if(booksPurchased==3)
            System.out.println("You have purchased 3 books so you have 15 points");
        else
        if(booksPurchased>=4)
            System.out.println("You have purchased"+booksPurchased+" books so you have 60 points");
    }}
