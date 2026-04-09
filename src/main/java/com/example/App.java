package main.java.com.example;

public class App {
    public void OddOrEven() {
    int[] arr=new int[]{1,2,3,4,5};
    for(int i=0;i<5;i++){
        if(arr[i] % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
}

