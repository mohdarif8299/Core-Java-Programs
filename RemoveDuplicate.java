import java.util.TreeSet;
import java.util.List;
import java.util.Arrays;
public class RemoveDuplicate
{
	public static void main(String[] args)
	{
		String [] str = {"hello","friends","chai","peelo","friends"};
		List newList = Arrays.asList(str);
		System.out.println(newList);
		TreeSet treeSet = new TreeSet(newList);
		System.out.println(treeSet);
	}
}