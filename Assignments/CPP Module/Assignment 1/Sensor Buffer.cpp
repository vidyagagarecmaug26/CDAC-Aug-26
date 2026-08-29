#include <iostream>
using namespace std;

int main() {
	int N;
	cout<<"Enter Readings"<<endl;
	cin>>N;

	if(N<1||N>100){
		cout<<"Invalid"<<endl;
		return 1;
	}

	cout<<"Readings entered : "<<N<<endl;

	string arr[N];
	for(int i=0; i<N;i++){
		cin>>arr[i];
	}
	int errorCount=0;
	cout<<"Valid Readings: ";
	for(int i=0; i<N;i++){
		if(arr[i][0]=='-'){
			errorCount++;
			continue;
		}
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	cout<<"Skipped (errors): "<<errorCount<<endl;
	for(int i=0;i<N;i++){
		double temp= stod(arr[i]);
		if(temp>=45.0){
			cout<<"First Critical : Index "<<i <<"-> "<<arr[i]<<"°C"<<endl;
			break;
		}
	}
	double min_value = stod(arr[0]);
	double max_value = stod(arr[0]);
	double sum=0;
	int validCount=0;
	int normal_count =0;
	int warning_count =0;
	int critical_count =0;
	int shutdown_count = 0;

	for(int i=0; i<N;i++){
		if(arr[i][0]=='-')
			continue;
		if(stod(arr[i]) < min_value){
			min_value=stod(arr[i]);
		}
		if(stod(arr[i]) > max_value){
			max_value=stod(arr[i]);
		}

		sum=sum+ stod(arr[i]);
		validCount++;

		if(stod(arr[i])<=27.0){
			normal_count++;
		}
		else if(stod(arr[i])<=44.0){
			warning_count++;
		}
		else if(stod(arr[i])<=59.0){
			critical_count++;
		}
		else{
			shutdown_count++;
		}


	}
	cout<<"Min :"<<min_value<<"°C"<<endl;
	cout<<"Max :"<<max_value<<"°C"<<endl;

	double average= sum/validCount;
	cout<<"Avg :"<<average<<"°C"<<endl;


	cout <<"Normal:" << normal_count <<endl;
	cout <<"Warning:" << warning_count<<endl;
	cout <<"Critical:" << critical_count<<endl;
	cout <<"Shutdown:" << shutdown_count <<endl;


	return 0;
}

