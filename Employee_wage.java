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
      int workingday=1;
      int monthday=1;
      int monthlywage=0;
      int absent=0;
     Random rn=new Random();

     while(workingday!=20&&monthday!=30)
     {
         int check=rn.nextInt(3);

         switch (check)
         {
             case 0:
                 fullDayWage = perHourWage * fullTimeHour;
                 monthlywage+=fullDayWage;
                 monthday++;
                 workingday++;
                 break;
             case 1:
                 halfDayWage = perHourWage * partTimeHour;
                 monthlywage+=halfDayWage;
                 monthday++;
                 workingday++;
                 break;
             case 2:
                 absent++;
                 monthday++;
                 break;

         }
     }
     System.out.println("monthly wage :"+monthlywage);
     System.out.println("absent in month :"+absent);
     System.out.println("working day :"+workingday);
     System.out.println("monthday :"+monthday);

 }
}
