package cn.edu.ccut.FourArithmeticOperation;

import java.util.Random;

public class Array {
	
	int array[][];
    int medium[];  
    
	public void array(int range,int result){       //range���ٵ��� ��result��ֵ����Ƕ���
		Random r=new Random();                         //���������
		array=new int[range+1][2];
		medium=new int[2];
		for(int x=1;x<=range;x++) {                  //
			do {
				for(int y=1;y<=2;y++) {                 //����ѭ�����������������
					medium[y-1]=r.nextInt(result);                 //����0-result��Χ�ڵ������
		       }
			}
			while(repeat(x));//����repeat������������������жԱ���ȷ���ظ����ظ��򷵻����������ֵ
			array[x-1][0]=medium[0];
			array[x-1][1]=medium[1];
		}
		
	}  
    
    
    
    
	public boolean repeat(int x){       //������������жԱȣ�ȷ���Ƿ��ظ������ظ��Ļ�����true�ظ��Ļ�����false
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

			if(medium[0]==array[i-1][0]&&medium[1]==array[i-1][1]){//��ͬ����false
				return false;
		}
	}
		return true;
	}
}
		
