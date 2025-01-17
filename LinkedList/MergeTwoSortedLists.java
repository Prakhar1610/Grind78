package LinkedList;

class ListNode 
{
	int val;
	ListNode next;
	
	ListNode()
	{
		
	}
	
	ListNode(int val) 
    { 
  	  this.val = val; 
    }
	
    ListNode(int val, ListNode next) 
    { 
  	  this.val = val; this.next = next; 
    }
} 

public class MergeTwoSortedLists 
{
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode head = null;
        ListNode tail = null;

        ListNode l1 = list1;
        ListNode l2 = list2;

        if(l1 == null)
           return l2;
        
        if(l2 == null)
           return l1;

        if(head == null)
        {
            if(l1.val < l2.val)
            {
                head = l1;
                tail = l1;
                l1 = l1.next;
            }
            else
            {
                head = l2;
                tail = l2;
                l2 = l2.next;
            }
        }
        
            for(int i=0 ; ; i++)
            {
                if(l1 == null || l2 == null)
                   break;

                if(l1.val <= l2.val)
                {
                    tail.next = l1;
				    tail = tail.next;
				    l1 = l1.next;
                }
                else
                {
                    tail.next = l2;
				    tail = tail.next;
				    l2 = l2.next;
                }
            }
        
        tail.next = (l1 != null) ? l1 : l2;
        return head;
    }
}
