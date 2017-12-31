package com.company.Advanced;

import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}
//////////////////////////////////////////////////////////////////////
class SumInLeavesVisitor extends TreeVis {
    int result=0;

    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
        result+=leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    public long result =1;
    final int M = 1000000007;

    public int getResult() {
        return (int) result;
    }

    public void visitNode(TreeNode node) {
        if(node.getColor().equals(Color.RED)) {
            result =(result*node.getValue())%M;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
       if(leaf.getColor().equals(Color.RED)){
           result = (result*leaf.getValue())%M;
       }
    }
}

class FancyVisitor extends TreeVis {
    public long evenDepthNoLeafSum=0; //Why //Why
    public long greenSum=0;

    public int result =0;

    public int getResult() {
        return (int) Math.abs(evenDepthNoLeafSum-greenSum);
    }

    public void visitNode(TreeNode node) {
        if(node.getDepth() % 2 == 0) {
            evenDepthNoLeafSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor().equals(Color.GREEN))
            greenSum += leaf.getValue();
    }
}

//////////////////////////////////////////////////////////////////////
public class Java_Visitor {

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] values = new int[n+1];
        int[] colors = new int[n+1];
        int[] parents = new int[n+1];
        int[] depths = new int[n+1];
        Tree[] treeNodes=  new Tree[n+1];
        System.out.print("Building graph");

        HashMap<Integer,HashSet<Integer>> nodeMap = new HashMap<>();

        TreeNode[] nodes =  new TreeNode[n+1];
        for(int i=1;i<=n;i++){
            values[i]=in.nextInt();
            parents[i]=0;
            depths[i]=-1;
        }

        for(int i=1;i<=n;i++)
            colors[i]=in.nextInt();

        for(int i=1;i<=n;i++){
            nodeMap.put(i,new HashSet<>());
        }

        while(in.hasNextInt()){
            int n1,n2;
            n1=in.nextInt();
            n2=in.nextInt();
            nodeMap.get(n1).add(n2);
            nodeMap.get(n2).add(n1);
        }
        depths[1]=0;
        parents[1]=1;

        System.out.print("Determining depths");
        getDepths(1,depths,parents,nodeMap);
        System.out.print(depths);
        System.out.print(parents);

        treeNodes[1] = new TreeNode(values[1],(colors[1]==0) ? Color.RED : Color.GREEN,depths[1]);
        for(int i=2;i<=n;i++){
            if(nodeMap.get(i).size() > 1)
                 treeNodes[i]=new TreeNode(values[i],(colors[i] == 0)? Color.RED : Color.GREEN, depths[i]);
            else //Why do we need a separate object for a leaf
                treeNodes[i]=new TreeLeaf(values[i],(colors[i] == 0)? Color.RED : Color.GREEN, depths[i]);
        }
        for(int i=2;i<=n;i++){
            System.out.println("Adding to parent node "+ parents[i] + " the child "+ i + " that is leaf ?"+ (treeNodes[i] instanceof TreeLeaf));
            ( (TreeNode) treeNodes[parents[i]]).addChild(treeNodes[i]);
        }
        return  treeNodes[1]; //Return the root;
    }

    static void getDepths(int parentNode,int[] depths,int[] parents,HashMap<Integer,HashSet<Integer>> nodeMap){
            for(int node : nodeMap.get(parentNode)){
                if(depths[node]==-1){
                    depths[node]= depths[parentNode]+1;
                    parents[node]=parentNode;
                    getDepths(node,depths,parents,nodeMap);
                }
            }
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

