class Funct{

	int age;
	String name;
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}

	public static void main(String args[]){
	
		Funct f = new Funct();
		f.age=21;
		f.name="QWERTY";
		
		System.out.println("Age is .. " + f.getAge());
		System.out.print("Name is .. " + f.getName());
	
		}
	
}

	
	