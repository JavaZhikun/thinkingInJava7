package array;

public class IceCream 
{
	private static Random rand = new Random(47);
	static final String[] FLAVORS =
		{"Chocolate", "Strawberry", "acnanic",
		"Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
		"Praline Cream", "Mud pie"
		};
	
	public static String[] flavorSet(int n)
	{
		if(n > FLAVORS.length)
			throw new IllegalArgumentException("Set too big");
		String[] results = new String[n];
		boolean[] picked = new boolean[FLAVORS.length];
		for(int i = 0; i < n; i++)
		{
			int t;
			
		}
	}

}
