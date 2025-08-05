import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int a[]={5,8,9,12,20,1,65,15,21,3};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
