package app;


import java.sql.Array;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Executor {


public void getIndex(List list, int index){
    long startTime = System.nanoTime();
    System.out.println("Get index. Type: " + list.getClass());
    System.out.println("index looked up{ " + "index: " + index + "value: " + list.get(index));
    long endTime = System.nanoTime();
    System.out.println("That took: "  + (endTime - startTime) + " nano seconds"+ "\n");
}

    public void add(List list, int integer , int location){
        long startTime = System.nanoTime();
        list.add(location,integer);
        System.out.println("add. Type " + list.getClass());
        System.out.println("inserted " + integer + "at position " + location);
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    public void remove(List list, int index){
        long startTime = System.nanoTime();
        System.out.println("remove. Type " + list.getClass());
        list.remove(index);
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    public void addToFrontLoop(List list){
        long startTime = System.nanoTime();
        System.out.println("add 10000. Type " + list.getClass());

        for (int i = 0; i < 10000; i ++){
            list.addFirst(90);
        }
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }


    public void contains(List list , int n){
        long startTime = System.nanoTime();
        System.out.println("Contains Type " + list.getClass());

        if (list.contains(n)){
            System.out.println("List does contain " + n );
        } else {
            System.out.println("List does not contain " + n);
        }
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    public void contains(Set set , int n){
        long startTime = System.nanoTime();
        System.out.println("Contains Type " + set.getClass());

        if (set.contains(n)){
            System.out.println("Set does contain " + n );
        } else {
            System.out.println("Set does not contain " + n);
        }
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    public void remove(Set set, Student student){
        System.out.println(set);
        long startTime = System.nanoTime();
        System.out.println("removed student: Type " + set.getClass());
        set.remove(student);

        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
        System.out.println(set);
    }

    public void add(Set set, Student student){
        System.out.println(set);
        long startTime = System.nanoTime();
        System.out.println("added Student:  Type " + set.getClass());
        set.add(student);

        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
        System.out.println(set);
    }

    public void find(Set set, Student student){
        System.out.println(set);
        long startTime = System.nanoTime();
        System.out.println("Find Student:  Type " + set.getClass());
        boolean contains = set.contains(student);
        System.out.println("set contains student " + student + " : " + contains);
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
        System.out.println(set);
    }

    // Queue: offer() puts in, poll() takes out
    public void offer(Queue queue, int n){
        long startTime = System.nanoTime();
        System.out.println("offer. Type " + queue.getClass());
        queue.offer(n);
        System.out.println("inserted " + n + ". Next to be taken out: " + queue.peek());
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    public void poll(Queue queue){
        long startTime = System.nanoTime();
        System.out.println("poll. Type " + queue.getClass());
        System.out.println("took out " + queue.poll() + ". Next to be taken out: " + queue.peek());
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    public void offerLoop(Queue queue){
        long startTime = System.nanoTime();
        System.out.println("offer 10000. Type " + queue.getClass());

        for (int i = 0; i < 10000; i ++){
            queue.offer(-i);
        }
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    public void pollLoop(Queue queue){
        long startTime = System.nanoTime();
        System.out.println("poll 10000. Type " + queue.getClass());

        for (int i = 0; i < 10000; i ++){
            queue.poll();
        }
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    // Stack: push() puts in, pop() takes out (both at the front of the deque)
    public void push(Deque deque, int n){
        long startTime = System.nanoTime();
        System.out.println("push. Type " + deque.getClass());
        deque.push(n);
        System.out.println("pushed " + n + ". Next to be taken out: " + deque.peek());
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    public void pop(Deque deque){
        long startTime = System.nanoTime();
        System.out.println("pop. Type " + deque.getClass());
        System.out.println("popped " + deque.pop() + ". Next to be taken out: " + deque.peek());
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    public void pushLoop(Deque deque){
        long startTime = System.nanoTime();
        System.out.println("push 10000. Type " + deque.getClass());

        for (int i = 0; i < 10000; i ++){
            deque.push(i);
        }
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }

    public void popLoop(Deque deque){
        long startTime = System.nanoTime();
        System.out.println("pop 10000. Type " + deque.getClass());

        for (int i = 0; i < 10000; i ++){
            deque.pop();
        }
        long endTime = System.nanoTime();
        System.out.println("That took: "  + (endTime - startTime) + " nano seconds" + "\n");
    }
    }

