public class java3{
    public static void main(String[] args){
        int dice = (int)(Math.random()*7) + 1; //1~7までの乱数を発生させる
        System.out.println("サイコろの目:" + dice);
        if(1 <= dice && dice <= 6){
            if(dice % 2 == 0){
                System.out.println("丁です");
            }else{
                System.out.println("半です");
            }
        }else{
            System.out.println("該当しません");
        }
    }
}