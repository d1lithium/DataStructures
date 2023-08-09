package Mathematics

class MovingZerosArray {
    fun moveZeros(numbers: IntArray): IntArray{
        for(i in numbers.indices){
            for(j in numbers.indices){
                if(j> i && numbers[i] == 0 && numbers[j] != 0){
                    val temp = numbers[i]
                    numbers[i] = numbers[j]
                    numbers[j] = temp
                }
                else{
                    j.inc()
                }
            }
        }
        return numbers
    }
}
fun main(args: Array<String>){
   // var numbers = intArrayOf(0, 1, 0, 4, 12)
    var numbers = intArrayOf(8, 1, 0, 2, 1, 0 , 3)

    val movingZerosArray = MovingZerosArray()
    print("Before Moving Zeros: ")
    numbers.forEach { i -> print(""+i+" ") }
    println()
    numbers = movingZerosArray.moveZeros(numbers)
    print("After Moving Zeros:  ")
    numbers.forEach { i -> print(""+i+" ") }

}