#include <iostream>
using namespace std;

int main() {
	int statusReg = 0b10110001;
	int controlReg = 0b00000000;
	int dataReg = 0b11001010;

	const int *regPtr1=&statusReg;
	cout<<*regPtr1<<endl;

	// *regPtr1= 0b11111111;//error: assignment of read-only location '* regPtr1'
	const int **regPtr1regPtr1=&regPtr1;
	cout<<**regPtr1regPtr1<<endl;
	regPtr1=&dataReg;

	int* const regPtr2=&controlReg;
	cout<<*regPtr2<<endl;
	*regPtr2= 0b11010111;
	//regPtr2=&dataReg; //error: assignment of read-only variable 'regPtr2'

	const int* const regPtr3=&statusReg;
	cout<<*regPtr3<<endl;
	//*regPtr3=&dataReg;//error: assignment of read-only location '*(const int*)regPtr3'
					  //error: invalid conversion from 'int*' to 'int' [-fpermissive]
	//*regPtr3=0b10101010;//error: assignment of read-only location '*(const int*)regPtr3'
	//regPtr3=&dataReg; //error: assignment of read-only variable 'regPtr3'
	return 0;
}
