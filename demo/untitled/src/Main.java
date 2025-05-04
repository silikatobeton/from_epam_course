import java.util.*;

     class Node {
         int data;
         Node next;
         Node child;

         Node(int data) {
             this.data = data;
             this.next = null;
             this.child = null;
         }
     }

     public class Main {

         // A function to create a linked list with n (size) Nodes, returns head pointer
         static Node createList(int[] arr) {
             Node head = null;
             Node tmp = null;

             // Traversing the passed array
             for (int i = 0; i < arr.length; i++) {
                 // Creating a Node if the list is empty
                 if (head == null) {
                     tmp = head = new Node(arr[i]);
                 } else {
                     tmp.next = new Node(arr[i]);
                     tmp = tmp.next;
                 }

                 // Created a Node with data and setting child and next pointer as NULL.
                 tmp.child = null;
             }

             return head;
         }

         // To print linked list
         static void printMultiLevelList(Node head) {
             // While head is not null
             while (head != null) {
                 if (head.child != null) {
                     printMultiLevelList(head.child);
                 }
                 System.out.print(head.data + " ");
                 head = head.next;
             }
         }

         // Driver code
         public static void main(String[] args) {
             int[] arr1 = {1, 2, 3};
             int[] arr2 = {5, 6};
             int[] arr3 = {4};
             int[] arr4 = {7, 8, 9};

             // creating Four linked lists
             // Passing array and size of array as parameters
             Node head1 = createList(arr1);
             Node head2 = createList(arr2);
             Node head3 = createList(arr3);
             Node head4 = createList(arr4);

             // Initializing children and next pointers as shown in given diagram
             head1.child = head2;
             head1.next.next.child = head3;
             head2.next.child = head4;

             // Creating a null pointer.
             Node head = null;
             head = head1;

             // Function Call to print
             printMultiLevelList(head);

             // Clean up (Java does manual memory management, no cleanup needed in this case)
         }
     }



