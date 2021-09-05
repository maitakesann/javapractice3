public class java3{
    public static void main(String[] args){
        int isHungry = 1; String food = "Egg";
        
        System.out.println("こんにちは");
        
        if (isHungry == 0){
            System.out.println("お腹いっぱいです");
        }else{
            System.out.println("腹ペコです");
        }
        
        if (isHungry == 1){
            System.out.println(food +"をいただきます");
        }
        
        System.out.println("数当てゲーム");
        int ans = new java.util.Random().nextInt(10);
        for (int i = 0; i < 5 ; i++){
            System.out.println("0~9の数字を入れてください");
            int num = new java.util.Scanner(System.in).nextInt();
            if(ans == num){
                System.out.println("アタリ");
            }else{
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}