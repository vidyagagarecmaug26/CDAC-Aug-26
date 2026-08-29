#include <iostream>
using namespace std;

void resetSensorPairV1(int reading1, int reading2){
	cout<<"--- V1: Call by Value ---"<<endl;
	cout<<"Before :"<<" A="<<reading1<<" B="<<reading2<<endl;
}
void resetSensorPairV2(int& reading1, int& reading2){
	cout<<"--- V2: Call by Reference ---"<<endl;
	cout<<"Before :"<<" A="<<reading1<<" B="<<reading2<<endl;

	int temp = reading1;
	reading1 = reading2;
	reading2 = temp;
}
void resetSensorPairV3(int* reading1, int* reading2){
	cout<<"--- V3: Call by Pointer ---"<<endl;
	cout<<"Before :"<<" A="<<*reading1<<" B="<<*reading2<<endl;

	int temp = *reading1;
	*reading1 = *reading2;
	*reading2 = temp;
}

int main(){
	int reading1=55;
	int reading2=12;

	resetSensorPairV1(reading1, reading2);
	cout<<"After :"<<" A="<<reading1<<" B="<<reading2<<"    <- values unchanged"<<endl<<endl;

	//In call by value, a copy of the actual parameter is passed to the function.
	//The changes made to the parameter inside the function do not affect the actual parameter.
	//The original variables passed from main() remain completely unaffected and unmodified.
	//so for swapping the values reference & is must to add before variables then only it will affect and give expected output.
	//The changes made inside V1 only modify these local copies within the function's scope.

	resetSensorPairV2(reading1, reading2);
	cout<<"After :"<<" A="<<reading1<<" B="<<reading2<<"    <- values swapped"<<endl<<endl;

	resetSensorPairV3(&reading1, &reading2);
	cout<<"After :"<<" A="<<reading1<<" B="<<reading2<<"    <- values swapped back"<<endl;
}
