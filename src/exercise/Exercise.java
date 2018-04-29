package exercise;

import java.util.*;

public class Exercise
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        
        int apples = 0;
        
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            
            int applePos = a + apple[apple_i];
            
            if (applePos >= s && applePos <= t)
            {
                apples++;
            }
        }
        
        int[] orange = new int[n];
        
        int oranges = 0;
        
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            
            int orangePos = b + orange[orange_i];
            
            if (orangePos >= s && orangePos <= t)
            {
                oranges++;
            }
        }
        
        in.close();
        
        System.out.println(apples);
        System.out.println(oranges);        
        
    }
}