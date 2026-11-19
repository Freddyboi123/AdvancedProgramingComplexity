package app;


import java.sql.Array;
import java.util.LinkedList;
import java.util.List;
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
    }

