package cn.edu.ccut.FourArithmeticOperation;

import java.util.Random;

public class OperationMain {                                //�������㷽�������üӼ��˳���
	public static void main(String[] args) {           //Addition�ӷ���Subtraction������Multiplication�˷���Division����
		Addition add=new Addition();
		Subtraction sub=new Subtraction();
		Multiplication mul=new Multiplication();
		Division div=new Division();
		JudgementInput jud=new JudgementInput();
		int x,y;
		x=jud.judgement();
		y=jud.judgement();
		add.rule(5, 10);
		sub.rule(2, 10);
		mul.rule(2, 10);
		div.rule(1, 10);
	}
}

