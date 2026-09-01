#include <iostream>
using namespace std;

double reorderCost(int qty, double unitPrice){
	return qty*unitPrice;
}

double reorderCost(double qty, double unitPrice){
	return qty*unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate){
	double baseCost=qty*unitPrice;
	return baseCost + (baseCost * taxRate);
}

double applyDiscount(double price, double discountPercent=10.0){
	return price-(price*(discountPercent/100.0));
}

int main() {
	cout<<"===========Testing New Features========="<<endl;

	cout<<"Reorder Cost (5 items for Rs 20): Rs. "<<reorderCost(5, 20.0)<<endl;
	cout<<"Reorder Cost (2.5 items for Rs 40): Rs. "<<reorderCost(2.5, 40.0)<<endl;
	cout<<"Reorder Cost (5 items for Rs 20 with 0.18 tax): Rs."<<reorderCost(5,20.0,0.18)<<endl;

	cout<<"Original Price: Rs. 500.00"<<endl;
	cout<<"Price with default 10% discount: Rs. "<<applyDiscount(500.00)<<endl;
	cout<<"Price without default: Rs." <<applyDiscount(500.00,25.0)<<endl;

	return 0;
}

