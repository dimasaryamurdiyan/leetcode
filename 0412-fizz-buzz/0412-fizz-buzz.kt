class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val output = mutableListOf<String>()
        for (i in 1..n) {
            if (i.isDivisibleBy(3) && i.isDivisibleBy(5)) {
                output.add("FizzBuzz")
            } else if (i.isDivisibleBy(3)) {
                output.add("Fizz")
            } else if (i.isDivisibleBy(5)) {
                output.add("Buzz")
            } else {
                output.add("${i}")
            }
        }

        return output.toList()
    }

    fun Int.isDivisibleBy(x: Int) = this % x == 0
}