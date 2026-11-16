package app;

import java.util.ArrayList;
import java.util.LinkedList;

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





    }
}
