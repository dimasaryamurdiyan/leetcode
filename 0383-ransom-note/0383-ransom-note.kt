class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val countChar = hashMapOf<Char, Int>()

        var count = 0

        for (char in magazine) {
            countChar.put(char, 1 + countChar.getOrDefault(char, 0))
        }

        for (char in ransomNote) {
            if (countChar.get(char) != null) {
                println(char)
                count++
                countChar.put(char, countChar.getOrDefault(char, 0) - 1)
            }

            if (countChar.get(char) == 0) {
                countChar.remove(char)
            }
        }

        return count == ransomNote.length
    }
}