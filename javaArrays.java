import java.util.*;

public class javaArrays{

    /*public void arraytypes(){
        int a[] = new int[5];
        int fixedNoOfElements[] = {1,2,3};
        String b[] = {"aaa","bbb","ccc"};
    }*/
    
    public static void MarksArray(){
        try (Scanner sc = new Scanner(System.in)) {
            int marks[] = new int[10];     
            marks[0]= 9;  
            System.out.print("Enter marks of CNS: " );
            marks[1]= sc.nextInt();
            System.out.print("Enter marks of SPOS: " );
            marks[2]= sc.nextInt();
            System.out.println("length of array: "+ marks.length);
            System.out.println("TOC: " + marks[0] +"\n" + "CNS: " + marks[1] +"\n"+ "SPOS: " + marks[2]);
            
            Float avg = (float)(marks[0]+marks[1]+marks[2])/3;
            System.out.println("Average of marks: "+ avg +"%");
        }
    }

    public static void updateMarksArray(int marks[]){   //to understand pass by reference
        for(int i=0; i< marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    
    public static int LinearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public static int getLargestSmallest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number in array is: " + smallest);
        return largest;
    } 
    
    public static int binarySearch(int num[], int key){
        int start = 0;
        int end = num.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            
            if(num[mid] == key){
                return mid;
            }
            if(num[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void reverseArray(int num[]){
        int first = 0;
        int last = num.length - 1;
        while(first < last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
        System.out.print("reversed array: ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void consecutivePairs(int num[]){
        int tp =0;
        for(int i=0; i<num.length; i++){
            int curr = num[i];
            for(int j=i+1; j<num.length; j++){
                System.out.print("(" + curr + "," + num[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs are: " + tp);
    }

    public static void printSubArrays(int num[]){
        int totalSubarrays =0;
        for(int i=0; i<num.length; i++){   //print subarrays
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(num[k] + " ");
                }
                totalSubarrays++;
                System.out.println();
                }
                System.out.println();
            }
        System.out.println("total subarrays are: " + totalSubarrays);
    }
     
    public static void maxSubArraySum(int num[]){  //time complexity is O(n^3)- worst 
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){   //{2,4,6,8,10}
            int start=i;
            for(int j=i; j<num.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += num[k];
                }
                System.out.println("Sum is: "+ currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
        }
        System.out.println("max sum is: "+ maxSum);
    }

    public static void maxSubArraySum2(int num[]){  //calculate maxsum using prifix array to reduce time complexity
        int maxSum = Integer.MIN_VALUE;            // time complexity = O(n^2)
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i=0; i<num.length; i++){   //{2,4,6,8,10} = {2,6,12,20,30}  , {1, -2, 6, -1, 3} = {1, -1, 5, 4, 7}
            for (int j=i; j<num.length; j++){
                prefix[i] = i == 0 ? prefix[i] : prefix[i-1] + num[i];
            }
            System.out.print(prefix[i] + " ");
            if(maxSum < prefix[i]){
                maxSum = prefix[i];
            }
        }
        System.out.println("maxSum is: " + maxSum);
    }

    public static void kadanesSum(int num[]){
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<num.length; i++){    //{1, -2, 6, -1, 3} = {1 0 6 5 8}
            currSum += num[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum , maxSum);
            System.out.print(currSum + " ");
        }
        System.out.println("Max sum is: " + maxSum);
    }
    public static void main(String args[]){
        // MarksArray();
         
        /*
        int marks[] = {94,95,96};   //pass by reference
        updateMarksArray(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println(); 
        */
        /* 
        int numbers[]= {2,4,6,8,10,12,14,16,18,20};   //linear search
        int key = 30;
        int index = LinearSearch(numbers, key);
        if(index == -1){
            System.out.print("Key not found");
        }else{
            System.out.print("key found at index: " + index);
        }
        */
        
        // int numbers[] = {3,2,1,0,7,5,3,6,};     // largest and smallest number in array
        // int largest = getLargestSmallest(numbers);
        // System.out.print("Largest no in array is : " + largest);
        
         
        // int num[] = {1,2,3,5,6,7,8,9};   //binary search
        // int key = 6;
        // System.out.println("index for key is: "+ binarySearch(num , key));
        
        
        // int num[] = {1,4,3,5,6,2,7};  //reverse an array
        // reverseArray(num);
        
        // int num[] = {1,3,4,2,5,6,8};   //print pairs of consecutive numbers in array
        // consecutivePairs(num);

        // int num[] = {2,4,6,8,10};
        // int num[] = {1, -2, 6, -1, 3};
        // int num[] = {-2,-3,4,-1,-2,1,5,-3};
        // printSubArrays(num);
        // maxSubArraySum2(num);
        // kadanesSum(num);
    }
}