//package LinkedList;

public class SinglyLinkedList{
    SinglyNode head, tail;
    SinglyLinkedList(){
        head = null;
        tail = null;
    }
    void add(int val){
        SinglyNode newNode = new SinglyNode(val);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void display(){
        SinglyNode temp = head;
        if(temp==null) System.out.println("List is empty");
        else{
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    void remove(int val){
        SinglyNode prev = head, last = tail, curr = head.next;
        if(head.data == val){
            head = curr;
        }
        else{
            while(curr.data!=val && curr.next!=null){
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
        }
    }
}