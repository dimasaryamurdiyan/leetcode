class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val shortestString = strs.minByOrNull { it.length }!!
        val builder = StringBuilder()
        for (i in shortestString.indices) {
            if (strs.any { it[i] != shortestString[i] }) {
                return builder.toString()
            } else {
                builder.append(shortestString[i])
            }
        }

        return builder.toString()
    }
}