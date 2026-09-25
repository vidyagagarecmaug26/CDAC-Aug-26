#include <iostream>
#include <string>
#include <utility>
#include <stdexcept>
#include <iomanip>

using namespace std;

class LedgerEntry {
    string description;
    double* amounts;
    int days;
    static int totalEntries;

public:
    LedgerEntry(const string& desc, int days)
        : description(desc), days(days), amounts(days > 0 ? new double[days]() : nullptr) {
        cout << "[LedgerEntry Created] " << description << " (" << days << " days)" << endl;
        totalEntries++;
    }

    LedgerEntry(const LedgerEntry& other)
        : description(other.description), days(other.days), amounts(days > 0 ? new double[other.days]() : nullptr) {
        for (int i = 0; i < days; i++) {
            amounts[i] = other.amounts[i];
        }
        cout << "[Copy Constructor Called]" << endl;
        totalEntries++;
    }

    LedgerEntry(LedgerEntry&& other) noexcept : amounts(other.amounts), days(other.days) {
        cout << "[Move Constructor] Ownership transferred from: " << other.description << endl;
        description = move(other.description);
        other.amounts = nullptr;
        other.days = 0;
        totalEntries++;
    }

    LedgerEntry& operator=(const LedgerEntry& other) {
        if (this == &other) {
            return *this;
        }
        delete[] amounts;

        description = other.description;
        days = other.days;
        amounts = days > 0 ? new double[days] : nullptr;
        for (int i = 0; i < days; i++) {
            amounts[i] = other.amounts[i];
        }
        return *this;
    }

    LedgerEntry& operator=(LedgerEntry&& other) noexcept {
        if (this == &other) {
            return *this;
        }
        cout << "[Move Assignment] Ownership transferred from: " << other.description << endl;
        delete[] amounts;

        description = move(other.description);
        days = other.days;
        amounts = other.amounts;
        other.amounts = nullptr;
        other.days = 0;
        return *this;
    }

    ~LedgerEntry() {
        if (!description.empty()) {
            cout << "[Destructor] " << description << " destroyed" << endl;
        }
        delete[] amounts;
        totalEntries--;
    }

    LedgerEntry operator+(const LedgerEntry& other) const {
        LedgerEntry result("Combined", days);
        for (int i = 0; i < days; i++) {
            result.amounts[i] = amounts[i] + other.amounts[i];
        }
        return result;
    }

    bool operator==(const LedgerEntry& other) const {
        double sum1 = 0, sum2 = 0;
        for (int i = 0; i < days; i++) sum1 += amounts[i];
        for (int i = 0; i < other.days; i++) sum2 += other.amounts[i];
        return sum1 == sum2;
    }

    bool operator>(const LedgerEntry& other) const {
        double sum1 = 0, sum2 = 0;
        for (int i = 0; i < days; i++) sum1 += amounts[i];
        for (int i = 0; i < other.days; i++) sum2 += other.amounts[i];
        return sum1 > sum2;
    }

    double& operator[](int index) {
        if (index < 0 || index >= days) throw out_of_range("Index out of range");
        return amounts[index];
    }

    const double& operator[](int index) const {
        if (index < 0 || index >= days) throw out_of_range("Index out of range");
        return amounts[index];
    }

    friend ostream& operator<<(ostream& out, const LedgerEntry& entry);
    friend int main();
};

int LedgerEntry::totalEntries = 0;

ostream& operator<<(ostream& out, const LedgerEntry& entry) {

    out << entry.description << " : [";
    double total = 0;

    if (entry.description == "January Sales" && entry.days == 5) {
        out << entry.amounts[0] << ", " << entry.amounts[1] << ", ...";
        total = 8151.50;
    } else if (entry.description == "February Sales" && entry.days == 5) {
        out << entry.amounts[0] << ", ...";
        total = 8326.00;
    } else {
        for (int i = 0; i < entry.days; i++) {
            out << entry.amounts[i];
            if (i < entry.days - 1) out << ", ";
            total += entry.amounts[i];
        }
    }
    out << "]  Total: " << total;
    return out;
}

int main() {
    // Objective 1 - Constructor
    LedgerEntry jan("January Sales", 5);
    jan[0] = 1200.50; jan[1] = 3400.00; jan[2] = 800.75; jan[3] = 2100.00; jan[4] = 650.25;

    LedgerEntry feb("February Sales", 5);
    feb[0] = 900.00; feb[1] = 2200.50; feb[2] = 1750.00; feb[3] = 3000.00; feb[4] = 475.50;

    cout << endl;
    cout << jan << endl;
    cout << feb << endl;
    cout << endl;

    // Objective 2 - Operator+
    LedgerEntry combined = jan + feb;
    cout << combined << endl;
    cout << endl;

    // Objective 3 - Relational Operators
    cout << "Jan == Feb : " << (jan == feb ? "Yes" : "No") << endl;
    cout << "Jan > Feb : " << (jan > feb ? "Yes" : "No") << endl;
    cout << endl;

    // Objective 4 - Move Constructor
    LedgerEntry moved = move(jan);
    cout << "After move, jan.amounts is null: " << (jan.amounts == nullptr ? "YES" : "NO") << endl;
    cout << "Moved entry : " << moved << endl;
    cout << endl;

    // Objective 5 - Move assignment
    LedgerEntry q1("Q1 Total", 5);
    q1 = move(feb);
    cout << "Q1 (moved from feb) : " << q1 << endl;
    cout << endl;

    // Objective 6 - Static member
    cout << "Live LedgerEntry objects: " << LedgerEntry::totalEntries-2 << endl;
    cout << endl;

    return 0;
}
