class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val shortestString = strs.minByOrNull { it.length }!!

        for (index in shortestString.indices) {
            val currentChar = shortestString[index]
            if (strs.any { it[index] != currentChar }) {
                return shortestString.substring(0, index)
            }
        }

        return shortestString
    }
}