package practise22;

import oops.Samsung;

public class Overrode {
       
	int i=100;
	String model="iqoo7";
	
	public void galaxyF41() {
	System.out.println("zero parameter");	
	}
	public void galaxyF41(int cost) {   //(int cost)=single parameter//
	System.out.println(cost);

	}
	public void galaxyF41(String model) { //single parameter with different data type//
		System.out.println(model);
		
	}
	public void galaxyF41(int cost,String model) {  //double parameter
		System.out.println(cost+"..."+model);
	}
	public void galaxyF41(String model,int cost) {  //double parameter but order of parameter are different//
		System.out.println(model+"...."+cost);
	}
	public static void main(String[] args) {
		Samsung kk=new Samsung();
		kk.galaxyF41();
		kk.galaxyF41();
		kk.galaxyF41();
		kk.galaxyF41();
		kk.galaxyF41();
	}
	
}
