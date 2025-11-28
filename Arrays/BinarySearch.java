public class BinarySearch {
    public static int binarySearch(int num[],int key) {
        int start=0;  int end=num.length-1;  
        while(start<=end){
            int mid=(start + end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){ //greater
                start=mid++;
            }
            else{              //lesser
                end=mid--;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int num[]={1,5,8,3,7};
        int key=8;
        int update=binarySearch(num,key);
        if(update==-1){
            System.out.println("Invalid");
        }else{
        System.out.println("number at index: "+update);
        }
        
    }
    
}
