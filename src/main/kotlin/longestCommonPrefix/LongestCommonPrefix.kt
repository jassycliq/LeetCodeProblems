package longestCommonPrefix

import java.util.*

/*
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
 */

fun longestCommonPrefix(strs: Array<String>): String {
    return when (strs.size) {
        0 -> "" // Return empty string "" if there are no strings in the array.
        1 -> strs[0] // If there is only one string in the array, return it.
        else -> {
            /*
                Sort the array, from what I understand the reason for this is twofold:
                1) Strings are sorted from smallest to largest.
                2) If there is a string that is completely different, it will surface to either the top or bottom.
                TODO: Test for edge cases
             */
            Arrays.sort(strs)

            // Get the length of the shortest string, can't have common prefix if it's longer than the shortest word.
            val end = minOf(strs[0].length, strs[strs.size - 1].length)

            /*
                Loop through each character of first and last string, continue iterating until the shortest string
                size AND each character matches.
             */
            var i = 0
            while (i < end && strs[0][i] == strs[strs.size - 1][i]) i++

            // Once loop finishes, [i] should equal last matching character.
            return strs[0].substring(0, i)
        }
    }
}
