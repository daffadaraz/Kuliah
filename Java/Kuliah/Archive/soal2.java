public class soal2{
    public static void main(String[]args){
        short[] num = {67,56,95,100,120};
        short max = 0;
        for(int i = 0; i < num.length-1;i++){
            int j = i + 1;
            System.out.println("Number "+(j)+" : "+num[i]);
            max = num[i]>num[j]? num[i]:num[j];
        }
        System.out.println("Number "+(num.length)+" : "+num[num.length-1]);
        System.out.println("Max Number : "+max);
    }
}