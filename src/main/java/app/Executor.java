package app;


import java.sql.Array;
import java.util.LinkedList;
import java.util.List;

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


}
