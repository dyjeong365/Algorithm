class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(double number : numbers){
            answer+=number/numbers.length;
        }
        return answer;
    }
}