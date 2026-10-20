class Solution {
    public double average(int[] salary) {
        int max=Arrays.stream(salary).max().getAsInt();
        int min=Arrays.stream(salary).min().getAsInt();
        int sum=0;

        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
        }
        double avg=(double)(sum-max-min)/(salary.length-2);
        return avg;
    }
}