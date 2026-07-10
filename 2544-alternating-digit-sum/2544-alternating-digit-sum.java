class Solution {
    public int alternateDigitSum(int n) {

        int digits = 0;
        int temp = n;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            if (digits % 2 == 0)
                sum -= digit;
            else
                sum += digit;

            digits--;
            temp /= 10;
        }

        return sum;
    }
}