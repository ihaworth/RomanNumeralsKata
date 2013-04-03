package roman.numerals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class RomanNumeralsTest
{
	@Test
	public void oneInRomanNumeralsIsI()
	{
		assertThat(new Roman().generate(1), is(equalTo("I")));
	}
}
