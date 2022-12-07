public class ItemNode {
    String name, ID;
    int price, quantity, storeNumber;
    ItemNode next;

    public ItemNode() {
        next = null;

    }

    public ItemNode(String name, String Id, int price, int quantity, int storeNumber) {
        this.name = name;
        this.ID = Id;
        this.price = price;
        this.quantity = quantity;
        this.storeNumber = storeNumber;
    }
}
