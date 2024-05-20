class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        // Adjacency list for courses (prerequisites of each course)
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        // Adding dependent courses for each course
        for (int[] edge : prerequisites) {
            adj.get(edge[1]).add(edge[0]);
        }
        // Indegree(prerequisites) array for each course
        int[] indegree = new int[numCourses];
        for (int[] edge : prerequisites) {
            indegree[edge[0]]++;
        }

        int enrolled = 0;
        Queue<Integer> queue = new LinkedList<>();
        // If there is no indegree(prerequisites) for a course 
        // add to queue and increase the enrolled
        for (int node = 0; node < indegree.length; node++) {
            if (indegree[node] == 0) {
                queue.add(node);
                enrolled++;
            }
        }
        // get the dependent courses from adjacency list
        // for the current node and decrease it indegree
        while (!queue.isEmpty()) {
            int currNode = queue.poll();
            for (int neighbour : adj.get(currNode)) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) {
                    queue.add(neighbour);
                    enrolled++;
                }
            }
        }
        return (numCourses == enrolled);
    }
}