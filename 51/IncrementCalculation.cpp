#include <iostream>
#include <iomanip>
using namespace std;

int main() {

    double salary;
    double rating;

    cin >> salary;
    cin >> rating;

    if (salary <= 0 || rating < 1 || rating > 5) {
        cout << "Invalid Input";
        return 0;
    }

    double increment = 0;

    if (rating >= 1 && rating <= 3)
        increment = 0.1 * salary;

    else if (rating > 3 && rating <= 4)
        increment = 0.25 * salary;

    else if (rating > 4 && rating <= 5)
        increment = 0.3 * salary;

    double newSalary = salary + increment;

    cout << fixed << setprecision(2) << newSalary << endl;

    return 0;
}