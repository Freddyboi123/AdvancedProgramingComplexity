package app;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Builder {


    public List<Integer> fillList(List list, int n){
        for (int i = 0; i < n ; i++){
            list.add(i);
        }
        return list;
    }

}
