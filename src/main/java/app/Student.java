package app;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int id;


    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student other)) {
            return false;
        }

        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, id);
    }

    @Override
    public String toString(){
        return "name: " + name + " ID: " + id;
    }
}
