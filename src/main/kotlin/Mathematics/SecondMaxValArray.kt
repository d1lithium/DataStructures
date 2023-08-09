package Mathematics

class SecondMaxValArray {
    fun findSecondMax(arr: IntArray): Int{
        var max = Integer.MIN_VALUE
        var secondMax = Integer.MIN_VALUE
        for (i in arr.indices){
            if(arr[i] > max){
                secondMax = max
                max = arr[i]
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i]
            }
        }
        return secondMax
    }
}
fun main(args: Array<String>){
    val numbers = intArrayOf(12,34,2,34,33,1)
    val classInstance = SecondMaxValArray()
    val secondMax = classInstance.findSecondMax(numbers)
    print("secondMax:  $secondMax")

}