#include <iostream>
using namespace std;

class LogBuffer{
//	int accessCount=0; //error: increment of member 'LogBuffer::accessCount' in read-only object
	mutable int accessCount=0;
public:
	LogBuffer(const LogBuffer& other){
		accessCount=other.accessCount;
		accessCount++;
	}
	LogBuffer()=default;
	void print()const{
		accessCount++;
	}
	int getAccessCount()const{
		return accessCount;
	}
};

int main(){
	LogBuffer log1;
	const LogBuffer readOnly=log1;
	readOnly.print();
	readOnly.print();
	readOnly.print();
	cout<<"Times Printed: "<<readOnly.getAccessCount()-1<<endl;

	return 0;
}

//why accessCount must be mutable and not just a regular member?
//	The mutable keyword is an explicit override switch.
//	It tells the compiler: "This specific variable does not affect the external 'logical' state of the object. "
//	"Allow it to be modified even inside const member functions and on const objects."
//	Without mutable, your code will not compile. The compiler will throw an error stating that you are trying to
//	"increment" a read-only variable inside a const member function.

//What the const keyword on a member function actually prevents?
//	Direct Modification: You cannot assign new values to regular member variables (e.g., accessCount++ or accessCount = 5 results in a compiler error).
//	Indirect Modification: You cannot call other non-const member functions from inside the const function, because those functions might modify the data.


