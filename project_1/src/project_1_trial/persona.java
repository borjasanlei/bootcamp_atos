package project_1_trial;

public class persona{
	
	// Variables
	String name;
	long age;
	String gender;
	
	// Methods
	public String getName()
	{
		return name;
	}
	
	public long getAge()
	{
		return age;
	}
	
	public String getGender()
	{
		return gender;
	}


public class employee extends persona{
	
	public employee(String company, String position) {
		super();
		this.company = company;
		this.position = position;
	}
	// Variables
	String company;
	String position;
	String upper_position;
	String lower_position;
	

	

}

}
