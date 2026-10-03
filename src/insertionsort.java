import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args){
        int[] data = {90,34,2,87,55};
        int a=1;
        while (a< data.length){
            int temp = data[a];
            int b = a-1;
            while (b>=0  && data[b] > temp){
                data[b+1] = data[b];
                --b;
            }
            data[b+1] = temp;
            ++a;
            System.out.println(Arrays.toString(data));
        }

    }
}
