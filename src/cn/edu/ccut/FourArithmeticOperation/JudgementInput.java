package cn.edu.ccut.FourArithmeticOperation;

import java.util.Scanner;

public class JudgementInput {                         //�ж���������Ƿ�������
	 public static int judgement(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("������һ������");
         while (!scanner.hasNextInt()){
             System.out.println("������Ĳ���һ�����֣�������һ������");
             String string = scanner.next();
         }
         int a = scanner.nextInt();
        System.out.println("�������");
        return a;

    }
}
