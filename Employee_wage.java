package org.example;

import java.util.Random;

class Employee_wage
{
 public  void Wage()
 {
     int perHourWage=20;
     int fullTimeHour=8;
     int partTimeHour=4;
      int perDayWage;
     Random rn=new Random();
     int a=rn.nextInt(3);
     if (a==0)
     {
         perDayWage=perHourWage*fullTimeHour;
         System.out.println("Employee is Present for full day \nDaily wage:"+perDayWage);
     }
    else if (a==1)
     {
         perDayWage=perHourWage*partTimeHour;
         System.out.println("Employee is Present for half day \nDaily wage:"+perDayWage);
     }
     else
     {
         System.out.println("Employee is Absent\ndaily wage is: 0");
     }
 }
}
