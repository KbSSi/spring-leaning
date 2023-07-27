package com.ioc.xml.diSpecialTypeValue;

//员工类
public class Emp {

    //员工属于某个部门
    private Dept dept;

    private String name;
    private int age;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work(){
        System.out.println(name + "work...");
        dept.info();
    }
}
