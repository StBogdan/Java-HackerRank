package com.company.DataStructures;

import java.util.*;

public class Java_PriorityQueue {


    static class Priorities{
        Comparator<Student> scomp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getCgpa()!= o2.getCgpa()){
                    return (int)(o2.getCgpa()*1000)- (int)(o1.getCgpa()*1000);
                }
                else if(o1.getName().compareTo(o2.getName()) !=0){
                    return o1.getName().compareTo(o2.getName());

                }
                else{
                    return o1.getId() - o2.getId();
                }
            }
        };


        List<Student> getStudents(List<String> events){
      PriorityQueue<Student> pq = new PriorityQueue<Student>(scomp);
            for(String event : events){
        String indivEvent = event.split(" ")[0];
        String[] eventElem = event.split(" ");
        if(indivEvent.compareTo("ENTER")==0){
            pq.add(new Student(Integer.parseInt(eventElem[3]),eventElem[1],Double.parseDouble(eventElem[2])));
        }
        else{
            pq.poll();
        }
    }
    ArrayList<Student> sl = new ArrayList<Student>();
            while(!pq.isEmpty()){
        sl.add( pq.poll());
    }
            return sl;
}
    }


    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}


