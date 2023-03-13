import java.util.ArrayList;
import java.util.List;

public class Tree {
    Node root = null;
    private class Node{
        int value;
        List<Node> children;

        Node(int value){
            this.value = value;
            children = new ArrayList<>();
        }

        public void addChild(Node node, int value){
            if (root == null){
                root = new Node(value);
            } else {
                Stack stack = new Stack();
                List<Node> children = root.children;

                while (children.size() != 0){

                }
            }
        }

        public void inOrderTraversal(){

        }

        public void postOrderTraversal(){

        }

        public void preOrderTraversal(){

        }

        public void deptFirstSearch(){

        }

        public void breathFirstSearch(){

        }
    }
}
