public class TrappingRainWater {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(nums));
    }

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            int max = Math.max(leftMax[i - 1], height[i]);
            leftMax[i] = max;
        }

        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            int max = Math.max(rightMax[i + 1], height[i]);
            rightMax[i] = max;
        }

        int totalWater = 0;
        for (int i = 0; i < height.length; i++) {
            totalWater = totalWater + Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return totalWater;
    }

    //excluding the height of current bar and looking the max height of left/right exclude current height
    public static int trap1(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int maxSoFar = 0;

        for (int i = 0; i < height.length; i++) {
            leftMax[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, height[i]);
        }

        maxSoFar = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            rightMax[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, height[i]);
        }

        int totalWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterAtIndexI = Math.min(leftMax[i], rightMax[i]) - height[i];
            totalWater = totalWater + (waterAtIndexI > 0 ? waterAtIndexI : 0);
        }
        return totalWater;
    }

    public static int trapTwoPointerApproach(int[] height) {

        int left = 0, right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int totalWater = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    totalWater = totalWater + (maxLeft - height[left]);
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    totalWater = totalWater + (maxRight - height[right]);
                }
                right--;
            }
        }
        return totalWater;
    }
}
