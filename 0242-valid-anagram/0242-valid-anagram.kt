class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val strS = String(s.toCharArray().apply { sort() })
        val strT = String(t.toCharArray().apply { sort() })

        return strS == strT
    }
}