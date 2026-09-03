#include <iostream>
#include<memory>
using namespace std;

class Texture{
	string name;
	int width;
	int height;

public:
	Texture(string n, int w, int h):name(n),width(w),height(h){
		cout<<"[Texture Loaded]"<<endl;
	}

	~Texture(){
		cout<<"[Texture Released]"<<endl;
	}

	void display()const{
		cout<<"Textures : "<<name<<"( "<<width<<" x "<<height<<" )"<<endl;
	}
};
int main(){

	auto tex1=make_unique<Texture>("player_sprite",512,512);
	tex1->display();

	//unique_ptr<Texture>tex2=tex1; //error: use of deleted function 'std::unique_ptr<_Tp, _Dp>::unique_ptr(const std::unique_ptr<_Tp, _Dp>&) [with _Tp = Texture; _Dp = std::default_delete<Texture>]'

	unique_ptr<Texture>tex2=move(tex1);
	cout<<"tex1 is null: "<<(tex1 == nullptr ? "Yes" : "No")<<endl;

	return 0;
}
