class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true
        
        var i = 0
        
        for(j in t.indices) {
            if (s[i] == t[j]) {
                i++
            }

            if (i == s.length) return true
        }

        return false
    }
}