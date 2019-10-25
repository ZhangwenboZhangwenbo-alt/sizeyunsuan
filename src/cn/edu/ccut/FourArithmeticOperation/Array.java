package cn.edu.ccut.FourArithmeticOperation;

import java.util.Random;

public class Array {
	
	int array[][];
    int medium[];  
    
	public void array(int range,int result){       //range多少道题 ，result数值最大是多少
		Random r=new Random();                         //声明随机数
		array=new int[range+1][2];
		medium=new int[2];
		for(int x=1;x<=range;x++) {                  //
			do {
				for(int y=1;y<=2;y++) {                 //利用循环把随机数赋给数组
					medium[y-1]=r.nextInt(result);                 //定义0-result范围内的随机数
		       }
			}
			while(repeat(x));//调用repeat方法，用两个数组进行对比来确定重复，重复则返回重新随机赋值
			array[x-1][0]=medium[0];
			array[x-1][1]=medium[1];
		}
		
	}  
    
    
    
    
	public boolean repeat(int x){       //对两个数组进行对比，确定是否重复，不重复的话返回true重复的话返回false
		if(x==1) {                      
			return false ;
		}else if(repeat1(x)) {                    
			return false ;
		}else {
			return true ;
		}
	}
   
	public boolean repeat1(int x) {
		for(int i=1;i<=x;i++) {

			if(medium[0]==array[i-1][0]&&medium[1]==array[i-1][1]){//相同返回false
				return false;
		}
	}
		return true;
	}
}
		
