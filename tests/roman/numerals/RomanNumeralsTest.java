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
	}

	private void assertThatIntegerGivesRoman(int number, String expectedRoman)
	{
		assertThat("Converting " + number, new Roman().generate(number), is(equalTo(expectedRoman)));
	}
}
