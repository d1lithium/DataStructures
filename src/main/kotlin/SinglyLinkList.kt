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
            while (count+1 !== idx){
                current = current.next!!
                count++

            }
            var temp = current.next
            current.next = temp?.next
            length--
        }
    }

    fun deleteNodeOfValues(value: Any){
        var current = head
        var count = 0;
        var found: Boolean = false
        if (head.getValue() == value){
            head = head.next!!
            current = head
            length--
        }
        while (current.next !== null){
            if(current.next!!.getValue() == value){
                found = true
                if (current.next!!.getValue() == tail.getValue()){
                    var temp = current.next
                    current.next = temp!!.next
                    tail = current
                }
                else{
                    var temp = current.next
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

    var mySinglyLinkedList = SinglyLinkList()
    /*
     val firstNode = mySinglyLinkedList.ListNode(10)
     val secondNode = mySinglyLinkedList.ListNode(20)
     val thirdNode = mySinglyLinkedList.ListNode(30)
     val fourthNode = mySinglyLinkedList.ListNode(40)
     val fifthNode = mySinglyLinkedList.ListNode(50)


     mySinglyLinkedList.head = firstNode
     firstNode.next = secondNode
     secondNode.next = thirdNode
     thirdNode.next = fourthNode
     fourthNode.next = fifthNode
      */

    mySinglyLinkedList.insertAtTail(10)
    mySinglyLinkedList.insertAtHead(20)
    mySinglyLinkedList.insertAtTail(30)
    mySinglyLinkedList.insertAtHead(40)
    mySinglyLinkedList.insertAtTail(50)

    mySinglyLinkedList.insertAtHead("Moin")
    mySinglyLinkedList.insertAtHead("Raza")
    mySinglyLinkedList.insertAtHead("Khan")
    mySinglyLinkedList.insertAtHead("Pathan")

    mySinglyLinkedList.insertAtTail("Ameer")
    mySinglyLinkedList.insertAtTail("Hamza")
    mySinglyLinkedList.insertAtTail("Raza")
    mySinglyLinkedList.insertAtTail("Khan")
    mySinglyLinkedList.insertAtTail("Pathan")



    mySinglyLinkedList.display()
    print("\nhead: ${mySinglyLinkedList.head.getValue()}")
    print("\ntail: ${mySinglyLinkedList.tail.getValue()}")
    print("\nlength: ${mySinglyLinkedList.length()}")

    print("\ndeleteNode at index 4:")
    mySinglyLinkedList.deleteNodeAtIndex(4)
    println()
    mySinglyLinkedList.display()
    print("\nlength: ${mySinglyLinkedList.length()}")
    print("\nhead: ${mySinglyLinkedList.head.getValue()}")
    print("\ntail: ${mySinglyLinkedList.tail.getValue()}")

    mySinglyLinkedList.deleteNodeOfValues("Pathan")
    println()
    mySinglyLinkedList.display()
    print("\nlength: ${mySinglyLinkedList.length()}")
    print("\nhead: ${mySinglyLinkedList.head.getValue()}")
    print("\ntail: ${mySinglyLinkedList.tail.getValue()}")



}