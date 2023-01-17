package arraylist;

public class SetList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Set> set= new HashSet();
		set.add(new Set("IPhone",20000));
		set.add(new Set("Samsung",18000));
		set.add(new Set("Xiaomi",15000));
		set.add(new Set("Vivo",12000));
		
		Iterator<Set> itr= set iterator();
		
		while(itr.hasNext())
		{
			System.out.println(next());
		}

	}

}
