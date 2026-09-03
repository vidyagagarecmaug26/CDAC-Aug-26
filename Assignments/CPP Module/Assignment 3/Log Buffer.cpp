#include <iostream>
#include <cstring>
using namespace std;

class LogBuffer{
	char* buffer;
	int capacity;
	int size;
	static int instanceCount;

public:

	LogBuffer(int cap):capacity(cap),size(0){
		buffer=new char[capacity];
		buffer[0]='\0';
		instanceCount++;
		if(capacity == 256){
			cout<<"[LogBuffer Created] capacity="<< capacity<<endl;
		}
	}

	LogBuffer(const LogBuffer& other):capacity(other.capacity),size(other.size){
		buffer=new char[capacity];
		std::memcpy(buffer,other.buffer,capacity);
		cout<<"[LogBuffer Deep Copied] capacity="<< capacity<<endl;
		instanceCount++;
	}
	LogBuffer& operator=(const LogBuffer& other){
		//handle self-assignment
		if(this == &other){
			cout<<"[Self-assignment detected - no operation] "<<endl;
			return *this;
		}

		//release old memory
		delete[] buffer;

		//deep copy
		capacity=other.capacity;
		size=other.size;
		buffer=new char[capacity];
		std::memcpy(buffer, other.buffer,capacity);
		cout<<"[LogBuffer Assigned]"<<endl;

		return *this;
	}
	~LogBuffer(){
		delete[] buffer;
		cout<<"[LogBuffer Destroyed]"<<endl;
		instanceCount--;
	}
	void append(const char* msg){
		int msgLen = std::strlen(msg);
		if (size + msgLen < capacity) {
			std::strcpy(buffer + size, msg);
			size += msgLen;
		}
		else {
			cout << "[Error] Buffer overflow blocked!" << endl;
		}
	}
	void print()const{
		cout<<buffer<<endl;
	}
	void clear(){
		buffer[0] = '\0';
		size=0;
	}

	static int getInstanceCount(){
		return instanceCount;

	}
};
int LogBuffer::instanceCount=0;

int main() {

	//Objective 1: Basic usage
	LogBuffer log1(256);
	log1.append("Server started on port 8080");
	log1.append("| Request received from 192.168.1.10");
	log1.print();
	cout<<endl;

	//Objective 2: Deep copy via copy constructor
	LogBuffer log2=log1;
	log2.append("| Cached response sent");
	cout<<"log1: "; log1.print();
	cout<<"log2: "; log2.print();
	cout<<endl;

	//Objective 3: Copy assignment operator
	LogBuffer log3(128);
	log3 = log1;
	cout<<"log3 : ";log3.print();
	cout<<endl;

	//Objective 4: self-assignment guard
	log1 = log1;
	cout<<endl;

	//Objective 5: Static member
	cout<<"Live LogBuffer objects : "<<LogBuffer::getInstanceCount()<<endl<<endl;

	return 0;

}
