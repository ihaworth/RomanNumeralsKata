package roman.numerals;

public class Roman
{
	public String generate(int number)
	{
		if (number > 1)
			return generate(1) + generate(number - 1);
		
		return "I";
	}
}
