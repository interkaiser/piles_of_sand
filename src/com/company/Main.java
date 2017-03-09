package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        sc.nextLine();
        int[][] field=new int[w][h];
        while(sc.hasNextInt()){
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            int q=sc.nextInt();
            field[x][y]=q;
        }
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
        while(!sc.next().equals("continue"));
        boolean chk=true;
        while(true){
            for(int i=0;i<w;i++){
                for(int j=0;j<h;j++){
                    if(field[i][j]>=4)chk=false;
                }
            }
            if(chk)break;
            for(int i=0;i<w;i++){
                for(int j=0;j<h;j++){
                    if(field[i][j]>3){
                        field[i][j]-=4;
                        if(j>0)field[i][j-1]++;
                        if(j<h-1)field[i][j+1]++;
                        if(i>0)field[i-1][j]++;
                        if(i<w-1)field[i+1][j]++;
                    }
                }
            }
            chk=true;
        }
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
    }
}
