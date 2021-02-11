package horizoncolumbus.org;

public class Main {

    public static void main(String[] args) {
    int[] a = new int[]{3, 4, 2, 1, 5, 6, 4, 7, 8, 2};

    int largest = a[0];

    for(int i = 0; i < a.length; i++){
        if(a[i] > largest){
            largest = a[i];
        }
    }
        System.out.println(largest);
    }
}
