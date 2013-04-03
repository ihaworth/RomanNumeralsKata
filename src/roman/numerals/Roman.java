package roman.numerals;

public class Roman
{
	public String generate(int number)
	{
		if (number > 5)
			return generate(5) + generate(number - 5);
		
		if (number == 5)
			return "V";
		
		if (number == 4)
			return "IV";
		
		if (number > 1)
			return generate(1) + generate(number - 1);
		
		return "I";
	}
}
