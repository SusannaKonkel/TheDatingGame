import java.util.ArrayList;
import java.util.Scanner;
public class Guy 
{
	private int money;
	private String name;
	private int height;
	private int senseOfHumor;

	public Guy (String n, int h, int s, int m)
	{
		name = n;
		height =h;
		senseOfHumor = s;
		money = m;
	}

	public int getMoney() 
	{
		return money;
	}

	public void setMoney(int money) 
	{
		this.money = money;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}

	public int getSenseOfHumor() 
	{
		return senseOfHumor;
	}

	public void setSenseOfHumor(int senseOfHumor) 
	{
		this.senseOfHumor = senseOfHumor;
	}
}
	