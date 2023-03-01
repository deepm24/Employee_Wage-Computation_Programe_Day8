package org.example;

import java.util.Random;

class Employee_wage
{
 public  void Wage()
 {
     int perHourWage=20;
     int fullDayHour=8;
      int perDayWage;
     Random rn=new Random();
     int a=rn.nextInt(2);
     if (a==0)
     {
         perDayWage=perHourWage*fullDayHour;
         System.out.println("Employee is Present \n Daily wage:"+perDayWage);
     }
     else
     {
         System.out.println("Employee is Absent\n daily wage is: 0");
     }
 }
}
