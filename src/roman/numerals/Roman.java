package roman.numerals;

public class Roman
{
	private String[] numerals = { "X", "IX", "V", "IV", "I" };
	private int[]      values = {  10,   9,   5,    4,   1  };

	public String generate(int number)
	{
		for (int i = 0; i < numerals.length; i++)
		{
			if (number > values[i])
				return generate(values[i]) + generate(number - values[i]);
			
			if (number == values[i])
				return numerals[i];
		}

		return null;
	}
}
