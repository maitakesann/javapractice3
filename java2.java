public class java2{
    public static void main(String[] args){
        int dice = new java.util.Random().nextInt(10);
        System.out.println("サイコロの目:"+ dice);
        if(dice >= 5){
            System.out.println("5以上です");
        }
    }
}