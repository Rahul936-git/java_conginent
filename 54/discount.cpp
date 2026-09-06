#include <iostream>
#include <string>
#include <vector>
#include <sstream>
#include <iomanip>
#include <cfloat>

using namespace std;

int main() {

    int n;
    cin >> n;
    cin.ignore();

    double minDiscountAmount = DBL_MAX;

    vector<string> minItems;

    for (int i = 0; i < n; i++) {

        string line;
        getline(cin, line);

        stringstream ss(line);

        string name;
        string priceStr;
        string discountStr;

        getline(ss, name, ',');
        getline(ss, priceStr, ',');
        getline(ss, discountStr, ',');

        // Remove spaces
        name.erase(0, name.find_first_not_of(" "));
        name.erase(name.find_last_not_of(" ") + 1);

        double price = stod(priceStr);
        double discountPercent = stod(discountStr);

        double discountAmount =
            price * discountPercent / 100;

        if (discountAmount < minDiscountAmount) {

            minDiscountAmount = discountAmount;

            minItems.clear();

            minItems.push_back(name);
        }
        else if (discountAmount == minDiscountAmount) {

            minItems.push_back(name);
        }
    }

    for (string item : minItems) {
        cout << item << endl;
    }

    return 0;
}