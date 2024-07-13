package com.techacademy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {


    @GetMapping("/dayofweek/{yyyymmdd}")
    public String dispDayOfWeek(@PathVariable("yyyymmdd") String date) {

      int year =  Integer.parseInt(date.substring(0,4));
      int month = Integer.parseInt(date.substring(4,6));
      int day = Integer.parseInt(date.substring(6,8));

      Calendar calender = Calendar.getInstance();
      calender.set(year,month-1,day);

      int dayOfWeek = calender.get(Calendar.DAY_OF_WEEK);
      String[] weeks = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
      return weeks[dayOfWeek-1];
    }

    @GetMapping("/plus/{num1}/{num2}")
    public int calcPlus(@PathVariable int num1, @PathVariable int num2) {
        int plus = num1 + num2;
        return plus;
    }

    @GetMapping("/minus/{num1}/{num2}")
    public int calcMinus(@PathVariable int num1,@PathVariable int num2) {
        int minus = num1- num2;
        return minus;
    }

    @GetMapping("/times/{num1}/{num2}")
    public int calcTimes(@PathVariable int num1, @PathVariable int num2) {
        int times = num1* num2;
        return times;
    }

    @GetMapping("/divide/{num1}/{num2}")
    public int calcDivide(@PathVariable int num1, @PathVariable int num2) {
        int divide = num1/num2;
        return divide;
    }

    }




