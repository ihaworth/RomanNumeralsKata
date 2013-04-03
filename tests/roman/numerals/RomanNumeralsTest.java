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
		assertThatIntegerGivesRoman(9, "IX");
		assertThatIntegerGivesRoman(11, "XI");
		assertThatIntegerGivesRoman(12, "XII");
		assertThatIntegerGivesRoman(13, "XIII");
		assertThatIntegerGivesRoman(14, "XIV");
		assertThatIntegerGivesRoman(15, "XV");
		assertThatIntegerGivesRoman(16, "XVI");
		assertThatIntegerGivesRoman(17, "XVII");
		assertThatIntegerGivesRoman(18, "XVIII");
		assertThatIntegerGivesRoman(19, "XIX");
	}

	private void assertThatIntegerGivesRoman(int number, String expectedRoman)
	{
		assertThat("Converting " + number, new Roman().generate(number), is(equalTo(expectedRoman)));
	}
}
