package dev.personal.java.loops;

public class JavaLoops {

    int num;
    int limit;

    public JavaLoops(int num, int limit) {
        this.num = num;
        this.limit = limit;
    }

    public String multiplicationTable() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= limit; i++) {
            int result = num*i;
            sb.append(num).append("x").append(i).append("=").append(result).append(System.lineSeparator());
        } return sb.toString(); 
    }
}


