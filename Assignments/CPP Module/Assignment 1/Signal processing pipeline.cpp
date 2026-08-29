#include <iostream>
#include<cmath>
using namespace std;

double computeRMS(double* signal, int n){
	double sum=0.0;

	for(int i=0; i<n; i++){
		double value= *(signal+i);
		sum =sum+value* value;
	}
	return sqrt(sum/n);
}

void normalise(double* signal,int n){
	double max_abv=0.0;
	for(int i=0; i<n; i++){

		double current= *(signal+i);
		if(abs(current)>max_abv){
			max_abv=abs(current);
		}
	}
	if(max_abv>0.0){
		for(int i=0; i<n; i++){
			*(signal+i)=*(signal+i)/max_abv;
		}
	}
}

int countZeroCrossings(double* signal,int n){
	int count=0;
	for(int i=0; i<n-1; i++){
		double current= *(signal+i);
		double next= *(signal+i+i);

		if(current*next<0){
			count++;
		}
	}
	return count;
}

void applyGain(double* signal, int n, double gainFactor){
	for (int i = 0; i < n; i++) {
		*(signal + i) = *(signal + i) * gainFactor;
	}
}
void printArray(double* signal, int n){
	cout<<"[";
	for(int i=0; i<n; i++){
		cout<<*(signal+i);
		if(i<n-1)
			cout<<",";
	}
	cout<<"]"<<endl;
}

int main() {
	int n=7;
	double test_signal[]={0.5, -12, 0.8, -0.3, 1.0, -0.9, 0.1};

	cout<<"Before any changes: "<<endl;
	printArray(test_signal,n);

	cout<<"RMS Value: "<<computeRMS(test_signal,n)<<endl;
	cout<<"Zero Crossings: "<<countZeroCrossings(test_signal, n)<<endl;

	cout<<"Before normalise():  "<<endl;
	printArray(test_signal, n);

	normalise(test_signal, n);
	cout<<"After normalise():  "<<endl;
	printArray(test_signal, n);

	cout<<"Before applyGain():   "<<endl;
	printArray(test_signal, n);
	applyGain(test_signal, n, 2.0);
	cout<<"After applyGain():   "<<endl;
	printArray(test_signal, n);

	return 0;
}
