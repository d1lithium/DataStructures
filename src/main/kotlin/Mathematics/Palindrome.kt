package Mathematics

class Palindrome {

    fun isPalindrome(str: String): Boolean{
        var isPalind = true
        var start = 0
        var end = str.length - 1
        while (start != end){
            if(str[start] != str[end]){
                isPalind = false
                break
            }
            start ++
            end --
        }
        return isPalind
    }

}
fun main(args: Array<String>){
    val str = "that"
    val classInstance = Palindrome()
    println("\n isPalindrome:  "+classInstance.isPalindrome(str))

}