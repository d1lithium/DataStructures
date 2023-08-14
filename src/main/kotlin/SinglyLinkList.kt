class SinglyLinkList {
    lateinit var head: ListNode
    lateinit var tail: ListNode
    private var length = 0

    inner class ListNode(private var value: Any?) {
        var next: ListNode? = null

        fun getValue(): Any{
            return this.value!!
        }
    }

    fun insertAtTail(value: Any?){
        val newNode = ListNode(value)
        if (this::head.isInitialized){
            var tempNode = head
            while (tempNode.next !== null)
                tempNode = tempNode.next!!
            tempNode.next = newNode
            tail = newNode
            length++
        }
        else{
            head = newNode
            length++
        }

    }

    fun insertAtHead(value: Any?){
        val newNode = ListNode(value)
        newNode.next = head
        head = newNode
        length++

    }

    fun display(){
        var current: ListNode? = head
        while (current != null){
            print("${current.getValue()}-->")
            current = current.next
        }
        print("null")
    }

    fun length() = length

    fun deleteNodeAtIndex(idx: Int){
        var count = 0
        var current = head
        if(idx == 0){
            head = current.next!!
            length--
        }
        else if(idx >= length)
            print("Invalid index")
        else{
            while (count+1 != idx){
                current = current.next!!
                count++

            }
            val temp = current.next
            current.next = temp?.next
            length--
        }
    }

    fun deleteNodeOfValues(value: Any){
        var current = head
        var found = false
        if (head.getValue() == value){
            head = head.next!!
            current = head
            length--
        }
        while (current.next !== null){
            if(current.next!!.getValue() == value){
                found = true
                if (current.next!!.getValue() == tail.getValue()){
                    val temp = current.next
                    current.next = temp!!.next
                    tail = current
                }
                else{
                    val temp = current.next
                    current.next = temp!!.next
                }
                length--
            }
            else {
                current = current.next!!
            }
        }
        if (!found)
            print("\nnode with value '$value' not found")




    }

}
fun main(args: Array<String>) {

    val mySinglyLinkList = SinglyLinkList()

    mySinglyLinkList.insertAtTail(10)
    mySinglyLinkList.insertAtHead(20)
    mySinglyLinkList.insertAtTail(30)
    mySinglyLinkList.insertAtHead(40)
    mySinglyLinkList.insertAtTail(50)

    mySinglyLinkList.insertAtHead("Moin")
    mySinglyLinkList.insertAtHead("Raza")
    mySinglyLinkList.insertAtHead("Khan")
    mySinglyLinkList.insertAtHead("Pathan")

    mySinglyLinkList.insertAtTail("Ameer")
    mySinglyLinkList.insertAtTail("Hamza")
    mySinglyLinkList.insertAtTail("Raza")
    mySinglyLinkList.insertAtTail("Khan")
    mySinglyLinkList.insertAtTail("Pathan")



    mySinglyLinkList.display()
    print("\nhead: ${mySinglyLinkList.head.getValue()}")
    print("\ntail: ${mySinglyLinkList.tail.getValue()}")
    print("\nlength: ${mySinglyLinkList.length()}")

    print("\ndeleteNode at index 4:")
    mySinglyLinkList.deleteNodeAtIndex(4)
    println()
    mySinglyLinkList.display()
    print("\nlength: ${mySinglyLinkList.length()}")
    print("\nhead: ${mySinglyLinkList.head.getValue()}")
    print("\ntail: ${mySinglyLinkList.tail.getValue()}")

    mySinglyLinkList.deleteNodeOfValues("Pathan")
    println()
    mySinglyLinkList.display()
    print("\nlength: ${mySinglyLinkList.length()}")
    print("\nhead: ${mySinglyLinkList.head.getValue()}")
    print("\ntail: ${mySinglyLinkList.tail.getValue()}")



}