public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode tail;
    int size;

    public void addToFront(Player player) { // Add element to front
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;

        // Counter
        PlayerNode number = head;
        int count = 0;
        while (number != null) {
            count++;
            number = number.getNextPlayer();
        }
        size = count;
    }

    public void deleteNode() { // Delete first element
        PlayerNode newNodeHead = head;
        newNodeHead = newNodeHead.getNextPlayer();
        head = newNodeHead;

        // Counter
        PlayerNode number = head;
        int count = 0;
        while (number != null) {
            count++;
            number = number.getNextPlayer();
        }
        size = count;
    }

    public boolean contains(Player player) { // Check if list contains an element
        if (head == null) {
            return false;
        }
        PlayerNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.getPlayer() == player) {
                return true;
            }
            currentNode = currentNode.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player player) { // Find the index number of an element
        PlayerNode temp = head;
        int index = 0;
        while (player != temp.getPlayer()) {
            temp = temp.getNextPlayer();
            index++;
            if (temp == null) {
                return -1;
            }
        }
        return index;
    }

    public void printList() { // Print Linked List
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.print("Size of list: ");
        System.out.println(size);
    }
}
