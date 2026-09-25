#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <numeric>

using namespace std;

class DataProcessor {
public:

    virtual void loadData(const string& source) = 0;
    virtual void processData() = 0;
    virtual void exportResult(const string& destination) = 0;
    virtual string processorType() const = 0;
    virtual int recordCount() const = 0;

    virtual void printSummary() const {
        cout << "Summary for " << processorType() << ":" << endl;
        cout << "Records processed: " << recordCount() << endl;
    }


    virtual ~DataProcessor() = default;
};


class CSVProcessor : public DataProcessor {
private:
    vector<string> records;

public:
    void loadData(const string& source) override {
        records = {"apple", "banana", "cherry", "date", "elderberry"};
    }

    void processData() override {
        for (auto& row : records) {
            transform(row.begin(), row.end(), row.begin(), ::toupper);
        }
    }

    void exportResult(const string& destination) override {
        cout << "[CSV EXPORT -> " << destination << "]" << endl;
        for (const auto& row : records) {
            cout << row << endl;
        }
    }

    string processorType() const override {
    	return "CSV Processor";
    }
    int recordCount() const override {
    	return records.size();
    }
};

class SensorStreamProcessor : public DataProcessor {
private:
    vector<double> readings;
    double mean = 0.0;
    double minVal = 0.0;
    double maxVal = 0.0;

public:
    void loadData(const string& source) override {
        readings = {23.4, 21.8, 25.1, 24.2, 22.9, 26.0, 23.7, 24.5};
    }

    void processData() override {
        if (readings.empty())
        	return;

        double sum = accumulate(readings.begin(), readings.end(), 0.0);
        mean = sum / readings.size();

        auto result = minmax_element(readings.begin(), readings.end());
        minVal = *result.first;
        maxVal = *result.second;
    }

    void exportResult(const string& destination) override {
        cout << "[SENSOR EXPORT -> " << destination << "]" << endl;
        cout << "Statistical Summary exported to target directory." << endl;
    }

    string processorType() const override {
    	return "Sensor Stream Processor";
    }
    int recordCount() const override {
    	return readings.size();
    }

    double getMean() const {
    	return mean;
    }
    void printSummary() const override {
        DataProcessor::printSummary();
        cout << "Status -> Mean: " << mean << " | Min: " << minVal << " | Max: " << maxVal << endl;
    }
};

int main() {

    vector<DataProcessor*> pipeline;
    pipeline.push_back(new CSVProcessor());
    pipeline.push_back(new SensorStreamProcessor());

    for (auto* p : pipeline) {
        p->loadData("source_data");
        p->processData();
        p->printSummary();
        p->exportResult("output_dir");
        cout << " " << endl;
    }

    for (auto* p : pipeline) {
        delete p;
    }
    return 0;
}
