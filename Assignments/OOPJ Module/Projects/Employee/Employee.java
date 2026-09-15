
public abstract class Employee {
	
    protected String name;
    protected String address;
    protected int age;
    protected int gender;
    protected float basicSalary;

    public Employee(String name, String address, int age, int gender, float basicSalary) {
        this.name = name;
        this.address = address;
        setAge(age);
        this.gender = gender;
        this.basicSalary = basicSalary;
    }

    public String getName() { 
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }

    public String getAddress() { 
    	return address; 
    }
    public void setAddress(String address) { 
    	this.address = address; 
    }

    public int getAge() { 
    	return age; 
    }
    public void setAge(int age) {
        if (age < 18 || age > 65) this.age = 21;
        else this.age = age;
    }

    public int getGender() { 
    	return gender; 
    }
    public void setGender(int gender) {
    	this.gender = gender; 
    }

    public float getBasicSalary() { 
    	return basicSalary; 
    }
    public void setBasicSalary(float basicSalary) { 
    	this.basicSalary = basicSalary; 
    }
    
    public abstract String getRole();
    
    @Override
    public String toString() {
        String genderStr = (this.gender == 1) ? "Male" : "Female";
        return "[" + getRole() + "]\n Name: " + name + "\n Address: " + address + 
               "\n Age: " + age + "\n Gender: " + genderStr + "\n Salary: " + basicSalary;
    }
    
}    