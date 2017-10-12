package com.javatests;

/*
* Given an integer (1 <= n <= 100) representing a person's age,
* return their minimum and maximum age range.
*
* min = age/2 + 7
* max = (age-7) * 2
*
* This equation doesn't work when the age <= 14, so use this equation instead:
* min = age - 0.10 * age
* max = age + 0.10 * age
* You should floor all your answers so that an integer is given
* instead of a float (which doesn't represent age).
* Return your answer in the form [min]-[max]
*
* Examples:
* age = 27   =>   20-40
* age = 5    =>   4-5
* age = 17   =>   15-20
*
*/
public class AgeRangeCompatabilityCalculator {
    public static String datingRange(int age) {
        int min;
        int max;

        if(age < 14) {
            min = (int)(age - (0.10 * age));
            max = (int)(age+(0.10 * age));
        } else {
            min = (int)((age/2)+7);
            max = (int)((age-7)*2);
        }
        return Integer.toString(min) +  "-" + Integer.toString(max);
    }
}
