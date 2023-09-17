package tri.nguyen;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDS {
    /*
    Priority Queue:     A FIFO data structure
                        that serves elements with the highest priorities first
                        before elements with lower priority
     */
    public static void main(String[] args){


        // LinkedList does not sort the order of the list
        Queue<Double> studentGPA1 = new LinkedList<>();
        System.out.println("Empty studentGPA: " + studentGPA1.isEmpty());

        // add students' GPA
        studentGPA1.offer(3.0);
        studentGPA1.offer(2.5);
        studentGPA1.offer(4.0);
        studentGPA1.offer(1.5);
        studentGPA1.offer(2.0);

        System.out.println("The students' GPA (LinkedList): " + studentGPA1);
        System.out.println("Empty studentGPA: " + studentGPA1.isEmpty());

        // display and remove each student's GPA while it's not empty
        // FIFO = first inserted element is removed first
        while(!studentGPA1.isEmpty()){
            System.out.println(studentGPA1.poll());
        }

        // The PriorityQueue will sort the order of the list
        Queue<Double> studentGPA2 = new PriorityQueue<>();
        System.out.println("Empty studentGPA: " + studentGPA1.isEmpty());

        // add students' GPA
        studentGPA2.offer(3.0);
        studentGPA2.offer(2.5);
        studentGPA2.offer(4.0);
        studentGPA2.offer(1.5);
        studentGPA2.offer(2.0);

        System.out.println("The students' GPA (PriorityQueue): " + studentGPA2);
        System.out.println("Empty studentGPA: " + studentGPA2.isEmpty());

        // display and remove each student's GPA while it's not empty
        // The items will be removed according to the priority
        while(!studentGPA2.isEmpty()){
            System.out.println(studentGPA2.poll());
        }

        // PriorityQueue with reverse order
        Queue<Double> studentGPA3 = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("Empty studentGPA: " + studentGPA3.isEmpty());

        // add students' GPA
        studentGPA3.offer(3.0);
        studentGPA3.offer(2.5);
        studentGPA3.offer(4.0);
        studentGPA3.offer(1.5);
        studentGPA3.offer(2.0);

        System.out.println("The students' GPA (PriorityQueue with reverse order): " + studentGPA3);
        System.out.println("Empty studentGPA: " + studentGPA3.isEmpty());

        // display and remove each student's GPA while it's not empty
        // The items will be removed according to the priority
        while(!studentGPA3.isEmpty()){
            System.out.println(studentGPA3.poll());
        }

        // The PriorityQueue will sort the order of the list
        Queue<String> studentGrade1 = new PriorityQueue<>();
        System.out.println("Empty studentGrade: " + studentGrade1.isEmpty());

        // add students' grade
        studentGrade1.offer("B");
        studentGrade1.offer("C");
        studentGrade1.offer("A");
        studentGrade1.offer("F");
        studentGrade1.offer("D");

        System.out.println("The students' grade (PriorityQueue): " + studentGrade1);
        System.out.println("Empty studentGrade: " + studentGrade1.isEmpty());

        // display and remove each student's GPA while it's not empty
        // The items will be removed according to the priority
        while(!studentGrade1.isEmpty()){
            System.out.println(studentGrade1.poll());
        }

        // The PriorityQueue with reverse order
        Queue<String> studentGrade2 = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("Empty studentGrade: " + studentGrade2.isEmpty());

        // add students' grade
        studentGrade2.offer("B");
        studentGrade2.offer("C");
        studentGrade2.offer("A");
        studentGrade2.offer("F");
        studentGrade2.offer("D");

        System.out.println("The students' grade (PriorityQueue): " + studentGrade2);
        System.out.println("Empty studentGrade: " + studentGrade2.isEmpty());

        // display and remove each student's GPA while it's not empty
        // The items will be removed according to the priority
        while(!studentGrade2.isEmpty()){
            System.out.println(studentGrade2.poll());
        }
    }
}
