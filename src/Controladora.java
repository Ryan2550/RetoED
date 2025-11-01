import cu.edu.cujae.ceis.tree.binary.BinaryTree;
import cu.edu.cujae.ceis.tree.binary.BinaryTreeNode;
import cu.edu.cujae.ceis.tree.general.GeneralTree;

public class Controladora {

    private GeneralTree<ElementoMusical> tree;

    public Controladora(Plataforma p){
        tree = new GeneralTree<ElementoMusical>();
        BinaryTreeNode<ElementoMusical> root = new BinaryTreeNode<ElementoMusical>((ElementoMusical)p);
        tree.setRoot(root);
    }
}
