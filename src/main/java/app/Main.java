package app;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
             Builder builder = new Builder();
             Executor executor = new Executor();

             ArrayList<Integer> arrayList = new ArrayList<>();
             LinkedList<Integer> linkedList = new LinkedList<>();

             builder.fillList(arrayList,500000);
             builder.fillList(linkedList, 500000);

             executor.getIndex(arrayList, 250000);
             executor.getIndex(linkedList,250000);

             executor.add(arrayList,99,250000);
             executor.add(linkedList,99,250000);

             executor.remove(arrayList, 250000);
             executor.remove(linkedList, 250000);

             executor.addToFrontLoop(arrayList);
             executor.addToFrontLoop(linkedList);

//-----------------------------------------------------------------

            ArrayList<Integer> arrayList2 = new ArrayList<>();
            HashSet<Integer> hashSet = new HashSet<>();

            builder.fillList(arrayList2, 500000);
            builder.fillSet(hashSet, 500000);

            executor.contains(arrayList2,0);
            executor.contains(hashSet,0);

            executor.contains(arrayList2,499999);
            executor.contains(hashSet,499999);

            executor.contains(arrayList2,1499999);
            executor.contains(hashSet,1499999);

        //-----------------------------------------------------------------

        TreeSet<Student> treeSet = new TreeSet<>();
        HashSet<Student> hashSet2 = new HashSet<>();

        builder.fillSetWithStudents(treeSet);
        builder.fillSetWithStudents(hashSet2);

        // O(log n)
        executor.remove(treeSet,new Student("Frederik",1));
        // O(1)
        executor.remove(hashSet2,new Student("Frederik", 1));

        // O(log n)
        executor.add(treeSet, new Student("Mette", 7));
        // O(1)
        executor.add(hashSet2, new Student("Mette", 7));

        // O(log n)
        executor.find(treeSet, new Student("Mette", 7));
        // O(1)
        executor.find(hashSet2, new Student("Mette", 7));

        //-----------------------------------------------------------------

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ArrayDeque<Integer> arrayDequeQueue = new ArrayDeque<>();
        ArrayDeque<Integer> arrayDequeStack = new ArrayDeque<>();

        builder.fillQueue(priorityQueue, 500000);
        builder.fillQueue(arrayDequeQueue, 500000);
        builder.fillQueue(arrayDequeStack, 500000);

        // O(log n) - new element is sifted up the heap
        executor.offer(priorityQueue, -1);
        // O(1) amortized - put at the tail
        executor.offer(arrayDequeQueue, -1);
        // O(1) amortized - put at the head
        executor.push(arrayDequeStack, -1);

        // O(log n) - last element moved to the root and sifted down
        executor.poll(priorityQueue);
        // O(1) - taken from the head
        executor.poll(arrayDequeQueue);
        // O(1) - taken from the head
        executor.pop(arrayDequeStack);

        // 10000 x O(log n)
        executor.offerLoop(priorityQueue);
        // 10000 x O(1)
        executor.offerLoop(arrayDequeQueue);
        // 10000 x O(1)
        executor.pushLoop(arrayDequeStack);

        // 10000 x O(log n)
        executor.pollLoop(priorityQueue);
        // 10000 x O(1)
        executor.pollLoop(arrayDequeQueue);
        // 10000 x O(1)
        executor.popLoop(arrayDequeStack);
    }
}
