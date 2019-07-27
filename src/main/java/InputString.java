public class InputString {

    public int add(String input){
        if (input == null || "".equals(input)){
            return 0;
        }

        return Integer.valueOf(input);
    }
}
