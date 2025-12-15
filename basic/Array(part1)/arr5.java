//this code is realted to binary search in sorted array...
class arr5 {
//function are used to search....
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            //this is used to find the mid of array..
            int mid = (start + end)/ 2;
            //comparision
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 6, 7, 8, 9, 10};
        int key = 6;
        int result= binarySearch(numbers, key);
        
            System.out.print("Element are " + result);

        
    }
}
