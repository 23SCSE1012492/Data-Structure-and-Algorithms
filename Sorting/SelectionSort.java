class SelectionSort{
    public static void isSelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPosition=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minPosition]){
                    minPosition =j;
                }
            }
            int temp=arr[minPosition];
            arr[minPosition]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printsort(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        isSelectionSort(arr);
        printsort(arr);
        
    }
}