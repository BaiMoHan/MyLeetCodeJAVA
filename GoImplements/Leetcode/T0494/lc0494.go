package T0494

func findTargetSumWays(nums []int, target int) int {
	sum := 0
	for _, v := range nums {
		sum += v
	}
	neg := sum - target
	if neg < 0 || neg%2 != 0 {
		return 0
	}
	neg /= 2
	dp := make([]int, neg+1)
	dp[0] = 1
	for _, v := range nums {
		for j := neg; j >= v; j-- {
			dp[j] += dp[j-v]
		}
	}
	return dp[neg]
}
