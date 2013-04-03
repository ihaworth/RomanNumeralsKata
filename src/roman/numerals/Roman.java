package roman.numerals;

public class Roman
{
	private String[] numerals   = { "XL", "X", "IX", "V", "IV", "I" };
	private int[] numeralValues = {  40,   10,   9,   5,    4,   1  };

	public String generate(int number)
	{
		for (int i = 0; i < numerals.length; i++)
		{
			if (number >= numeralValues[i])
				return numerals[i] + generate(number - numeralValues[i]);
		}

		return "";
	}
}
