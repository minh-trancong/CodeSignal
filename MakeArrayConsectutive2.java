import java.util.Arrays;   

class MakeArrayConsectutive2 {
    
    static int solution(int[] statues){
        int result;
        Arrays.sort(statues);
        result = statues[statues.length - 1] - statues[0] + 1 - statues.length;
        return result; 
    }
    
    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        System.out.println(solution(statues));
    }
}