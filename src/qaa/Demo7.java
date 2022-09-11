package qaa;

import java.util.Scanner;

public class Demo7 {
    /*编写一个程序，对用户输入的任意一组字符如{3，1，4，7，2，1，1，2，2}，输
		出其中出现次数最多的字符，并显示其出现次数。如
		输出最先出现的那个字符和它出现的次数。例如，上面输入的字符集合中，“1”和“2”都出现
		了3次，均为最大出现次数，因为“1”先出现，则输出字符“1”和它出现的次数3次。
		要求：使用分支、循环结构语句实现。

*/
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        char[] arr=new char[10];
        int[] arr1=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            char c=sc.next().charAt(0);
            arr[i]=c;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    arr1[i]=arr1[i]+1;
                }

            }
         *//*   System.out.println(arr);*//*
        }
        int[] arr2=new int[10];
        int max=arr1[0];

        int index=arr2[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr1[i]>max){
                    max=arr1[i];
                System.out.println("字符"+arr[i]+" 出现次数最多为"+max+"并且最先输入");
            }


        }
*/



                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一组字符：");
                String str = sc.next();
                char[] chars = str.toCharArray();
                int firstCount = 0;
                char ch = chars[0];
                for (int i = 0; i < chars.length; i++) {
                    int count = 0;
                    for (int j = 0; j < chars.length; j++) {
                        if (chars[i] ==chars[j]){
                            count++;
                        }
                    }
                    if (count>firstCount){
                        firstCount= count;
                        ch = chars[i];
                    }
                }
                System.out.println("出现最多的次数为："+firstCount+" 出现次数最多的字符为："+ch);
            }
        }

