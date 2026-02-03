package Conditions;

public class Main {
    static void main(String[] args) {
        int salary=2000;
        if(salary < 5000){
            salary = salary+2000;
        }else{
            salary = salary+1000;
        }
        System.out.println("salary is:"+salary);
    }
}

