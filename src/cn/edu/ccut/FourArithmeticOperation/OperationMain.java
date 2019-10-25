package cn.edu.ccut.FourArithmeticOperation;

import java.util.Random;

public class OperationMain {                                //四则运算方法，调用加减乘除类
	public static void main(String[] args) {           //Addition加法；Subtraction减法；Multiplication乘法；Division除法
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

