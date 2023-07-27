package com.ioc.xml.diMap;

import java.util.List;
import java.util.Map;

public class Student {
    private String sname;

    private String sage;
    private List<Lesson> lessonList;

    private Map<Integer, Teacher> map;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public Map<Integer, Teacher> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Teacher> map) {
        this.map = map;
    }

    public void run(){
        for (Map.Entry<Integer, Teacher> entry : map.entrySet()) {
            System.out.println("学生名字为："+sname +'\t');
            System.out.println("他的老师编号为" + entry.getKey() + '\t');
            System.out.println("他的老师为"+entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sage='" + sage + '\'' +
                ", lessonList=" + lessonList +
                ", map=" + map +
                '}';
    }
}
