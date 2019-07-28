import sun.awt.geom.AreaOp;

public class InputString implements SimpleInterface {

    public int add(String input){
        int sum= 0;
        if (input == null || "".equals(input)){
            return 0;
        }
        String[] str =  input.split(",");
        for (String num: str){
            sum = sum + Integer.valueOf(num);
        }
        return sum;
    }
    public int remove(int amount){
        System.out.println("this is the amount method.");
        return 10;
    }
}
