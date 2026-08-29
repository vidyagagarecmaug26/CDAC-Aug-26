#include <iostream>
#include<string>
#include <cstdlib>
using namespace std;

int main(int argc, char* argv[]) {

	if(argc<4){
		cout<<"Usage : ./sensor_monitor <warn_threshold> <critical_threshold> <num_readings>"<<endl;
		cout<<"Error : Missing Arguments"<<endl;
		return 1;
	}

	int warn=stoi(argv[1]);
	int critical=stoi(argv[2]);
	int num_readings=stoi(argv[3]);

	cout<<"Config : Warn="<<warn<<"°C"<<"  Critical="<<critical<<"°C"<<"  Readings="<<num_readings<<endl;

	if(warn >= critical ||num_readings < 1 || num_readings > 500){
		cout<<"Error : Invalid Arguments"<<endl;
		return 1;
	}

	int normalCount=0;
	int warningCount=0;
	int criticalCount=0;
	int shutdownCount=0;

	for(int i=0;i<num_readings;i++){
		int temp = rand() %70;

		if(temp<35){
			normalCount++;
		}
		else if(temp>=35 && temp<45){
			warningCount++;
		}
		else if(temp>=45 && temp<60){
			criticalCount++;
		}
		else{
			shutdownCount++;
		}
	}

	cout<<"Results :"<<" Normal: "<<normalCount<<" Warning: "<<warningCount<<" Critical: "<<criticalCount<<" Shutdown: "<<shutdownCount<<endl;
	return 0;
}
