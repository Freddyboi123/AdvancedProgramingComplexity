package app;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Builder {


    public List<Integer> fillList(List list, int n){
        for (int i = 0; i < n ; i++){
            list.add(i);
        }
        return list;
    }

    public Set<Integer> fillSet(Set set, int n){
        for (int i = 0; i < n ; i++){
            set.add(i);
        }
        return set;
    }


    public Set<Student> fillSetWithStudents(Set set) {
        Student s1 = new Student("Frederik", 1);
        Student s2 = new Student("Emil", 2);
        Student s3 = new Student("Luke", 3);
        Student s4 = new Student("Daniel", 4);
        Student s5 = new Student("Oliver", 5);
        Student s6 = new Student("Snorre", 6);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);

        return set;
    }
    }

