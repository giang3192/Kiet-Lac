import java.util.LinkedList;
import java.util.Queue;


public class BFS {
    public void bfsUsingQueue(Node initial, int goal) {
        Queue<Node> queue = new LinkedList<>();
        initial.visited = true;
        queue.add(initial);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.state == goal) {
                printPath(node, initial);
                return;
            }

            for (Node n : node.getNeighbours()) {
                if (!n.visited) {
                    n.visited = true;
                    n.parent = node;
                    queue.add(n);
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
        System.out.println(initial.state + " " + s);
    }
}
