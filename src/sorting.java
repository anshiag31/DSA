import java.util.*;
public class sorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str="The quick brown for jumps over the lazy little dog";
        String arr[]=str.split(" ");

        for (String  res:arr){
            System.out.println(res);
        }
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++) {
                if (arr[j].length()==arr[j+1].length() && arr[j].compareTo(arr[j+1])>0)
                {
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(String temp:arr)
            System.out.println (temp);
    }
}
