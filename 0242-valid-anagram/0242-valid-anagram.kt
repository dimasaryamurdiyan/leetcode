class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val countCharS = hashMapOf<Char, Int>()
        val countCharT = hashMapOf<Char, Int>()

        for (i in s.indices) {
            countCharS.put(s[i], 1 + countCharS.getOrDefault(s[i], 0))
            countCharT.put(t[i], 1 + countCharT.getOrDefault(t[i], 0))
        }

        return countCharS == countCharT
    }
}