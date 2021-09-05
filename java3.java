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
    }
}