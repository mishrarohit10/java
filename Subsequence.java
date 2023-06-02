import java.util.ArrayList;

class Subsequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        subseq(0,list, 3,arr,3);
    }
    static void subseq(int index,ArrayList<Integer> list, int size, int[] arr,int t) {
        if(index == size) {
            int sum = 0;
            for(Integer i: list) {
                sum += i;
            }
            if(sum==t) {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[index]);
        subseq(index+1, list, size, arr,t);
        list.remove(list.size()-1);
        subseq(index+1, list, size, arr,t);
    }
}