#include <iostream>
#include <string>
#include <sstream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {

    cout << "Enter no of course: ";

    int n;
    cin >> n;

    if (n < 0 || n > 20) {
        cout << "Invalid Range";
        return 0;
    }

    cin.ignore();

    cout << "Enter course names: ";

    string line;
    getline(cin, line);

    stringstream ss(line);

    vector<string> courses;
    string course;

    while (ss >> course) {
        courses.push_back(course);
    }

    if (courses.size() != n) {
        cout << "Invalid Range";
        return 0;
    }

    cout << "Enter the course to be searched: ";

    string search;
    cin >> search;

    bool found = false;

    for (string course : courses) {

        if (course.size() == search.size()) {

            bool same = true;

            for (int i = 0; i < course.size(); i++) {

                if (tolower(course[i]) != tolower(search[i])) {
                    same = false;
                    break;
                }
            }

            if (same) {
                found = true;
                break;
            }
        }
    }

    if (found)
        cout << search << " course is available";
    else
        cout << search << " course is not available";

    return 0;
}