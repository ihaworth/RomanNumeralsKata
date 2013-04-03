package roman.numerals;

public class Roman
{
	private String[] numerals = { "X", "IX", "V", "IV", "I" };
	private int[]      values = {  10,   9,   5,    4,   1  };

	public String generate(int number)
	{
		for (int i = 0; i < numerals.length; i++)
		{
			if (number >= values[i])
				return numerals[i] + generate(number - values[i]);
		}

		return "";
	}
}
