#include <iostream>
#include<memory>
using namespace std;

class AudioClip{
	string name;
	double duration;

public:
	string getname()const{
		return name;
	}
	AudioClip(string n, double d):name(n),duration(d){
		cout<<"[Audio Clip Loaded]"<<endl;
	}

	~AudioClip(){
		cout<<"[Audio Clip Destroyed]"<<endl;
	}


};
int main() {
	auto audio = make_shared<AudioClip>("explosion", 3.5);
	weak_ptr<AudioClip>observer = audio;

	if(auto clip=observer.lock())
		cout<<"Clip alive: "<< clip->getname ()<<endl<<endl;

	audio.reset(); //unload

	if(observer.expired())
		cout<<"Clip already unloaded. "<<endl;
	return 0;
}
