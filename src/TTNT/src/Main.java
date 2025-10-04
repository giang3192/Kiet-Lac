//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Node node40 = new Node(40);
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node60 = new Node(60);
        Node node50 = new Node(50);
        Node node70 = new Node(70);

        node40.addNeighbours(node10);
        node40.addNeighbours(node20);
        node20.addNeighbours(node10);
        node20.addNeighbours(node30);
        node20.addNeighbours(node60);
        node20.addNeighbours(node50);
        node10.addNeighbours(node30);
        node30.addNeighbours(node60);
        node60.addNeighbours(node70);
        node50.addNeighbours(node70);

        BFS bfsExample = new BFS();
        System.out.println("Đường đi từ 40 đến 70 bằng BFS:");
        bfsExample.bfsUsingQueue(node40, 70);
        resetNodes(node40, node10, node20, node30, node60, node50, node70);

        DFS dfsExample = new DFS();
        System.out.println("Đường đi từ 40 đến 70 bằng DFS:");
        dfsExample.dfsUsingStack(node40, 70);
    }

    private static void resetNodes(Node... nodes) {
        for (Node n : nodes) {
            n.visited = false;
            n.parent = null;
        }

    }
}