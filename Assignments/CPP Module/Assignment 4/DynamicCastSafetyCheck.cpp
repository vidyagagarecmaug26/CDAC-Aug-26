#include <iostream>
#include <vector>
#include <string>

using namespace std;

class DataProcessor {
public:
    virtual string processorType() const = 0;
    virtual int recordCount() const = 0;
    virtual ~DataProcessor() = default;
};

class CSVProcessor : public DataProcessor {
public:
    string processorType() const override { return "CSV Processor"; }
    int recordCount() const override { return 5; }
};

class SensorStreamProcessor : public DataProcessor {
public:
    string processorType() const override { return "Sensor Stream Processor"; }
    int recordCount() const override { return 8; }
    double getMean() const { return 23.975; }
};

int main() {
    vector<DataProcessor*> pipeline;
    pipeline.push_back(new CSVProcessor());
    pipeline.push_back(new SensorStreamProcessor());

    cout << "=== RUNNING BONUS DYNAMIC CAST CHECKS ===" << endl;

    for (auto* p : pipeline) {
        if (auto* csv = dynamic_cast<CSVProcessor*>(p)) {
            cout << "Found CSV Processor with " << csv->recordCount() << " records." << endl;
        }
        else if (auto* sensor = dynamic_cast<SensorStreamProcessor*>(p)) {
            cout << "Found Sensor Processor — Mean: " << sensor->getMean() << endl;
        }
    }

    for (auto* p : pipeline) {
        delete p;
    }

    return 0;
}
/*
     EXPLANATORY REASONING - STATIC_CAST VS DYNAMIC_CAST SAFETY ANALYSIS:

     1. WHY static_cast IS UNSAFE HERE:
        'static_cast' executes downstream hierarchy class conversions purely based on instructions given at
        compile-time. It skips explicit internal verification checks. If the pipeline encounters a
        base pointer referencing a 'CSVProcessor' object and explicitly instructs it to transform into a
        'SensorStreamProcessor*' via static_cast, the compiler will permit it without warning. Calling
        'getMean()' on that invalid memory reference corrupts internal memory tracking frames, prompting undefined
        behavior, raw binary corruption anomalies, or critical platform application crashes.

     2. WHY dynamic_cast IS SAFE:
        'dynamic_cast' uses C++ Run-Time Type Information (RTTI). It validates memory types at runtime.
        If a casting configuration conversion rule breaks legal layout rules, 'dynamic_cast' captures the
        incompatibility safely and returns a 'nullptr' value instead of a corrupted address. This allows the program
        to handle type variance using conditional logic blocks, preventing application crashes.
    */
