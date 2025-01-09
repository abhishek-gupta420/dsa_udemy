package dsa.tree;

public class TreeMain {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");


        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("coffee");
        TreeNode coke = new TreeNode("Coke");
        TreeNode colddCoffee = new TreeNode("Cold Coffee");

        drinks.addChild(hot);
        drinks.addChild(cold);

        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(coke);
        cold.addChild(colddCoffee);

        System.out.println(drinks.print(0));
    }
}
