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
    }
}