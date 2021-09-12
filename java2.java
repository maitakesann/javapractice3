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
        
        //java5();
        //t3();
        //t4();
        t5();
    }
    public static void java5(){
        int[] j = new int[3];
        j[0]= 4; j[1]=8; j[2]=6;
        int sum = 0;
        for(int i = 0; i < j.length; i++){
            System.out.print(j[i] + " ");
           sum += j[i];
        }
        System.out.println(sum);
    }
    
    public static void t1(){
       int k[] = {5,4,3,2,1,0};
       for(int i = 0; i < k.length; i++){
           System.out.print(k[i] + " ");
       }
    }
    
    public static void t2(){
        int[] y = new int[7];
        for(int i = 0; i < y.length; i++){
            y[i] = (int)(Math.random() * 10) + 1;
            System.out.print("a["+ i +"]=" + y[i] + " ");
        }
    }
    
    public static void t3(){
        double[] d = {0.2, -5.1, 3.2, 1.8};
        for(int i = 0; i < d.length; i++){
            System.out.print("double["+ i +"]=" + d[i] + " ");
        }
        System.out.println("");
        
    }
    
    public static void t4(){
        int[] date = new int[10];
        for(int i = 0; i < date.length; i++){
            date[i] = (int)(Math.random() * 100 ) + 1;
            System.out.print(date[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        for(int i = 0; i < date.length; i++){
            if(date[i] <= 50){
                System.out.print("50未満：" + date[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("");
        for(int i = 0; i < date.length; i++){
            if(date[i] >= 50){
                System.out.print("50以上：" + date[i] + " ");
            }
        }
    }
    
    public static void t5(){
        int[] date = new int[10];
        for(int i = 0; i < date.length; i++){
            date[i] = new java.util.Random().nextInt(100);
            System.out.print(date[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i < date.length; i++){
            if(date[i] % 3 == 0){
                System.out.print("3の倍数:" + date[i] + " ");
            }
        }
        System.out.println("");
        for(int i = 0; i < date.length; i++){
            if(date[i] % 3 != 0){
                System.out.print("3の倍数以外：" + date[i] + " ");
            }
        }
    }
}