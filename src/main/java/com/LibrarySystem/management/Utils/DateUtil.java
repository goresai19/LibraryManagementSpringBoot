package com.LibrarySystem.management.Utils;

import java.time.LocalDate;


public class DateUtil {
 
	
   public static LocalDate calculateReturendDate(LocalDate borrowedDate) {
	   return borrowedDate.plusMonths(1);
   }
  
}
