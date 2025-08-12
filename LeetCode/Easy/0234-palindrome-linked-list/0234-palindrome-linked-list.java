class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> numbers = new ArrayList<>();

        while(head != null) {
            numbers.add(head.val);
            head = head.next;
        }

        int start = 0;
        int end = numbers.size() - 1;

        while(start < end) {
            if(numbers.get(start) != numbers.get(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}