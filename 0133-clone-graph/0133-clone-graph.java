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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
   
    private Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        // If the node has already been cloned, return the existing clone
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        // Step 1: Create a clone for the current node
        Node cloneNode = new Node(node.val, new ArrayList<>());
        
        // Step 2: Store it in visited map before traversing neighbors
        visited.put(node, cloneNode);

        // Step 3: Recursively clone all neighbors
        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

        return cloneNode;
    }
}