package roman.numerals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class RomanNumeralsTest
{
	@Test
	public void checkIntegerToRomanNumeralConversion()
	{
		assertThatIntegerGivesRoman(1, "I");
		assertThatIntegerGivesRoman(2, "II");
		assertThatIntegerGivesRoman(3, "III");
		assertThatIntegerGivesRoman(5, "V");
		assertThatIntegerGivesRoman(4, "IV");
		assertThatIntegerGivesRoman(6, "VI");
		assertThatIntegerGivesRoman(7, "VII");
		assertThatIntegerGivesRoman(8, "VIII");
		assertThatIntegerGivesRoman(10, "X");
	}

	private void assertThatIntegerGivesRoman(int number, String expectedRoman)
	{
		assertThat("Converting " + number, new Roman().generate(number), is(equalTo(expectedRoman)));
	}
}
