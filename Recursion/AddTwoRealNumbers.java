
import static com.aditi.AddTwoLargeNumbers.findSum;

public class AddTwoRealNumbers {
    public static void main(String[] args)
    {
        String str1 = "584506134.87368350839565308";
        String str2 = "30598657.0330473560587475634983";

        System.out.println("Sum of " + str1 + " and " + str2 + " = " + findSumReal(str1, str2));        // the ans should be = 396323680063
    }

    public static String findSumReal(String str1, String str2) {
        String str1Int = Int(str1);
        String str2Int = Int(str2);
        String str1Frac = Frac(str1);
        String str2Frac = Frac(str2);

        int n1 = str1Frac.length();
        int n2 = str2Frac.length();
        String fracFilled = "";
        if (n1 < n2) {
            for (int i = 0; i < n1; i++) {
                fracFilled += str1Frac.charAt(i);
            }
            for (int i = n1; i < n2 ; i++) {
                fracFilled = fracFilled + '0';
            }
            str1Frac = fracFilled;
        } else {
            for (int i = 0; i < n2; i++) {
                fracFilled += str2Frac.charAt(i);
            }
            for (int i = n2; i < n1 ; i++) {
                fracFilled = fracFilled + '0';
            }
            str2Frac = fracFilled;
        }

        int n = str1Frac.length();


        String sumInt = findSum(str1Int, str2Int);
        String sumFrac = findSum(str1Frac, str2Frac);

        String sum = findSumRealUtil(sumInt, sumFrac, n);

        return sum;
    }

    public static String findSumRealUtil(String sumInt, String sumFrac, int nf) {
        int carry = 0;
        int sf = sumFrac.length();
        if(sumFrac.length() > nf) {    // there's a carry
            carry = (int)(sumFrac.charAt(nf) - '0');
            sf--;
        }

        String newSumFrac = "";
        for (int i = 0; i < sf; i++) {
            newSumFrac += sumFrac.charAt(i);
        }

        String newSumInt = "";
        for (int i = 0; i < sumInt.length(); i++)
        {
            int sum = ((int)(sumInt.charAt(i) - '0') + carry);
            carry = sum / 10;
            newSumInt += (char)(sum % 10 + '0');
        }

        newSumInt = new StringBuilder(newSumInt).reverse().toString();
        newSumFrac = new StringBuilder(newSumFrac).reverse().toString();

        return (newSumInt + "." + newSumFrac);

    }

    public static String Frac(String s) {
        String frac = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '.') {
                for (int j = i+1; j < s.length(); j++) {
                    frac = frac + s.charAt(j);
                }
                break;
            }
        }

        return frac;
    }

    public static String Int(String s) {
        String intg = "";
        for (int i = 0; i < s.length() && s.charAt(i) != '.'; i++) {
            intg = intg + s.charAt(i);
        }

        return intg;
    }

    static String findSum(String str1, String str2)
    {
        if (str1.length() > str2.length()){
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        String str = "";

        int n1 = str1.length(), n2 = str2.length();

        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int c = str1.length();
        int d = 0;
        while(c != 0)
        {
            d++;
            c--;
        }

        int carry = 0;
        for (int i = 0; i < n1; i++)
        {
            int sum = ((int)(str1.charAt(i) - '0') +
                    (int)(str2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        for (int i = n1; i < n2; i++)
        {
            int sum = ((int)(str2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        if (carry > 0)
            str += (char)(carry + '0');

        return str;
    }




}
