package Google;

public class addStrings {
	public static String addStrings(String num1, String num2) {
        int carry = 0, m = num1.length(), n = num2.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.max(m, n); i++) {
            int v1 = i >= m ? 0 : num1.charAt(m - i - 1) - '0';
            int v2 = i >= n ? 0 : num2.charAt(n - i - 1) - '0';
            int sum = v1 + v2 + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }
        if (carry == 1) sb.insert(0, 1);
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(addStrings("66","77"));

	}

}
