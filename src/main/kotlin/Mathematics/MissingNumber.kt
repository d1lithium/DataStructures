package Mathematics

class MissingNumber {
    fun findMissing(arr: IntArray): Int{
        var sum = (arr.size + 1) * (arr.size + 1 + 1) / 2
        println(sum)
        for (i in arr){
            sum -= i
            print("$sum ")
        }
        return sum
    }
}
fun main(args: Array<String>){
    val numbers = intArrayOf(2, 3, 1, 8, 5, 6, 7)
    val classInstance = MissingNumber()
    println("\nMissing Number in Array: "+classInstance.findMissing(numbers))

}