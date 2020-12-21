import java.util.*;
class WrongAge extends Exception
{
	private int a1,b1;
	WrongAge(int a,int b)
	{
		a1=a;
		b1=b;
	}
	public String toString()
	{
        if(a1<0||b1<0)
        return "input age cannot be less than 0";
        else if(a1<=b1)
        	return "father age cannot be less than or equal to son age ";
        return "";
	}
}

class Father
{ 
	int fage,sage;
	Scanner sc=new Scanner(System.in);
    Father() throws WrongAge
    {
    	System.out.println("enter the age of father");
    	fage=sc.nextInt();
    	System.out.println("enter the age of son");
    	sage=sc.nextInt();
    	if(fage<0||sage<0)
    		throw new WrongAge(fage,sage);



    } 
}

class Son extends Father
{

    Son() throws WrongAge
    {
  
        if(sage>=fage)
    		throw new WrongAge(fage,sage);
    	else
    	System.out.println("proper ages have been entered");
    }
}

class LAB8
{
	public static void main(String args[])
	{

		try
		{
           Son s=new Son();
		}catch(WrongAge e){
			System.out.println("error:"+e);

		}
	}
}
