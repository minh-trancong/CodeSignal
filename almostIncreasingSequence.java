import java.util.Arrays;

public class almostIncreasingSequence {
    boolean solution(int[] sequence) {
        Arrays.sort(sequence);

    }

    public static void main(String[] args){
        int[] array = {6, 2, 3, 8};
        System.out.println(solution(array));
    }
}
