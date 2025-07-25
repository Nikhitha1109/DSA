class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) 
    {
        int pt = 0; //Poisoned time
        int total_time = 0;
        for(int t:timeSeries)
        {
            if(pt>t) //overlap
                total_time += (t + duration - pt);
            else
                total_time +=duration;

            pt = t+duration;
        }
        return total_time;
    }
}