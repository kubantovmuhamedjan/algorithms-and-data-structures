package DS_and_Algorithm;

import java.util.Stack;
public class Stackk {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        // System.out.println(stack.isEmpty());
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("BorderLands");
        stack.push("FFVII");

        stack.pop();

        System.out.println(stack);





    }
}
