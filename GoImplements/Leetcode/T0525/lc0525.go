package T0525

func findMaxLength(nums []int) int {
	res := 0
	pre := 0
	mp := map[int]int{
		0: -1,
	}
	for i, num := range nums {
		if num == 1 {
			pre++
		} else {
			pre--
		}
		if v, ok := mp[pre]; ok {
			res = max(res, i-v)
		} else {
			mp[pre] = i
		}
	}
	return res
}
func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}
