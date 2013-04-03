package roman.numerals;

public class Roman
{
	public String generate(int number)
	{
		if (number > 10)
			return generate(10) + generate(number - 10);
		
		if (number == 10)
			return "X";
		
		
		if (number > 9)
			return generate(9) + generate(number - 9);
		
		if (number == 9)
			return "IX";
		
		
		if (number > 5)
			return generate(5) + generate(number - 5);
		
		if (number == 5)
			return "V";
		
		if (number > 4)
			return generate(4) + generate(number - 4);
		
		if (number == 4)
			return "IV";
		
		
		if (number > 1)
			return generate(1) + generate(number - 1);
		
		return "I";
	}
}
