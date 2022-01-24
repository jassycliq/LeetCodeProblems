package palindromeNumber

/*
    Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward.
    For example, 121 is a palindrome while 123 is not.
 */

fun isPalindrome(x: Int): Boolean {
    /*
        When given number is:
        1) negative then return false. According to problem, negative symbol doesn't allow for proper
        palindrome. i.e. -121 backwards is 121-
        2) equal to zero then return true as 0 backwards is 0.
        3) Anything else
     */
    return when {
        x < 0 -> false
        x == 0 -> true
        else -> {
            /*
                To reverse a number we need to divide a number by 10 in order to discover the last digit. We then get
                that digit that we removed and append it to the end of our reversed number. Final step is to actually
                remove said digit from original number by dividing by 10.
             */
            var reversed = 0
            var remainder: Int
            var original = x

            while (original != 0) {
                remainder = original % 10
                reversed = reversed * 10 + remainder
                original /= 10
            }
            return x == reversed
        }
    }
}
