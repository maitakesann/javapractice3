public class java2{
    public static void main(String[] args){
        int dice = new java.util.Random().nextInt(100);
        System.out.println("サイコロの目:"+ dice);
        if(dice <= 50){
            System.out.println("50未満です");
        }
    }
}