public class java4{
    public static int add(int x, int y)  {
      return x + y;
    }
    public static double add(double x , double y){
        return x + y;
    }
    public static String add(String x , String y){
        return x + y;
    }
    
    public static void main (String[] args){
        System.out.println(add(5,6));
        System.out.println(add(4.8,6.8));
        System.out.println(add("じゃじゃ","かか"));
    }
}