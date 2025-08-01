class Solution {
    fun intToRoman(num: Int): String {
        val ones = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
        val tens = arrayOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
        val hundreds = arrayOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
        val thousands = arrayOf("", "M", "MM", "MMM")

        val builder = StringBuilder()

        builder.append(thousands[num / 1000])
        builder.append(hundreds[(num % 1000) / 100])
        builder.append(tens[(num % 100) / 10])
        builder.append(ones[num % 10])

        return builder.toString()
    }
}