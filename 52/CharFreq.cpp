#include <bits/stdc++.h>
using namespace std;

class CharFreq {
public:
    char ch;
    int freq;

    CharFreq(char ch, int freq) {
        this->ch = ch;
        this->freq = freq;
    }
};

struct Compare {
    bool operator()(CharFreq a, CharFreq b) {
        return a.freq < b.freq;
    }
};

int main() {

    string s;
    int d;

    cin >> s;
    cin >> d;

    if (d <= 0) {
        cout << "Cannot be rearranged";
        return 0;
    }

    // Frequency map
    unordered_map<char, int> freqMap;

    for (char c : s) {
        freqMap[c]++;
    }

    // Max Heap
    priority_queue<CharFreq, vector<CharFreq>, Compare> pq;

    for (auto it : freqMap) {
        pq.push(CharFreq(it.first, it.second));
    }

    // Waiting Queue
    queue<CharFreq> waitQueue;

    string result = "";

    while (!pq.empty()) {

        CharFreq cf = pq.top();
        pq.pop();

        result += cf.ch;

        cf.freq--;

        waitQueue.push(cf);

        if (waitQueue.size() >= d) {

            CharFreq front = waitQueue.front();
            waitQueue.pop();

            if (front.freq > 0) {
                pq.push(front);
            }
        }
    }

    if (result.length() == s.length()) {
        cout << result << endl;
    }
    else {
        cout << "Cannot be rearranged" << endl;
    }

    return 0;
}