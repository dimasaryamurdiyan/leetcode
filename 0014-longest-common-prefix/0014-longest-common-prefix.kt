class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val shortestString = strs.minByOrNull { it.length }!!

        for (i in shortestString.indices) {
            if (strs.any { it[i] != shortestString[i] }) {
                return shortestString.substring(0, i)
            }
        }

        return shortestString
    }
}