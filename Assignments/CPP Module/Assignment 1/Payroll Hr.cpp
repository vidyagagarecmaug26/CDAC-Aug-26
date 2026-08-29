#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

class Employee{
private:
	int empId;
	string name;
	string department;
	char grade;
	double basicSalary;
	bool isActive;
	static int employeeCount;

public:
	Employee(){
		employeeCount++;
		empId=1000+employeeCount;
		name=" ";
		department="Engineering";
		grade='D';
		basicSalary=10000.0;
		isActive=true;
	}

public:

	void setName(const string& n){
		if(n.empty()){
			cout<<"Error : Name cannot be empty"<<endl;
		}
		else{
			name=n;
		}
	}
	void setDepartment(const string& dept){
		if(dept=="Engineering"||dept=="HR"||dept=="Finance"||dept=="Operations"){
			department=dept;
		}
		else{
			cout<<"Error :'"<<dept<<"' is not a registered department."<<endl;
		}
	}
	void setGrade(char g){
		g=toupper(g);
		if(g=='A'||g=='B'||g=='C'||g=='D'){
			grade=g;
		}
		else{
			cout<<"Error : Invalid grade '"<<g<<"'. Accepted values: A, B, C, D."<<endl;
		}
	}
	void setBasicSalary(double salary){
		if(salary>10000 && salary<500000){
			basicSalary=salary;
		}
		else{
			cout<<"Error : Salary Must be between Rs.10,000 and Rs.5,00,000. Value rejected"<<endl;
		}
	}
	void deactivate(){
		isActive=false;
	}
	void activate(){
		isActive=true;
	}


	int getEmpId()const{
		return empId;
	}
	string getName()const{
		return name;
	}
	string getDepartment() const{
		return department;
	}
	char getGrade()const{
		return grade;
	}
	double getBasicSalary()const{
		return basicSalary;
	}
	bool getIsActive()const{
		return isActive;
	}

	double computeAllowances() const {
		if (grade == 'A')
			return 0.40 * basicSalary;
	    if (grade == 'B')
	    	return 0.30 * basicSalary;
	    if (grade == 'C')
	    	return 0.20 * basicSalary;
	    if (grade == 'D')
	    	return 0.10 * basicSalary;
	    return 0.0;
	}

	double computeGrossSalary() const {
	    return basicSalary + computeAllowances();
	}

	double computeTax() const {
		double gross = computeGrossSalary();
		if (gross <= 50000){
			return 0.0;
		}
		else if (gross <= 100000){
			return 0.10 * (gross - 50000);
		}
		else{
			return 5000 + (0.20 * (gross - 100000));
	    }
	}

	double computeNetSalary() const {
		return computeGrossSalary() - computeTax();
	}

	void printPaySlip() const {
		cout <<"==============================================="<<endl;
		cout <<"       EMPLOYEE PAYSLIP - AUG 2026" <<endl;
		cout <<"==============================================="<<endl;
		cout <<"Emp ID        : " << empId<<endl;
		cout <<"Name          : " << name <<endl;
		cout <<"Department    : " << department<<endl;
		cout <<"Grade         : " << grade <<endl;
		cout <<"Status        : " << (isActive ? "Active" : "Inactive")<<endl;
		cout <<"------------------------------------------------"<<endl;
		cout <<"Basic Salary  : Rs." << basicSalary <<endl;
		int allowance = (grade == 'A') ? 40 : (grade == 'B') ? 30 : (grade == 'C') ? 20 : 10;
		cout << "Allowances (" << allowance << "%): Rs. " << computeAllowances() << endl;
	    cout <<"Gross Salary  : Rs." << computeGrossSalary() <<endl;
	    cout <<"------------------------------------------------"<<endl;
	    cout <<"Tax Deduction : Rs." << computeTax() <<endl;
	    cout <<"Net Salary    : Rs." << computeNetSalary() <<endl;
	    cout <<"==============================================="<<endl;
	}

	static int getEmployeeCount(){
		return employeeCount;
	}
public:
	void acceptDetails(){
		string tempName, tempDept;
		char tempGrade;
		double tempSalary;

		cout<<"Enter Details of Employee ID"<<empId<<endl;

		// Clear remaining stream markers safely before using getline
		if(cin.peek()=='\n') cin.ignore();

		cout<<"Enter Name:"<<name<<endl;
		getline(cin,tempName);
		setName(tempName);

		cout<<"Enter Department (Engineering, HR, Finance, Operations): "<<endl;
		cin>>tempDept;
		setDepartment(tempDept);

		cout<<"Enter Grade (A, B, C, D): "<<endl;
		cin>>tempGrade;
		setGrade(tempGrade);

		cout<<"Enter BasicSalary:"<<endl;
		cin>>tempSalary;
		setBasicSalary(tempSalary);

	}

};
int Employee::employeeCount=0;

int main(){
	Employee e1;
	Employee* e2 = new Employee();
	Employee* e3 = new Employee();

	e1.acceptDetails();
	e2->acceptDetails();
	e3->acceptDetails();

	//e1.empId=999; //error: 'int Employee::empId' is private within this context
	//e1.basicSalary=-1000;//error: 'double Employee::basicSalary' is private within this context

	e1.printPaySlip();
	e2->printPaySlip();
	e3->printPaySlip();

	e3->deactivate();
	if(!e3->getIsActive())
		cout<<e3->getName()<<" is no longer active. Payroll skipped."<<endl;
	e3->activate();

	cout<<"Total Employees : "<<Employee::getEmployeeCount()<<endl;

	delete e2;
	delete e3;

	return 0;
}

