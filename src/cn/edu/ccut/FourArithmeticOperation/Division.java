package cn.edu.ccut.FourArithmeticOperation;

public class Division {                        //除法类
	public void rule(int x,int y){          //输入多少道除法题，最大数是多少
		Array arr=new Array();
		arr.array(x,y);
		for(int i = 0;i<x;i++) {
				System.out.println(arr.array[i][0]+"/"+arr.array[i][1]+"="+((double)arr.array[i][0]/(double)arr.array[i][1]));

		}
	}
}
