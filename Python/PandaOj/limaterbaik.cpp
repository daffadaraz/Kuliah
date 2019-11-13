// Example program
#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int hasil,kasus, num;
    
    cin >> kasus;
    
    for(int i = 0; i < kasus; i++){
        cin >> num;
        vector<int> arr(num);
        hasil = 0;
        for(int j = 0; j < num;j++){
            cin >> arr[j];
        }
        sort(begin(arr), end(arr), greater<>());
        for (int j = 0; j<5 ; j++){
            hasil = hasil + arr[j];
        }
        cout << hasil;   
    }
}
