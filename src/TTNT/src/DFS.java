import java.util.Stack;

public class DFS {
    public void dfsUsingStack(Node initial, int goal) {
        Stack<Node> stack = new Stack<>();
        initial.visited = true;
        stack.push(initial);

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            if (node.state == goal) {
                printPath(node, initial);
                return;
            }

            for (Node n : node.getNeighbours()) {
                if (!n.visited) {
                    n.visited = true;
                    n.parent = node;
                    stack.push(n);
                }
            }
        }
    }

    private void printPath(Node node, Node initial) {
        String s = "";
        while (node != initial) {
            s = node.state + " " + s;
            node = node.parent;
        }
        System.out.println(initial.state + " Giang dz" + s);
    }
}
