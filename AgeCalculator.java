 class AgeCalculator{
 
	public static void main(String args[]){
	
	System.out.println("Enter th age..!");
	//int age = Integer.parseInt(args[0]);
	int age =27;
	
	if(age>0 && age<18){
		System.out.println("Kid..");
	}
	else if(age>=18 && age<=50){
		System.out.println("Adult..");
	}
	else{
		System.out.println("Senior Citizen");
	}
}
}