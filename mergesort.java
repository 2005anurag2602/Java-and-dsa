public class mergesort {
    public static void divide(int[] arr,int si,int ei){
       if(si>=ei){
           return;
       }
        int mid = si + (ei - si) / 2;
       divide(arr,si,mid);
        divide(arr,mid+1,ei);

    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}