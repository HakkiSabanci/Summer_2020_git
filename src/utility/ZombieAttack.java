package utility;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int day =0;
        int[] extinct = new int[8];
        System.out.println("Day "+day+" "+ Arrays.toString(inhabitants));
        while(true){
            for (int j =0; j<=inhabitants.length-1;j++){
                if(j<inhabitants.length-1){
                    if(inhabitants[j]!=0 && inhabitants[j+1]==0){
                        inhabitants[j]=inhabitants[j]/2;
                    }
                    if (inhabitants[j]==0 && inhabitants[j+1] != 0){
                        inhabitants[j+1]=inhabitants[j+1]/2;
                        j+=1;
                    }
                }
            }
            System.out.println("Day "+day+" "+ Arrays.toString(inhabitants));
            if (Arrays.equals(inhabitants,extinct)){
                break;
            }
            day++;
        }
        System.out.println("---- EXTINCT ----");
    }
}
