/**
 * File : Lab7_problem1010.java
 * Assignment : Lab 7
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : April 27, 2017
 * Version : 1.0
 *
 * This file creates a Queue class which creates a queue. 
 * The program then enters the number 1 through 20 into the queue and prints the result.
 */

import java.util.Arrays;

public class Lab7_problem1010{
  public static void main(String[] args){
    Queue queue1 = new Queue();
    for (int i =1; i<=20; i++){
      queue1.enqueue(i);
    }

    while(!queue1.empty()){
      System.out.print(queue1.dequeue() + " ");
    }

  }

  public static class Queue{
    private int[] elements;
    private int size=0;
    
    public Queue(){
      elements = new int[8];
    }

    void enqueue(int v){
      if(size >= elements.length){
        int newarray[] = new int[elements.length * 2];
        System.arraycopy(elements, 0, newarray, 0, elements.length);
        elements = newarray;
      }
      elements[size] = v;
      size++;
    }
    
    public int dequeue(){
      int v = elements[0];
      for(int i =0; i < size-1; i++){
        elements[i] = elements[i+1];
      }
      size = size-1;
      return v;
    }

    public boolean empty(){
      return (size == 0);
    }

    public int getSize(){
      return size;
    }

  }






















}