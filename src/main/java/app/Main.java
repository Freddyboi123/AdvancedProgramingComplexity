package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
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
    }
}
