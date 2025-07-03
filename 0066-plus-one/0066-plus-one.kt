class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val list = mutableListOf<Int>()
        var addition = 0

        for (i in digits.size-1 downTo 0) {
            if (i == digits.size-1) {
                val count = digits[i] + 1
                if (count >= 10) {
                    addition++
                    list.add(count%10)
                    if (i == 0) {
                        list.add(0,addition)
                    }
                } else {
                    list.add(count)
                }
            } else {
                val count = digits[i] + addition
                addition = 0
                if (count >= 10) {
                    addition++
                    list.add(0,count%10)
                    if (i == 0) {
                        list.add(0,addition)
                    }
                } else {
                    list.add(0,count)
                }
            }
        }

        return list.toIntArray()
    }
}