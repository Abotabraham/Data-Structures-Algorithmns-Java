/**
 * CircularSinglyLinkedList application class
 *
 *@author George Abot Abraham Ret
 *@version 1.0, 03/09/2021
 */


class Main {
  public static void main(String[] args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
    csll.createCSLL(5);
    csll.insertCSLL(4, 0);
    csll.insertCSLL(6, 1);
    csll.insertCSLL(7, 8);
    csll.traverseCSLL();
    csll.deleteCSLL();
    csll.traverseCSLL();

  }
}
