#include <iostream>
#include <string>
#include <stdexcept>

using namespace std;

template <typename T>
class DataBuffer {
private:
    T* data;
    int capacity;
    int head;
    int tail;
    int count;

public:
    DataBuffer(int cap) : capacity(cap), head(0), tail(0), count(0) {
        data = new T[capacity];
    }

    ~DataBuffer() {
        delete[] data;
    }

    void push(const T& value) {
        data[tail] = value;
        tail = (tail + 1) % capacity;

        if (count < capacity) {
            count++;
        } else {
            head = (head + 1) % capacity;
        }
    }

    T pop() {
        if (isEmpty()) {
            throw underflow_error("Buffer is empty");
        }
        T oldestElement = data[head];
        head = (head + 1) % capacity;
        count--;
        return oldestElement;
    }

    T peek() const {
        if (isEmpty()) {
            throw underflow_error("Buffer is empty");
        }
        return data[head];
    }

    bool isEmpty() const { return count == 0; }
    bool isFull() const { return count == capacity; }
    int size() const { return count; }

    template <typename U>
    friend ostream& operator<<(ostream& out, const DataBuffer<U>& buf);
};

template <typename U>
ostream& operator<<(ostream& out, const DataBuffer<U>& buf) {
    out << "[";
    int current = buf.head;
    for (int i = 0; i < buf.count; ++i) {
        out << buf.data[current];
        if (i < buf.count - 1) out << ", ";
        current = (current + 1) % buf.capacity;
    }
    out << "]";
    return out;
}

int main() {

    DataBuffer<int> tickBuffer(5);
    for (int i = 1; i <= 7; i++) tickBuffer.push(i * 10);
    cout << "Tick Buffer: " << tickBuffer << " (10 and 20 were overwritten)" << endl;

    DataBuffer<double> tempBuffer(4);
    tempBuffer.push(36.6); tempBuffer.push(37.1);
    tempBuffer.push(38.2); tempBuffer.push(36.9);
    cout << "Before pop: " << tempBuffer << endl;
    cout << "Popped: " << tempBuffer.pop() << endl;
    cout << "After pop: " << tempBuffer << endl;

    DataBuffer<string> logBuffer(3);
    logBuffer.push("INFO: Server started");
    logBuffer.push("WARN: High memory usage");
    logBuffer.push("ERROR: DB connection timeout");
    logBuffer.push("INFO: Retry successful");
    cout << "Log Buffer: " << logBuffer << endl;

    return 0;
}
