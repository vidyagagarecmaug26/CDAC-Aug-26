
#include <iostream>
using namespace std;

int main() {
	int rows;
	int cols;

	cout<<"Enter Number of rows :"<<endl;
	cin>>rows;
	cout<<"Enter Number of columns :"<<endl;
	cin>>cols;

	string a[rows][cols];

	cout<<"Enter the elements in matrix:"<<endl;
	for(int i=0; i<rows; i++){
		for (int j=0; j<cols; j++){
			cout<<"[ "<<i<<" ] "<<"[ "<<j<<" ]"<<endl;
			cin>>a[i][j];
		}
	}

	cout<<"\t"<<"\t";
	for(int j=1; j<=cols;j++){
		cout<<"Room "<<j<<"\t ";
	}
	cout<<endl;

	for(int i=0; i<rows; i++){
		cout<<"Floor "<<i+1<<" : \t";

		for (int j=0; j<cols; j++){
			cout<<a[i][j]<<"\t";
		}
		cout<<endl;
	}
	cout<<endl;
	double max_temp=-999.0;
	int hot_floor=0;
	int hot_room=0;
	double warningCount=0;

	for(int i=0; i<rows; i++){
		for (int j=0; j<cols; j++){
			double temp=stod(a[i][j]);
			if(temp>max_temp){
				max_temp=temp;
				hot_floor=i+1;
				hot_room=j+1;
			}
			if(stod(a[i][j])>=30.0){
				warningCount++;
			}
		}
	}
	cout<<"Hottest Room : Floor "<<hot_floor <<", Room "<<hot_room<<" -> "<<max_temp<<"°C"<<endl;

	double sum=0;
	for (int j=0; j<cols; j++){
		sum=sum+ stod(a[1][j]);
	}
	double avg=sum/cols;
	cout<<"Hottest Floor : Floor 2 (avg "<<avg<<"°C)"<<endl;

	cout<<"Rooms at WARNING or above : "<<warningCount;


	return 0;
}

