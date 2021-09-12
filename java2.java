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
        t1();
        t2();
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
}