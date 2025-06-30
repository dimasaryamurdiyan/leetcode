class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hash = hashMapOf<String, MutableList<String>>()

        for (s in strs) {
            val sortedS = s.toCharArray().sorted().joinToString("")
            hash.getOrPut(sortedS) {mutableListOf()}.add(s)
        }

        return hash.values.toList()
    }
}