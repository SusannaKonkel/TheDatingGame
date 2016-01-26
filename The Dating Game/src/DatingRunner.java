import java.util.ArrayList;
import java.util.Scanner;

public class DatingRunner 
{
	private static int userDesiredHumor;
	private static int userDesiredMoney;
	private static int userDesiredHeight;
	private static String userBachelors;
	private static String userBachelors2;
	static ArrayList <Guy>compatability = new ArrayList<Guy>();
	public static void determineHumor()
	{
		System.out.println("On a scale of 1-10, what is the minimum humor you will allow?");
		Scanner userInput = new Scanner (System.in);
		userDesiredHumor = userInput.nextInt();
		for (int i = 0; i < 10; i++)
		{
			if(compatability.get(i).getSenseOfHumor() >= userDesiredHumor)
			{
				//System.out.println(compatability.get(i).getName() + " has a " + compatability.get(i).getSenseOfHumor() + " on the humor scale." );
			}
		}
	}
	public static void determineMoney()
	{
		System.out.println();
		System.out.println("What is the minimum salary you will allow?");
		Scanner userInput2 = new Scanner (System.in);
		userDesiredMoney = userInput2.nextInt();
		for(int i = 0; i<10; i++)
		{
			if(compatability.get(i).getMoney() >= userDesiredMoney)
			{
				//System.out.println(compatability.get(i).getName() + " has a " + compatability.get(i).getMoney() + " dollar annual income.");
			}
		}
	}
	public static void determineHeight()
	{
		System.out.println();
		System.out.println("What is the minimum height you will allow in inches?");
		Scanner userInput3 = new Scanner (System.in);
		userDesiredHeight = userInput3.nextInt();
		for(int i = 0; i<10; i++)
		{
			if(compatability.get(i).getHeight() >= userDesiredHeight)
			{
				//System.out.println(compatability.get(i).getName() + " is " + compatability.get(i).getHeight() + " inches tall.");
			}
		}	
	}
	public static void finalizeBoy()
	{
		for (int i = 0; i <10; i++)
		{
		if (compatability.get(i).getSenseOfHumor() >= userDesiredHumor && compatability.get(i).getHeight() >= userDesiredHeight && compatability.get(i).getMoney() >= userDesiredMoney)
			{
			System.out.println("You have been matched with " + compatability.get(i).getName() + " .");
			System.out.println(compatability.get(i).getName() + " is " +  compatability.get(i).getHeight() + " inches tall. He makes " + compatability.get(i).getMoney() + " dollars a year. His friends have rated him a " + compatability.get(i).getSenseOfHumor() + " when it comes to his humor.");
			System.out.println();
			}
		}
	}
	public static void askName()
	{
		System.out.println("Would you like to see the bachelors first? y or n");
		Scanner userInput4 = new Scanner (System.in);
		userBachelors = userInput4.nextLine();
		if (userBachelors.equals("y") || userBachelors.equals("Y"))
		{
				listGuys();
		}
		else if (userBachelors.equals("n") || userBachelors.equals("N"))
		{
			
		}
		else
		{
			askName();
		}
	}
	public static void main(String[] args) 
	{
		generateGuy();
		askName();
		System.out.println();
		determineHumor();
		determineMoney();
		determineHeight();
		System.out.println();
		System.out.println("***YOUR RESULTS***");
		System.out.println();
		finalizeBoy();
	}
	public static void generateGuy()
	{
		compatability.add(new Guy("Jonathan", 70, 10, 600000));
		compatability.add(new Guy("Stephen", 67, 5, 70000));
		compatability.add(new Guy("Omar", 72, 8, 200000));
		compatability.add(new Guy("Mark", 69, 3, 150000));
		compatability.add(new Guy("Cory", 74, 1, 3000000));
		compatability.add(new Guy("Luke", 68, 7, 90000));
		compatability.add(new Guy("Jared", 71, 9, 400000));
		compatability.add(new Guy("Anthony", 64, 4, 70000));
		compatability.add(new Guy("Caleb", 70, 10, 100000));
		compatability.add(new Guy("Jordan", 71, 6, 750000));
	}
	public static void listGuys()
	{
		for(Guy g: compatability)
		{
			System.out.println(g.getName() + " is " +  g.getHeight() + " inches tall. He makes " + g.getMoney() + " dollars a year. His friends have rated him a " + g.getSenseOfHumor() + " when it comes to his humor.");
		}
	}
}