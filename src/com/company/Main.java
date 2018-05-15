package com.company;

import com.sun.javafx.scene.layout.region.Margins;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner s1=new Scanner(System.in); System.out.println("ВВЕДИ имя");
        String name=s1.nextLine();
        Random r=new Random();

        System.out.println("WELCOME "+name);
        System.out.println(name+" WECCOME");
        String s="";
        int [] cf=new int[6];
        for(int i=0;i<6;i++) {
            cf[i] = r.nextInt();
            s=s+cf[i]+" ";
            System.out.println(cf[i]);
        }

        System.out.println(s);
        System.out.println("vvedu PAROL");
       String par=s1.nextLine();
       String par1="wer";
       if(par.equals(par1))
       {
           System.out.println("True");
       } else System.out.println("False");
        System.out.println("Enter 3 chisla");
        int l1=s1.nextInt();
        int l2=s1.nextInt();
        int l3=s1.nextInt();
        System.out.println(l1+" "+l2+" "+l3);
        System.out.println(l1+l2+l3);
        System.out.println(l1*l2*l3);
        int count=s1.nextInt();
        String s8="";
        String s9="";
        par1="";
        par=" ";
        int [] s4=new int[count];
        for(int i=0;i<count;i++)
        {
            s4[i]=s1.nextInt();
        }
        int l=0;
        int u=0;
        double e=0;
        int l5=0;
        int u5=0;
        double e5=0;
        int l4=0;
        String t="";
        for(int i=0;i<count;i++)
        {
            if(s4[i]/100>=1&&s4[i]/1000<1)
            {
                l=s4[i]/100;
                u=s4[i]%100/10;
                e=s4[i]%10;
                System.out.println();
                System.out.println(l+" "+u+" "+e);

            }
            for(int y=0;y<count;y++)
            {
                if(s4[y]/100>=1&&s4[y]/1000<1)
                { l5=s4[y]/100;
                    u5=s4[y]%100/10;
                    e5=s4[y]%10;
                    System.out.println(l5+" "+u5+" "+e5);
                }
                if(l5!=l&&u5!=u&&e5!=e)
                    l4++;
            }
            if(l4==count-1)
            { t=t+" "+s4[i]+" ";l4=0;}
            else if(t=="") t="N0";

        }
        for(int i=0;i<count;i++) {
            if (s4[i] % 2 == 0)
                par = par + " " + s4[i] + " ";
            else par1 = par1 + " " + s4[i] + " ";
            if(s4[i]%3==0||s4[i]%9==0)
                s8=s8+" "+s4[i]+" ";else
                    if(s4[i]%5==0&&s4[i]%7==0)
                        s9=s9+" "+s4[i]+" ";else
                            if(s9=="") s9="No";

        }
        s="";
        for(int i=1;i<count;i++)
        {if(s4[i-1]<=s4[i]) l1=s4[i];
            else l1=s4[i-1];
            if(s4[i-1]<=s4[i]) l2=s4[i-1];
            else l2=s4[i];
        }
        for(int i=1;i<count-1;i++)
        {if((s4[i-1]+s4[i+1])/2==s4[i]) s=s+" "+s4[i]+" ";
        else if(s=="") s="null";
        }

        System.out.println(par1+" "+"Непарні"+ "   Парні"+par);
        System.out.println("max "+l1+" min"+" "+l2);
        System.out.println("DIL na 9 || 3 "+s8+" Dil na 5&&7 "+s9);
        System.out.println("Sum two sysidnix chisel"+ s);
        System.out.println("Unique chisla");
        System.out.println(t);
        System.out.println("Щасливі номери");
        int n = s1.nextInt();
        int num = n;
        int mvd = 2;
        int mas[] = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            mas[i] = i;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int delloc = 2;
        while (delloc <= num) {
            int temp = delloc;
            while (delloc <= n) {
                if (mas[delloc] != 0) {
                    mas[delloc] = 0;
                    num--;
                }
                delloc += temp;
            }
            for (int j = 1; j <= n - num; ++j) {
                for (int k = 1; k <= n; ++k) {
                    if (mas[k] == 0 && k + 1 <= n) {
                        mas[k] = mas[k + 1];
                        mas[ + 1] = 0;
                    }
                }
            }
            for (int k = 1; k <= num; ++k) {
                System.out.print(mas[k] + " ");
            }
            delloc = mas[mvd];
            ++mvd;
            System.out.println();
        }
        System.out.print("Happy chisla ");
        for (int i = 1; i <= num; ++i) {
            System.out.print(mas[i] + " ");
        }
    }

}
