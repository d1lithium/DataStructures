package Mathematics

class ReverseArray {

    fun reverse(numbers: IntArray): IntArray{
        var start = 0
        var end = numbers.size - 1
        while (start < end){
            numbers[start] = numbers[start] + numbers[end]
            numbers[end] = numbers[start] - numbers[end]
            numbers[start] = numbers[start] - numbers[end]
            start++
            end--

        }
        return numbers
    }


}
fun main(args: Array<String>){
    var numbers = intArrayOf(2, 11, 50, 10, 7, 8)
    val reverseArray = ReverseArray()
    print("Before Reversing Array: ")
    numbers.forEach { i -> print(""+i+" ") }
    println()

    numbers = reverseArray.reverse(numbers)
    print("After Reversing Array:  ")
    numbers.forEach { i -> print(""+i+" ") }
}