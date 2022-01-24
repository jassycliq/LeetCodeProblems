package romanToInteger

/*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is
    simply X + II. The number 27 is written as XXVII, which is XX + V + II. Roman numerals are usually written largest
    to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as
    IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine,
    which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.
 */

fun romanToInt(s: String): Int {
    // Create hash of Roman Numeral and their Integer equivalent
    val romanNum = hashMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var answer = 0
    var prev = 0
    var current: Int

    /*
        Loop through string characters starting from the end. When current number is smaller than previous, subtract it
        as Roman Numerals use smaller numbers in front of larger ones to subtract. Otherwise, add current value to
        answer.
     */
    for (i in s.indices.reversed()) {
        current = romanNum[s[i]]!!
        when {
            current < prev -> answer -= current
            else -> answer += current
        }
        prev = current
    }
    return answer
}
