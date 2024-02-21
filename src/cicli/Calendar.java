/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicli;

import java.util.*;

/**
 *
 * @author claudio.ghetta
 */
public class Calendar {
    static String ZellerCongruence(int day, int month, int year)
    {
        String ris = "";
        if (month == 1)
        {
            month = 13;
            year--;
        }
        if (month == 2)
        {
            month = 14;
            year--;
        }
        int q =day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        
        int h = q + 13 * (m + 1) / 5 + k + k / 4 + j/ 4 + 5 * j;
        h = h % 7;
        switch(h)
        {
            case 0:
                ris ="Saturday";
                break;
            case 1:
                ris ="Sunday";
                break;
            case 2:
                ris ="Monday";
                break;
            case 3:
                ris ="Tuesday";
                break;
            case 4:
                ris ="Wednesday";
                break;
            case 5:
                ris ="Thursday";
                break;
            case 6:
                ris ="Friday";
                break;
        }
        return ris;
    }
    
    
}
