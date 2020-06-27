#include <iostream>

using namespace std;


int main() {
    
    int coinInput;
    int dollars;
    int quarters;
    int dimes;
    int nickels;
    int pennies;
    int coinCount;
    
    cin >> coinInput;
    
    if (coinInput <= 0) {
        cout << "No change" << endl;
        return 0;
    }
    
    dollars = coinInput / 100;
    coinCount = coinInput - dollars * 100;
    
    quarters = coinCount / 25;
    coinCount -= quarters * 25;
    
    dimes = coinCount / 10;
    coinCount -= dimes * 10;
    
    nickels = coinCount / 5;
    coinCount -= nickels * 5;
    
    pennies = coinCount;
    coinCount -= pennies;
    
    
    if ( dollars >= 2 ) {
        cout << dollars << " Dollars" << endl;
    } else if ( dollars == 1 ) {
        cout << "1 Dollar" << endl;
    }
    
    if ( quarters >= 2 ) {
        cout << quarters << " Quarters" << endl;
    } else if ( quarters == 1 ) {
        cout << "1 Quarter" << endl;
    }
    
    if ( dimes >= 2 ) {
        cout << dimes << " Dimes" << endl;
    } else if ( dimes == 1 ) {
        cout << "1 Dime" << endl;
    }
    
    if ( nickels >= 2 ) {
        cout << nickels << " Nickels" << endl;
    } else if ( nickels == 1 ) {
        cout << "1 Nickel" << endl;
    }
    
    if ( pennies >= 2 ) {
        cout << pennies << " Pennies" << endl;
    } else if ( pennies == 1 ) {
        cout << "1 Penny" << endl;
    }
    
    
    return 0;
}
