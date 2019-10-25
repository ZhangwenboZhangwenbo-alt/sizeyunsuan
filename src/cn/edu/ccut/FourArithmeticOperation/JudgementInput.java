package cn.edu.ccut.FourArithmeticOperation;

import java.util.Scanner;

public class JudgementInput {                         //判断输入的数是否是整数
	 public static int judgement(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("请输入一个数字");
         while (!scanner.hasNextInt()){
             System.out.println("你输入的不是一个数字，请输入一个数字");
             String string = scanner.next();
         }
         int a = scanner.nextInt();
        System.out.println("输入结束");
        return a;

    }
}
