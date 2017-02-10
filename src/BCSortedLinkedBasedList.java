// Author: Cori Nicole Bradshaw
// Class: BCSortedLinkedBasedList
// This class implements the interface BCLISTADTInterface. It contains an inner Node Class (this is a linked list class)
// Essentially, this class creates the address books' linked list. 


public class BCSortedLinkedBasedList implements BCLISTADTInterface {
    
    // EXTPERSONTYPE REPLACE OBJECT
    
    // INNER CLASS: Node Class
    private class Node {

        ExtPersonType dataItem;
        Node nextNode;

        private Node(ExtPersonType item, Node node) {
            dataItem = item;
            nextNode = node;
        }

        private ExtPersonType getData() {

            return dataItem;
        }

        private Node getCurrentNode() {

            return nextNode;
        }
    }

    // variables
    private Node head = null;
    private int length = 0; // number of data items in the list

    public BCSortedLinkedBasedList() {
        //empty constructor
    }

    public void BCadd(int index, ExtPersonType data) {

        head = new Node(data, head);
        //data is the dataitem and head is the nextnode
        length = length + 1;
        //increase the linked list length by 1 everytime you add to the list

                /*if(length == 0){
            head = new Node(data,head);
            length = length + 1;
        }
     else{
            Node nodeRef = head;
            Node newNode = new Node(data,nodeRef.nextNode);
            if(newNode.dataItem.getlastChar() < nodeRef.dataItem.getlastChar() ){
                nodeRef = newNode.nextNode;
                newNode = head;
                length = length +1;

            }
            else{
               nodeRef.dataItem = data;
               length = length + 1;
            }
     }*/
    }

    public void BCremove(Object data) {
        Node nodeRef = head;
        Node nodePrev = null;
        //while head doesn't equal null, and the head dataitem equals data, then the previous node = head and length decreases
        while (nodeRef != null) {
            if (nodeRef.dataItem.equals(data)) {
                if (nodePrev == null) {
                    head = nodeRef.nextNode; // the head takes over the address of reference node
                } else {
                    nodePrev.nextNode = nodeRef.nextNode;// the address of previous node = the address of reference node.
                }
                length--;
            }
            nodePrev = nodeRef;
            nodeRef = nodeRef.nextNode;
        }
    }


    public Object BCget(int index) {
        Node nodeRef = head;
        int i = 0;

        while ((nodeRef != null) & (i <= index)) { //
            if (i == index) { //goes through the list and finds the reference node
                return (nodeRef.dataItem); // returns reference nodes data item
            } else {
                i++; // if i != index, increment i
                nodeRef = nodeRef.nextNode; // if i != index, the reference node = the next node.
            }
        }
        return (head.dataItem);
    }

    public int BCsize() {
        return length; // length increments or decrements dependng on which method is used throughout the program
    }

   /* public void BCcompare(int index, Object data, Object data2){
        Node nodeRef = head;
        Node nodeFront = nodeRef.nextNode;
        int i = 0;
        while(nodeRef != null && i <= index){
            if(data){

            }
        }
    }*/
}
