package com.capgemini.asses.me;

public class DateCalculator {
   public int getDaysForMonth(int monthNumber) {
       int result = 0;
       switch (monthNumber) {
           case 1:
               result = 31;
               break;
           case 2:
               result = 29;
               break;
           case 3:
               result = 31;
               break;

           case 4:
               result = 30;
               break;
           case 5:
               result = 31;
               break;
           case 6:
               result = 30;
               break;
           case 7:
               result = 31;
               break;
           case 8:
               result = 31;
               break;
           case 9:
               result = 30;
               break;
           case 10:
               result = 31;
               break;
           case 11:
               result = 30;
               break;
           case 12:
               result = 31;
               break;
       }
               return result;














       }

    }

