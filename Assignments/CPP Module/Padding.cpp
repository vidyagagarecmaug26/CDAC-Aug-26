#include <iostream>
using namespace std;

struct Layout1{
	char c1;
	int i;
	char c2;
};

struct Layout2{
	int i;
	char c1;
	char c2;
};

int main() {


	cout<<"Size of Layout1 : "<<sizeof(Layout1)<<endl; //12
	cout<<"Size of Layout2 : "<<sizeof(Layout2)<<endl; //8

	return 0;
}

//=========Explanation=======

//Q1. Why the size differ ?
//	1. Layout1 has a size of 12 bytes and Layout2 has a size of 8 bytes.
//	2. This difference happens because the compiler inserts unused bytes (padding)
//        between or after members to ensure each data type starts at a memory address
//		that matches its requirement.
//	3. for layout1- char : 1, int : 4, char : 1	so after padding it becomes 4 + 4 + 4 =12 bytes
//	4. for layout1- int : 4, char : 1, char : 1	so after padding it becomes 4 + 2 + 2 =8 bytes.
//
//Q2. What padding is and why the compiler adds it ?
//	1. Padding consists of extra, invisible bytes inserted by the compiler to align data in memory.
//	2. In order to access better manner compiler have fast access of your object variable, it does padding
//		work.
//	3. The compiler adds padding to ensure data aligns perfectly with hardware boundaries,
//		optimizing memory read/write speeds and preventing performance penalties.
//
//Q3. Why member order matters for network packets or hardware registers:
//	1. Network protocols and hardware register maps demand an exact, bit-for-bit layout of data matching a
//		strict physical specification.
//	2. If a compiler adds unexpected padding bytes due to member ordering, the
//		resulting memory structure will not line up with incoming network packets or the actual hardware control lines.
//	3. This misalignment causes data corruption, misinterpretation of protocol
//    	headers, or incorrect interaction with hardware peripherals.


