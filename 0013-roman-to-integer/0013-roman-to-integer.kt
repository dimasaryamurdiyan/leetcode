class Solution {
    fun romanToInt(s: String): Int {
        var temp = 0
        var result = 0
    
        for (i in s.length-1 downTo 0) {
            val char = s[i]
            var currentValue = 0
            when (char) {
                'I' -> currentValue = 1
                'V' -> currentValue = 5
                'X' -> currentValue = 10
                'L' -> currentValue = 50
                'C' -> currentValue = 100
                'D' -> currentValue = 500
                'M' -> currentValue = 1000
            }
            
            if(temp > currentValue) {
                result -= currentValue
            } else {
                result += currentValue
            }
            
            temp = currentValue
        }

        return result
    }
}