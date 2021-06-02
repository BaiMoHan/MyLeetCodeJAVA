package T0523

func checkSubarraySum(nums []int, k int) bool {
	n := len(nums)
	if n < 2 {
		return false
	}
	mp := map[int]int{
		0: -1,
	}
	pre := 0
	for i, num := range nums {
		pre = (pre + num) % k
		if start, ok := mp[pre]; ok {
			if i-start >= 2 {
				return true
			}
		} else {
			mp[pre] = i
		}

	}
	return false
}
