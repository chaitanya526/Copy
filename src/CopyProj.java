import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class CopyProj {
	static ArrayList<Map1> l;
	static int p=-1;
 CopyProj()
	
	{
		
	}
	public static void main(String a[])
	{
		Map1 m1;
		l=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		String s;	
		do
		{
		System.out.println("enter the element you want to insert");
		s=sc.nextLine();
		if(contains(s))
		{
			
			String n=s;
			s=s+".copy"+((l.get(p).v)+1);
			m1=new Map1();
			m1.k=s;
			m1.v=0;
			l.add(m1);
			m1=new Map1();
			m1.k=n;
			m1.v=l.get(p).v+1;;
			l.remove(p);
			l.add(p,m1);
		}
		else
		{
			m1=new Map1();
			m1.k=s;
			m1.v=0;
			l.add(m1);
			
		}
		}while(!s.equals("1"));
		l.remove(l.size()-1);
		for(Map1 m:l)
		{
			System.out.println(m.k);
		}
	}
	
	static boolean contains(String s){

		try
		{
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).k.equals(s))
			{
				p=i;
				return true;
				
			}
			Integer a=
		}
		return false;
		}
		catch(ParseException  IOException w)
		{
			
		}
		
	}
	

}
