import longestCommonPrefix.longestCommonPrefix
import palindromeNumber.isPalindrome
import romanToInteger.romanToInt
import twoSum.twoSum

fun main(args: Array<String>) {
    println(twoSum(nums = intArrayOf(2,7,11,15), target = 9).contentToString())
    println(twoSum(nums = intArrayOf(3,2,4), target = 6).contentToString())
    println(twoSum(nums = intArrayOf(3,3), target = 6).contentToString())

    println(isPalindrome(121))
    println(isPalindrome(-121))
    println(isPalindrome(10))

    println(romanToInt(s = "III"))
    println(romanToInt(s = "LVIII"))
    println(romanToInt(s = "MCMXCIV"))

    println(longestCommonPrefix(strs = arrayOf("flower","flow","flight")))
    println(longestCommonPrefix(strs = arrayOf("dog","racecar","car")))
}
