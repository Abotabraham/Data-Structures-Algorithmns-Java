/**
 * linkedList implementation of queue
 *
 *@author George Abot Abraham Ret
 *@version 1.0, 03/09/2021
 */


public class QueueLinkedList {
  LinkedList list;

  public QueueLinkedList() {
    list = new LinkedList();
    System.out.println("The Queue is successfully created");
  }

  // isEmpty
  public boolean isEmpty() {
    if (list.head == null) {
      return true;
    } else {
      return false;
    }
  }

  //enQueue
  public void enQueue(int value) {
    list.insertInLinkedList(value, list.size);
    System.out.println("Successfully inserted "+value+" in the queue");
  }

  // deQueue
  public int deQueue() {
    int value = -1;
    if (isEmpty()) {
      System.out.println("The Queue is is Empty");
    } else {
      value = list.head.value;
      list.deletionOfNode(0);
    }
    return value;
  }

  //peek
  public int peek() {
    if (isEmpty()) {
      System.out.println("The Queue is Empty");
      return -1;
    } else {
      return list.head.value;
    }
  }

  //delete
  public void deleteQueue() {
    list.head = null;
    list.tail = null;
    System.out.println("The Queue is successfully deleted");
  }

}
