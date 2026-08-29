#include <iostream>
#include <cmath>
using namespace std;

inline double distanceBetween(double x1, double y1, double x2, double y2){
	return sqrt(pow(x2-x1, 2)+pow(y2-y1, 2));
}
inline double toRadians(double degrees){
	return degrees*(M_PI / 180.0);
}
inline double clamp(double value, double minVal, double maxVal){
	return  max(minVal, min(value, maxVal));
}
inline bool isInSafeZone(double x, double y, double cx, double cy, double radius){
	double dx=x-cx;
	double dy=y-cy;
	return (dx*dx+(dy*dy)) <= (radius*radius);
}

int main(){
	double cx=0.0;
	double cy=0.0;
	double radius=50.0;

	double wpx[] = {30.0, 10.0, 60.0};
	double wpy[] = {40.0, 15.0, 20.0};

	cout << boolalpha;

	for (int i = 0; i < 3; i++) {
		cout << "Waypoint " << (i + 1) << " Distance From Home: " << distanceBetween(wpx[i], wpy[i], cx, cy) << endl;
		cout << "Is Waypoint " << (i + 1) << " Inside Safe Zone ? " << isInSafeZone(wpx[i], wpy[i], cx, cy, radius) << endl << endl;
	}

	return 0;
}
