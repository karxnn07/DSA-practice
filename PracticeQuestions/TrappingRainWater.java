public class TrappingRainWater {
    public static int trappedRainWater(int []heights) {

        int n = heights.length;
       int maxArea = 0;
       int i = 0 , 
        j = n-1;
        int width = n-1;
        while (i < j) {
           int minheight = Math.min(heights[i], heights[j]);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
            int area = width*minheight;
            maxArea = Math.max(maxArea,area);
            width--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(trappedRainWater(heights));
    }
}  