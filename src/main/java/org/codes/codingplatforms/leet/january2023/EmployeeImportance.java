package org.codes.codingplatforms.leet.january2023;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
@Data

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;


    public Employee(int id, int importance, int[] ints) {
        this.subordinates=new ArrayList<>();
        this.id=id;
        this.importance=importance;
        if(ints==null)
        {
            subordinates=null;
        }
        for(int i:ints)
        {
            subordinates.add(i);
        }
    }
};
public class EmployeeImportance {
    HashMap<Integer,Integer> importanc=new HashMap<>();
    HashMap<Integer,List<Integer>> subordinate=new HashMap<>();

    public static void main(String[] args) {
        Employee e=new Employee(1,5, new int[]{2, 3});
        Employee e1=new Employee(2,3, new int[]{});
        Employee e2=new Employee(3,3, new int[]{});
        EmployeeImportance emp=new EmployeeImportance();

        System.out.println(emp.getImportance(Arrays.asList(e,e1,e2),1));

    }

    public int getImportance(List<Employee> employees, int id) {
            for(int i=0;i<employees.size();i++)
            {
                Employee e=employees.get(i);
                importanc.put(e.id,e.importance);
                subordinate.put(e.id,e.subordinates);
            }
            return getImprtnce(id);
    }
    private int getImprtnce(Integer id)
    {
        Integer imp=importanc.get(id);
        List<Integer> list=subordinate.get(id);
        if(list==null)
        {
            return imp;
        }
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=getImprtnce(list.get(i));

        }
        return imp+sum;
    }

}
