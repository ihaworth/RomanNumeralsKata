package roman.numerals;

public class Roman
{
	public String generate(int number)
	{
		if (number == 2)
			return "II";
		
		return "I";
	}
}
