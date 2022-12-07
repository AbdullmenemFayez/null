public class ShoppingCartList {
    int size;
    ItemNode head, tail;

    public ShoppingCartList() {
        head = tail = new ItemNode();
        size = 0;
    }

    public void addItem(ItemNode item) {
        tail.next = item;
        tail = tail.next;
        size++;
    }

    public String get(String Id) {
        ItemNode curr = head.next;
        while (curr != null) {
            if (curr.ID.equals(Id)) break;
            curr = curr.next;
        }
        return curr == null ? "none" : "(" + curr.name + " , " + curr.quantity + " )";
    }
}
