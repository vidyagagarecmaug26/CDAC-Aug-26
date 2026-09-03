#include <iostream>
#include <memory>
#include<string>
using namespace std;

class Shader{
	string name;
	string type;
public:
	Shader(string n,string t): name(n),type(t){
		cout<<"[Shader Compiled]"<<endl;
	}
	~Shader(){
		cout<<"[Shader Destroyed]"<<endl;
	}
};
int getReferenceCount(const shared_ptr<Shader>& ptr){
		return ptr.use_count();
}
int main(){
	Shader vertexShader("vertex","vertextype");
	Shader fragmentShader("fragment","fragmenttype");

	auto shader=make_shared<Shader>("main_vertex","vertex");
	cout<<"Ref Count:"<<shader.use_count()<<endl; //1
	{
		auto renderRef = shader;
		cout<<"Ref count: "<<shader.use_count()<<endl; //2

		auto editorRef = shader;
		cout<<"Ref count: "<<shader.use_count()<<endl; //3
	}
	cout<<"Ref count: "<<shader.use_count()<<endl; //1

	return 0;

}

