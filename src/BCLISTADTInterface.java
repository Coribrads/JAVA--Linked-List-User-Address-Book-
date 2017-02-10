// Author: Cori Nicole Bradshaw
// Class: BCLISTADTInterface
// This class is an interface used to allow creation of a linked list. 
// BCLISTADTInterface is implemented by BCSortedLinkedBasedList.java

interface BCLISTADTInterface {

    public void BCadd(int index, ExtPersonType data);

    public void BCremove(Object data);

    public Object BCget(int index);

    public int BCsize();


  //  public void BCcompare(int index, Object data, Object data2);

}
