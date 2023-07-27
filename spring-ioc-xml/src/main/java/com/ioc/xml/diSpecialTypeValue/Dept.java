package com.ioc.xml.diSpecialTypeValue;

import java.util.List;

//公司类
public class Dept {
    private List<Emp> empList;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void info(){
        System.out.println(name + "info...");

        for (Emp emp : empList) {
            System.out.println(emp.getName());
        }
    }

}
