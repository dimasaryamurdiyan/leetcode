class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val hash = hashMapOf<Char, Char>()

        for (i in s.indices) {
            if (hash.get(s[i]) != null) {
                if (hash.get(s[i]) != t[i]) return false
            } else {
                if (hash.containsValue(t[i])) return false 
            }

            hash.put(s[i], t[i])
        }

        return true
    }
}