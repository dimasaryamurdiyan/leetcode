class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val tempChar = hashMapOf<Char, Int>()
        for (char in s) {
            tempChar.put(char, 1 + tempChar.getOrDefault(char, 0))
        }

        for (char in t) {
            if (!tempChar.contains(char)) {
                return false
            } else {
                if (tempChar.get(char) != null) {
                    tempChar.put(char, tempChar.getOrDefault(char, 0) - 1)
                }

                if (tempChar.get(char) == 0) {
                    tempChar.remove(char)
                }
            }
        }

        return tempChar.isEmpty()
    }
}