package list_assignments;
import java.util.ArrayList;
import java.util.Iterator;
public class Assignment1 {
public static void main(String[] args)
{
	ArrayList<String> months=new ArrayList<String>();
	months.add("January");
	months.add("February");
	months.add("March");
	months.add("May");
	months.add("June");
	months.add("July");
	months.add("August");
	months.add("September");
	months.add("October");
	months.add("November");
	months.add("December");
	Iterator mitr=months.iterator();
	while(mitr.hasNext())
	{
		System.out.println(mitr.next());
	}
}
}
