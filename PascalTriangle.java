//Adam Shaltout
class PascalTriangle
{
    public static void main(String[] args)
    {
	while (true)
	{
	    System.out.print("Enter number of rows between 1-20 (enter 0 to stop): ");
	    int n = In.getInt();
	    if (n == 0)
	    {
		break;
	    }
	    if (n < 0 || n > 20)
	    {
		System.out.println("Please enter a valid number.");
		continue;
	    }
	    System.out.println();
	    printPascal(n);
	    System.out.println();
	}
    }
    public static void printPascal(int n)
    {
	int numOfSpaces = (n-1)*4;
	double total;
	for (double i = 0; i < n; i++)
	{
	    for (int j = 0; j < numOfSpaces; j++)
	    {
		System.out.print(" ");
	    }
	    numOfSpaces -= 4;
	    for (double j = 0; j <= i; j++)
	    {
		total = factorial(i)/(factorial(j)*factorial(i-j));
		System.out.print((int)total);
		String s = String.valueOf((int)total);
		if (s.length() == 5)
		{
		    System.out.print("   ");
		}
		else if (s.length() == 4)
		{
		    System.out.print("    ");
		}
		else if (s.length() == 3)
		{
		    System.out.print("     ");
		}
		else if (s.length() == 2)
		{
		    System.out.print("      ");
		}
		else if (s.length() == 1)
		{
		    System.out.print("       ");
		}
	    }
	    System.out.println();
	}
    }
    public static double factorial(double base)
    {
	if (base == 0)
	{
	    return 1;
	}
	double total = base;
	for (double i = base-1; i > 0; i--)
	{
	    total *= base-i;
	}
	return total;
    }
}
