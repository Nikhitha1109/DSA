import java.util.*;
public class TaxCalculator{
public static void main(String[] args) {
    int salary = 1800000;
    float tax = 60000;
    if(salary<=1200000){
        System.out.println("tax to be paid is " + 0);
    }else if(salary>1200000 && salary<=1600000){
        tax += (salary-1200000)*0.15;
    }else if(salary>1600000 && salary<=2000000){
        tax+=60000 + (salary-1600000)*0.2;
    }
    else if(salary>2000000 && salary<=2400000){
        tax += 200000 + (salary-2000000)*0.25;
    }else{
        tax += 300000 + (salary-2400000)*0.3;
    }
    System.out.println("tax to be paid for " + salary + " is "+tax);
    System.out.println("your effective salary after tax deduction is " + (salary - tax));
}   
}


