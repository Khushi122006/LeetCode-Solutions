class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //create a array 
        int []arr=new int[temperatures.length];

       //create a stack(temperature indices)

       Stack<Integer> stack =  new Stack<>();

       //comapre current and previous
       for (int i=0;i<temperatures.length;i++){
        while(!stack.isEmpty()&& temperatures[i]>temperatures[stack.peek()]){
            int prevIndex= stack.pop();
               arr[prevIndex]=i-prevIndex;
        }
        stack.push(i);
       }return arr; 
    }
}