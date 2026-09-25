#include <iostream>
#include <string>
#include <vector>
#include <iomanip>

using namespace std;

class Vehicle {
protected:
    string registrationNo;
    string ownerName;
    int yearOfManufacture;
    double kmDriven;

public:
    Vehicle(const string& reg, const string& owner, int year, double km)
        : registrationNo(reg), ownerName(owner), yearOfManufacture(year), kmDriven(km) {
        cout << "[Vehicle Constructor] " << registrationNo << " : " << ownerName << endl;
    }

    virtual double fuelCost(double kmToTravel) const = 0;
    virtual string vehicleType() const = 0;

    virtual void describe() const {
        cout << left << setw(12) << registrationNo
             << setw(16) << vehicleType()
             << setw(18) << ownerName
             << right << setw(10) << fixed << setprecision(0) << kmDriven;
    }

    string getRegNo() const {
    	return registrationNo;
    }
    double getKmDriven() const {
    	return kmDriven;
    }

    virtual ~Vehicle() {
        cout << "[Vehicle Destructor] " << registrationNo << endl;
    }
};

class Car : public Vehicle {
private:
    string fuelType;
    double mileageKmpl;

public:
    Car(const string& reg, const string& owner, int year, double km, string fuel, double mileage)
        : Vehicle(reg, owner, year, km), fuelType(fuel), mileageKmpl(mileage) {
        cout << "[Car Constructor] " << registrationNo << endl;
    }

    double fuelCost(double km) const override {
        double fuelPricePerLitre = (fuelType == "Petrol") ? 106.00 : 93.00;
        return (km / mileageKmpl) * fuelPricePerLitre;
    }

    string vehicleType() const override { return "Car"; }
    string getFuelType() const { return fuelType; }

    ~Car() override {
        cout << "[Car Destructor] " << registrationNo << endl;
    }
};
class Truck : public Vehicle {
protected:
    double payloadCapacityTons;
    double fuelEfficiencyKmpl;

public:
    Truck(const string& reg, const string& owner, int year, double km, double payload, double efficiency)
        : Vehicle(reg, owner, year, km), payloadCapacityTons(payload), fuelEfficiencyKmpl(efficiency) {
        cout << "[Truck Constructor] " << registrationNo << endl;
    }

    double fuelCost(double km) const override {

        double effectiveEfficiency = fuelEfficiencyKmpl * (1.0 - (0.05 * payloadCapacityTons));
        return (km / effectiveEfficiency) * 93.00;
    }

    string vehicleType() const override {
    	return "Truck";
    }

    ~Truck() override {
        cout << "[Truck Destructor] " << registrationNo << endl;
    }
};

class ElectricTruck : public Truck {
private:
    double batteryCapacityKWh;
    double rangePerChargeKm;

public:
    ElectricTruck(const string& reg, const string& owner, int year, double km, double payload, double efficiency, double batteryCap, double range)
        : Truck(reg, owner, year, km, payload, efficiency), batteryCapacityKWh(batteryCap), rangePerChargeKm(range) {
        cout << "[ElectricTruck Constructor] " << registrationNo << endl;
    }

    double fuelCost(double km) const override {
        return (km / rangePerChargeKm) * batteryCapacityKWh * 9.50;
    }

    string vehicleType() const override {
    	return "Electric Truck";
    }


    double getBatteryCapacity() const {
    	return batteryCapacityKWh;
    }

    ~ElectricTruck() override {
        cout << "[ElectricTruck Destructor] " << registrationNo << endl;
    }
};

class Van : public Vehicle {
private:
    int seatingCapacity;
    double mileageKmpl;

public:
    Van(const string& reg, const string& owner, int year, double km, int seats, double mileage)
        : Vehicle(reg, owner, year, km), seatingCapacity(seats), mileageKmpl(mileage) {
        cout << "[Van Constructor] " << registrationNo << endl;
    }

    double fuelCost(double km) const override {
        return (km / mileageKmpl) * 106.00;
    }

    string vehicleType() const override { return "Van"; }

    ~Van() override {
        cout << "[Van Destructor] " << registrationNo << endl;
    }
};

void printFleetReport(const vector<Vehicle*>& fleet, double tripKm) {
    cout << "\n===== FLEET REPORT - Trip Distance: " << tripKm << " km =====\n";
    cout << left << setw(12) << "Reg" << setw(16) << "Type" << setw(18) << "Owner" << right << setw(10) << "Km Driven" << "\n";
    cout << string(60, '-') << "\n";

    for (const auto& vehicle : fleet) {
        vehicle->describe();
        cout << "\n";
    }

    cout << "\n===== FUEL / CHARGE COST ESTIMATE =====\n";
    Vehicle* mostEfficient = nullptr;
    double minCost = 1e9;

    for (const auto& vehicle : fleet) {
        double currentCost = vehicle->fuelCost(tripKm);

        cout << left << setw(12) << vehicle->getRegNo()
             << " (" << setw(14) << vehicle->vehicleType() + ")" << " : Rs. "
             << right << setw(8) << fixed << setprecision(2) << currentCost;

        if (auto* car = dynamic_cast<Car*>(vehicle)) {
            cout << " (" << car->getFuelType() << ")";
        }
        else if (auto* eTruck = dynamic_cast<ElectricTruck*>(vehicle)) {
            cout << " [Battery capacity: " << eTruck->getBatteryCapacity() << " kWh]";
        }
        cout << "\n";

        if (currentCost < minCost) {
            minCost = currentCost;
            mostEfficient = vehicle;
        }
    }
    cout << string(60, '-') << "\n";
    if (mostEfficient) {
        cout << "Most Efficient Vehicle: " << mostEfficient->getRegNo()
             << " (" << mostEfficient->vehicleType() << ") - Rs. "
             << minCost << " for " << tripKm << " km\n\n";
    }
}

int main() {
    cout << "PART B: Stack Object Chain Testing"<<endl;
    {
        ElectricTruck stackTruck("V-ET001", "Green Logistics", 2026, 500.0, 4.0, 7.5, 90.0, 350.0);
        cout << "...scope ends...\n";
    }
    cout<<endl;

    cout << "PART C: Building Fleet Framework"<<endl<<endl;

    vector<Vehicle*> fleet;
    fleet.push_back(new Car("KA01AA001", "Ramesh Kumar", 2022, 45200, "Petrol", 15.0));
    fleet.push_back(new Car("DL03CC555", "Suresh Sharma", 2023, 21000, "Diesel", 18.5));
    fleet.push_back(new Truck("MH04BB002", "Shyam Logistics", 2020, 123500, 2.5, 9.0));
    fleet.push_back(new ElectricTruck("GJ07CC003", "Green Fleet Co", 2025, 89000, 3.0, 8.0, 100.0, 400.0));
    fleet.push_back(new Van("UP16DD444", "Anand Travels", 2024, 32000, 8, 12.0));

    printFleetReport(fleet, 200.0);

    cout << "--- CLEANUP: Releasing fleet allocations pointers ---\n";
    for (auto* vehicle : fleet) {
        delete vehicle;
        cout << "\n";
    }
    fleet.clear();

    return 0;
}
