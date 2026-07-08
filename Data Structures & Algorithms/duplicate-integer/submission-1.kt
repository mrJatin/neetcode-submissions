class Solution {
    // HashSet
// Add	O(1)
// Remove	O(1)
// Contains	O(1)
// Linked -- Maintain insertion order
// Tree -- Automatically sorts Data
    fun hasDuplicate(nums: IntArray): Boolean {
        val baseHashSet = HashSet<Int>()
        for(n in nums){
        if(!baseHashSet.add(n)){
            return true
        }
        }
        return false
    }
}
