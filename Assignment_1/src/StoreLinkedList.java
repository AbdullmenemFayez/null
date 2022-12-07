public class StoreLinkedList {
    private int size;
    ItemNode head, tail;

    public StoreLinkedList() {
        size = 0;
        head = tail = new ItemNode();
    }

    public int getSize() {
        return size;
    }

    public boolean AddItem(ItemNode itemNode) {
        if (contains(itemNode)) return false;
        tail.next = itemNode;
        tail = tail.next;
        size++;
        return true;
    }

    public boolean deleteItem(String Id) {
        ItemNode prev = head;
        ItemNode curr = head.next;
        while (curr != null) {
            if (curr.ID.equals(Id)) {
                prev.next = curr.next;
                return true;
            }
            curr = curr.next;
            prev = prev.next;
        }
        return false;
    }


    private boolean contains(ItemNode itemNode) {
        if (itemNode == null) return false;
        ItemNode curr = head.next;
        while (curr != null) {
            if (curr.ID.equals(itemNode.ID)) return true;
            curr = curr.next;
        }
        return false;
    }


}
