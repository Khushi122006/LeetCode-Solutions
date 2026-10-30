
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse nums2
        for (int num : nums2) {

            while (!stack.isEmpty() && num > stack.peek()) {

                int smaller = stack.pop();
                map.put(smaller, num);
            }

            stack.push(num);
        }

        // Remaining elements have no greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        int[] arr = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            arr[i] = map.get(nums1[i]);
        }

        return arr;
    }
}
