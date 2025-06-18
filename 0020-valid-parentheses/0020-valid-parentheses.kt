class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (char in s) {
            when (char) {
                ')' -> if (stack.isNotEmpty() && stack.last() == '(') stack.removeLast() else return false
                '}' -> if (stack.isNotEmpty() && stack.last() == '{') stack.removeLast() else return false
                ']' -> if (stack.isNotEmpty() && stack.last() == '[') stack.removeLast() else return false
                '(', '[', '{' -> stack.add(char)
            }
        }

        return stack.isEmpty()
    }
}