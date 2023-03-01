package org.example;

import java.util.Random;

class Employee_wage
{
 public  void Wage()
 {
     int perHourWage=20;
     int fullTimeHour=8;
     int partTimeHour=4;
      int fullDayWage;
     int halfDayWage;

     Random rn=new Random();
     int check=rn.nextInt(3);

     switch (check)
     {
         case 0:
             fullDayWage=perHourWage*fullTimeHour;
             System.out.println("Employee is Present for full day \nfullday wage:"+fullDayWage);
             break;
         case 1:
             halfDayWage=perHourWage*partTimeHour;
             System.out.println("Employee is Present for half day \nhalfday wage:"+halfDayWage);
             break;
         case 2:
             System.out.println("Employee is Absent\ndaily wage is: 0");
             break;

     }

 }
}
