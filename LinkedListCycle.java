// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : No
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
          ListNode slow=head;
        ListNode fast =head;
        boolean flag=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){ flag=true;
            break;}
        }
        if(!flag){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow=head.next;
            fast=fast.next;
        }
          return slow;
        }
    }
