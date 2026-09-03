#include <iostream>
#include <string>
#include <vector>
#include <utility>
using namespace std;

using Header = pair<string, string>;
using HeaderList = vector<Header>;
using Port = unsigned int;
using IPAddress = string;

typedef unsigned long long RequestedId;

void printHeaders(const HeaderList& headers){
	cout<<"Headers: "<<endl;
	for(const auto& h : headers){
		cout<<" "<<h.first<<" : "<<h.second <<endl;
	}
}

int main() {
	RequestedId reqId = 1748293847;
	Port serverPort = 8080;

	HeaderList myHeaders={
			{"Content-Type", "application/json"},
			{"Authorization", "Bearer eyJhbbGci..."},
			{"Accept-Language", "en-US"}
	};

	cout<<"Request ID : "<<reqId<<endl;
	cout<<"Server Port : "<<serverPort<<endl;

	printHeaders(myHeaders);

	return 0;
}
