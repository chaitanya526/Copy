import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapProj {
	public static void main(String a[])
	{
		Map<String,Integer> m=new HashMap<>();
		List<String> l=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String s;
		
		do
		{
		System.out.println("enter the element you want to insert and 1 to exit");
		s=sc.nextLine();
		if(s.length()<=0)
		{
			System.out.println("element should not me empty !! ");
			s=sc.nextLine();		
		}
		
		if(m.containsKey(s))
		{
			int v=m.get(s);
			m.put(s+".copy."+(v+1), 0);
			l.add(s+".copy."+(v+1));
			m.put(s,v+1);

			
		}
		else
		{
			m.put(s, 0);
			l.add(s);
		}
		}while(!s.equals("1"));
			
		
	/*	for (Map.Entry<String, Integer> entry : m.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		   System.out.println(key);
		}	
		*/
		l.remove("1");
		sc.close();
		for(String s1:l)
		{
			System.out.println(s1);
		}
	

		
	}

}
