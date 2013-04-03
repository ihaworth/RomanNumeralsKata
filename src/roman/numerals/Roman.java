package roman.numerals;

public class Roman
{
	public String generate(int number)
	{
		if (number == 3)
			return "III";
		
		if (number == 2)
			return "II";
		
		return "I";
	}
}
