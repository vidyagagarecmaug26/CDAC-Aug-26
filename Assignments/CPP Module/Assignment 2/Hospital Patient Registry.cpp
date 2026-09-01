#include <iostream>
#include<string>
using namespace std;

class Patient{
	int patientId;
	string name;
	int age;
	string ward;
	const string bloodGroup;
public:

	Patient():bloodGroup("O+"){
		patientId=0;
		name="Unknown";
		age=0;
		ward="General";
		cout<<"[Constructor] Default patient registered."<<endl;
	}
	Patient(int id, const string& pName):bloodGroup("Unknown"){
		patientId=id;
		name=pName;
		age=0;
		ward="Emergency";
		cout<<"[Constructor] Emergency: "<<name<<endl;
	}

	Patient(int id, const string& pName, int pAge, const string& pWard, const string& bg): bloodGroup(bg){
		patientId=id;
		name=pName;
		age=pAge;
		ward=pWard;
		cout<<"[Constructor] Full admission :"<<name<<endl;
		}

	~Patient(){
		cout<< "[Destructor] Patient " << name << " discharged."<<endl;
	}

	void displayRecord()const{
		cout<<"Patient Record:"<<endl;
		cout<<"ID          :" <<patientId<<endl;
		cout<<"Name        :" <<name<<endl;
		cout<<"Age         :" <<age<<endl;
		cout<<"Ward        :" <<ward<<endl;
		cout<<"Blood Group :" <<bloodGroup<<endl<<endl;
	}


	void transferWard(const string& newWard){
		cout<<"Ward Transfer: "<<name<<" -> "<<newWard<<endl<<endl;
		ward=newWard;
	}

};



int main() {

	Patient p1(1001, "Meera Joshi",34,"Cardiology","B+");
	Patient p2(1002, "Raj Patel");
	Patient p3;

	Patient *arr=new Patient[4];

	for(int i=0;i<4;i++){
		arr[i].displayRecord();
	}
	p1.displayRecord();

	p2.transferWard("ICU");

	delete[] arr;


	return 0;
}
