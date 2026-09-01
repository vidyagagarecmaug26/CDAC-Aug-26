#include <iostream>

namespace Physics{
	double clamp(double val, double min, double max){
		if(val<min)return min;
		if(val>max)return max;
		return val;
	}
	double lerp(double a, double b, double t){
		return a + t * ( b - a);
	}
}
namespace GameMath{
	int clamp(int val, int min, int max){
		if(val<min)return min;
		if(val>max)return max;
		return val;
	}
	double lerp(double a, double b, double t){
		return a + t * ( b - a);
	}
}

int main() {
	double currentVelocity=120.5;
	double maxSpeed=Physics::clamp(currentVelocity,0.0,100.0);
	std::cout<<"Physics Clamped Speed: "<<maxSpeed<<std::endl;

	int currentHealth=-15;
	int actualHealth=GameMath::clamp(currentHealth, 0, 100);
	std::cout<<"GameMath Clamped Health: "<<actualHealth<<std::endl<<std::endl;

	std::cout<<"=====Limited Block Scope====="<<std::endl;

	{
		using namespace Physics;
		double localLerp=lerp(10.0,20.0,0.5);
		std::cout<<"Lerp inside Physics block: "<<localLerp<<std::endl;
	}

	{
		using namespace GameMath;
		double localClamp=clamp(150, 0, 100);
		std::cout<<"Clamp inside GameMath block: "<<localClamp<<std::endl;
	}

	return 0;
}
