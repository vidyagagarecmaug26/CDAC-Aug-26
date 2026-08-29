#include <iostream>
#include <string>
using namespace std;

int main() {
	double F;
	double C;

	cout<< "Enter Celsius value"<<endl;
	cin>>C;

	F = (C * 9.0 / 5.0) + 32;
	cout<<"Temperature : "<< C << "°C  /  "<<F<<"°F"<<endl;

	int code;

	if(C<0.0){
		code = -1;
	}
	else if(C <=29.0){
		code = 0;
	}
	else if(C <=44.0){
		code = 1;
	}
	else if(C <=59.0){
		code = 2;
	}
	else{
		code = 3;
	}

	switch(code){
	case -1:
		cout<< "Status : SENSOR_ERROR" <<endl;
		cout<<"Action : Sensor fault - check wiring"<<endl;
		break;

	case 0:
		cout<<"Status : NORMAL"<<endl;
		cout<<"Action : No action required"<<endl;
		break;

	case 1:
		cout<<"Status : WARNING"<<endl;
		cout<<"Action : Alert sent to supervisor"<<endl;
		break;

	case 2:
		cout<<"Status : CRITICAL"<<endl;
		cout<<"Action : Cooling system triggered"<<endl;
		break;

	case 3:
		cout<<"Status : SHUTDOWN"<<endl;
		cout<<"Action : Emergency shutdown initiated"<<endl;
		break;

	default:
		cout<<"Default Value"<<endl;
		break;
	}

	string result= (C >25.0) ? "Above Average" : "Below Average";
	cout<<"Reading : "<<result;

	return 0;
}

