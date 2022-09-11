package SummerHomework;

public class Demo48 {
    /*任务48：使用选择排序法对数组中的整数按升序进行排序，如下所示：
原始数组：a[ ]={1,8,9,6,4,2,5,0,7,3}
排序后：  a[ ]={0,1,2,3,4,5,6,7,8,9}
要求：综合使用分支、循环结构语句实现，直接输出结果不计分。*/
    public static void main(String[] args) {
        int[] arr={1,8,9,6,4,2,5,0,7,3};
        int temp=arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length-1; i1++) {
                if (arr[i]<arr[i1]){
                    temp=arr[i1];
                    arr[i1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
