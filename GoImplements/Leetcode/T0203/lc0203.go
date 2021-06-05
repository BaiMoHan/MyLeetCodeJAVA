package T0203

type ListNode struct {
	Val  int
	Next *ListNode
}

func removeElements(head *ListNode, val int) *ListNode {
	root := ListNode{-1, nil}
	var p *ListNode = &root
	for head != nil {
		if head.Val != val {
			p.Next = head
			p = p.Next
		}
		head = head.Next
	}
	p.Next = nil
	return root.Next
}
