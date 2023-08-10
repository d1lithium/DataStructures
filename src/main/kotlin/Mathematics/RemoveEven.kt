package Mathematics

class RemoveEven {

    fun removeEvenIntegers(arr: IntArray):IntArray{
        var oddCount = 0
        for (i in arr){
         if(i%2 != 0)
             oddCount++
     }
        println("oddCount: $oddCount")
        val oddIntArr = IntArray(oddCount)
        println("Array size: "+oddIntArr.size)
        var idx = 0
     for (i in arr){
         if(i%2 != 0){
             oddIntArr[idx] = i
             idx++
         }
     }
     return oddIntArr
    }
}
fun main(args: Array<String>){
    var numbers = intArrayOf(3, 2, 4, 7, 10, 6, 5)
    val classInstance = RemoveEven()
    print("Before: ")
    numbers.forEach { i -> print(""+i+" ") }
    println()

    numbers = classInstance.removeEvenIntegers(numbers)
    print("After:  ")
    numbers.forEach { i -> print(""+i+" ") }
}
