package T1744

func canEat(candiesCount []int, queries [][]int) []bool {
	n := len(candiesCount)
	sum := make([]int, n)
	sum[0] = candiesCount[0]
	for i := 1; i < n; i++ {
		sum[i] = sum[i-1] + candiesCount[i]
	}
	res := make([]bool,len(queries))
	for i, q := range queries {
		fType := q[0]
		day := q[1]
		cap := q[2]
		x1:=day+1
		y1:=(day+1)*cap
		x2:=1
		if fType>0{
			x2=sum[fType-1]+1
		}
		y2:=sum[fType]
		res[i]=!(x1>y2||x2>y1)
	}
	return res
}
