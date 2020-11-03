package Intro;

public class IfElse2 {
    static int test(int testval, int target, int begin, int end) {

        if (testval >= begin && testval <= end) {
            if (testval > target)
                return 1;
            else if (testval < target)
                return -1;
            else
                return 0;
        }
        return 0;
    }

    public static void main (String[] args){
        System.out.println((test(10, 5, 1, 10)));
        System.out.println((test(5, 10, 8, 60)));
        System.out.println((test(5, 5, 60, 80)));
    }
}


