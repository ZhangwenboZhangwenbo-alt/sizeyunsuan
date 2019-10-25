package cn.edu.ccut.FourArithmeticOperation;

public class Addition {                        //加法类
	public void rule(int x,int y){          //输入多少道加法题，最大数是多少
		Array arr=new Array();
		arr.array(x,y);
		for(int i = 0;i<x;i++) {
				System.out.println(arr.array[i][0]+"+"+arr.array[i][1]+"="+(arr.array[i][0]+arr.array[i][1]));

		}
	}

	
}


