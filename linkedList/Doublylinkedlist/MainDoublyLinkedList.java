/**
 * DoublyLinkedList application class
 *
 *@author George Abot Abraham Ret
 *@version 1.0, 03/09/2021
 */


class Main {
  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.createDLL(1);
    dll.insertDLL(2, 0);
    dll.insertDLL(3, 1);
    dll.insertDLL(4, 7);
    dll.traverseDLL();
    dll.deleteDLL();
    dll.traverseDLL();
  }
}
