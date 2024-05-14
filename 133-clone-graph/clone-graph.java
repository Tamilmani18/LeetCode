/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    
    public Node cloneGraph(Node node) {
        
        if ( node == null ) return null;
        
        Map<Node, Node> map = new HashMap<>(); // Map to store original & cloned node
        
        Node newNode = new Node(node.val); // Cloned node
        
        map.put( node , newNode ); // adding original and cloned node to map
        
        Queue<Node> queue = new LinkedList<>(); // to keep track of cloned nodes
        queue.add(node); 

        while( !queue.isEmpty() ) {
            
            Node current = queue.poll(); 
            // getting neighbors of cloned node of current 
            List<Node> newNeighbors = map.get(current).neighbors;
            
            for ( Node n : current.neighbors ) { // neighbors of current
                
                if ( !map.containsKey(n) ) { // if neighbors are not cloned
                    
                    Node temp = new Node( n.val );
                    map.put( n , temp );
                    queue.add(n);
                
                }
                // if already cloned
                newNeighbors.add(map.get(n)); // add to neighbors of cloned
            }
        }
        return newNode;
    }
}