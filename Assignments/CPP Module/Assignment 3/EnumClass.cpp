#include <iostream>
#include<string>
using namespace std;

enum class HttpStatus{
	OK = 200,
	Created = 201,
	BadRequest=400,
	Unauthorized=401,
	NotFound=404,
	ServerError=500
};
	void handleResponse(HttpStatus status, const string& endpoint){

		switch(static_cast<int>(status)){
			case 200:
				cout<<endpoint<<"-> 200 OK :  Request successful"<<endl;
				break;
			case 201:
				cout<<endpoint <<"-> 201 Created :  Created successfully"<<endl;
				break;
			case 400:
				cout<<endpoint <<"-> 400 Bad Request :  Bad Request Requested"<<endl;
				break;
			case 401:
				cout<<endpoint <<"-> 401 Unauthorized :  Authentication required"<<endl;
				break;
			case 404:
				cout<<endpoint <<"-> 404 Endpoint :  Endpoint does not exist"<<endl;
				break;
			case 500:
				cout<<endpoint << "-> 500 Server Error :  Internal server error - retry later"<<endl;
				break;
			default:
				cout << "Unknown status code" << endl;
				break;
		}
	}

int main(){
	handleResponse(HttpStatus::OK, "[GET/api/users]  ");

	handleResponse(HttpStatus::Unauthorized, "[POST/api/login]  ");

	handleResponse(HttpStatus::NotFound, "[GET/api/product/99]  ");

	handleResponse(HttpStatus::ServerError, "[POST/api/order]  ");

	return 0;

}
