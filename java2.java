public class java2{
    public static void main(String[] args){
        int dice = new java.util.Random().nextInt(100);
        System.out.println("サイコロの目:"+ dice);
        if(dice >= 80){
            System.out.println("優");
        }else if(dice <= 80 && dice >= 70){
            System.out.println("良");
        }else if(dice <= 70 && dice >=60){
            System.out.println("ka");
        }else{
            System.out.println("huka");
        }
        
        java5();
    }
    public static void java5(){
        double[] d = new double[3] ;
        double sum,avg;
        d[0] = 1.2;
        d[1] = 3.7;
        d[2] = 4.1;
        sum = 0.0;
        for(int i = 0; i < d.length; i++){
            sum += d[i];
        }
        avg = sum / d.length;
        System.out.println("合計:" + sum);
        System.out.println("平均:" + avg);
    }
}