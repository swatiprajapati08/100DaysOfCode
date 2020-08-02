	
/* Binary Search Tree : Insertion */

public static Node insert(Node root,int data) {

        if(root==null)
        {
            Node node=new Node(data);
            node.data=data;
            node.right=null;
            node.left=null;
            root=node;
        }
        else if(root.data > data)
        root.left=insert(root.left,data);
        else if(root.data < data)
        root.right=insert(root.right,data);

        return root;

        }
