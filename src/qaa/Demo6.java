package qaa;

public class Demo6 {
  /*  第六题：
    在知识竞赛中，有10道判断题，评分规定：每答对一道题的两分，答错一道题要
    倒扣一分。小明答了全部题目，但最后只得了14分，编程求出他答错的题数。
    要求：用循环语句实现
*/
  public static void main(String[] args) {
      /*2x-(10-x)1=14  对8错2*/

      for (int i = 0; i < 10; i++) {
          if (2*i-(10-i)==14){
              System.out.println("错了："+(10-i)+"题");
          }
      }
  }
}
