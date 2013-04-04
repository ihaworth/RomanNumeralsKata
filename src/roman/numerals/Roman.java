package roman.numerals;

public class Roman
{
    private String[] numerals   = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    private int[] numeralValues = { 1000, 900, 500,  400, 100,  90,   50,  40,   10,   9,   5,    4,   1  };

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
