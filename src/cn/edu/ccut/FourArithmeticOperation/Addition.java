package cn.edu.ccut.FourArithmeticOperation;

public class Addition {                        //�ӷ���
	public void rule(int x,int y){          //������ٵ��ӷ��⣬������Ƕ���
		Array arr=new Array();
		arr.array(x,y);
		for(int i = 0;i<x;i++) {
				System.out.println(arr.array[i][0]+"+"+arr.array[i][1]+"="+(arr.array[i][0]+arr.array[i][1]));

		}
	}

	
}


