#include <iostream>
using namespace std;

int level=1;

namespace Engine{
	namespace Audio{
		void playSound(string name){
			cout<<"Playing: "<<name<<endl;
		}
	}
}


int main() {
	int level=5;

	cout<<"Player Level (Local): "<<level<<endl;
	cout<<"Game Difficulty Level (Global): "<<::level<<endl<<endl;

	Engine::Audio::playSound("sword_clash");


	return 0;
}
