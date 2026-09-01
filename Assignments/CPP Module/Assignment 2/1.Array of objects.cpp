#include <iostream>
#include<string>
#include<iomanip>
using namespace std;

class Product{
public:
	int productId;
	string name;
	double price;
	int quantity;

	void acceptDetails(){
		cout<<"Enter Following Details :"<<endl;
		cout<<"Enter Product ID:"<<endl;
		cin>>productId;
		cout<<"Enter Name:"<<endl;
		cin>>name;
		cout<<"Enter Price:"<<endl;
		cin>>price;
		cout<<"Enter Quantity:"<<endl;
		cin>>quantity;
	}

	double totalValue()const{
		return price*quantity;

	}

	bool isLowStock(int threshold)const{
		return quantity<threshold;
	}
};

int main() {
	int size;

	cout<<"Enter the number of products you want"<<endl;
	cin>>size;

	Product prodArr[size];


	for(int i=0;i<size;i++){
		prodArr[i].acceptDetails();
	}

	int threshold;
	cout<<"Enter low stock threshold:";
	cin>>threshold;
	cout<<endl;

	cout<<"==========INVENTORY REPORT==========="<<endl;

	cout<<left<<setw(8)<<"ID"
			<<setw(14)<<"Name"
			<<setw(10)<<"Price"
			<<setw(6)<<"Qty"
			<<"Total Value"
			<<endl;
	cout<<fixed<<setprecision(2);

	for(int i=0; i<size;i++){
		cout<<left<<setw(8)<<prodArr[i].productId
		<<setw(14)<<prodArr[i].name
		<<setw(10)<<prodArr[i].price
		<<setw(6)<<prodArr[i].quantity
		<<setw(15)<<prodArr[i].totalValue();

		if(prodArr[i].isLowStock(threshold)){
			cout<<"<- Low Stock "<<endl;
		}
		cout<<endl;

	}
	cout<<endl;

	double value=0;
	int index=0;

	for(int i=0; i<size;i++){
		double currentValue=prodArr[i].totalValue();

		if(currentValue>value){
			value=currentValue;
			index=i;
		}

	}
	cout<<"Highest Value Product :" <<prodArr[index].name <<"(Rs. "<<value<<")"<<endl;
	cout << "Low Stock (threshold: " << threshold << ") : ";
	bool first = true;
	for (int i = 0; i < size; i++) {
		if (prodArr[i].isLowStock(threshold)) {
			if (!first) {
				cout << ", ";
			}
			cout << prodArr[i].name;
			first = false;
		}
	}
	return 0;
}


