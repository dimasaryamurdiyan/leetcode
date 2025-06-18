class Solution {
    fun myPow(x: Double, n: Int): Double {
        var xNew = x
        var nNew = n.toLong()

        if(nNew == 0L) {
            return 1.0
        }
        if(nNew < 0L) {
            xNew = 1 / x
            nNew = -nNew
        }

        var current = xNew
        var result = 1.0

        while(nNew > 0) {
            if (nNew % 2 == 1L) {
                result *= current
            }
            current *= current
            nNew /= 2
        }

        return result
    }
}