
import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int item)
    {
        data=item;
        left=right;
    }
}
public class Inverse
{
    Node root;
    void inverse1(Node node)
    {
        int h=height(node);
        for(int i=h;i>=1;i--)
        {
            Display(node,i);
        }
    }
    void Display(Node node,int level)
    {
        if(node==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.println(node.data+" ");
        }
        else if(level>1)
        {
            Display(node.right,level-1);
            Display(node.left,level-1);
        }
    }
      int height(Node node)  
    { 
        if (node == null) 
            return 0; 
        else
        { 
            
            int lheight = height(node.left); 
            int rheight = height(node.right); 
   
          
            if (lheight > rheight) 
                return (lheight + 1); 
            else
                return (rheight + 1); 
        } 
    } 
    public static void main(String args[])
    {
        Inverse tree=new Inverse();
        tree.root=new Node(40);
        tree.root.left=new Node(30);
        tree.root.right=new Node(70);
        tree.root.left.left=new Node(20);
        tree.root.left.right=new Node(35);
        tree.root.right.left=new Node(50);
        tree.root.right.right=new Node(80);
        tree.inverse1(tree.root);
    
    }
}
