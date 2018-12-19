import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMapDemo
{
	static String name[] = {"ARIF","ANAS","IRFAN","SHAHBAZ","SHAHNAWAZ"};
	static String id[] = {"101","102","103","104","103"};
	public static void main(String[] args) {
		  Map<String,String> hm = new HashMap<String,String>();
		 for (int i=0;i<5;i++)
		 {
			hm.put(id[i],name[i]);
		 }
		 for(Map.Entry m:hm.entrySet()) {
			    String s1 = (String)m.getKey();
				String s2 = (String)m.getValue();
				 System.out.println(s1+" "+s2);
		 }
	}
}