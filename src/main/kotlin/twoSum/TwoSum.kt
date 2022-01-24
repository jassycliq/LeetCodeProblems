package twoSum

/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
 */

fun twoSum(nums: IntArray, target: Int): IntArray {
    val hash = hashMapOf<Int, Int>() // Create hashmap to store previously checked Ints

    /*
        Loop through [nums], check if hash contains value which when added with current value would sum up to target
        number. If it does, then current number's index and hash value at key are the answer. Otherwise, add current
        number to hash. If no indices are found, return empty IntArray.
     */
    for (i in nums.indices) {
        if (hash.containsKey(target - nums[i])) {
            val answer = hash[target - nums[i]]!!.toInt()
            return intArrayOf(answer, i)
        }
        hash[nums[i]] = i
    }
    return intArrayOf()
}
