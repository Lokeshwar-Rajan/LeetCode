class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        for(int i=0;i<students.length;i++){
            q1.add(students[i]);
            q2.add(sandwiches[i]);
        }
        int max=students.length;
        int c=0;
        while(!q1.isEmpty() && !q2.isEmpty() && c<max){
            if(q1.peek().equals(q2.peek())){
                q1.poll();
                q2.poll();
                c=0;
            }
            else{
                int n = q1.poll();
                q1.offer(n);
                c++;
            }
        }
        return q1.size();
    }
}