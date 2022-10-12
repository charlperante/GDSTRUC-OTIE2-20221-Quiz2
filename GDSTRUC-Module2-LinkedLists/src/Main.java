import java.lang.management.PlatformLoggingMXBean;

public class Main {
    public static void main(String[] args) {

        Player asuna = new Player(1,"Asuna", 100);
        Player lethalBacon = new Player(2,"LethalBacon", 205);
        Player hpDeskjet = new Player(3,"HPDeskjet", 34);
        Player heathcliff = new Player(4,"Heathcliff", 56);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(heathcliff);
        playerLinkedList.addToFront(hpDeskjet);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(asuna);

        playerLinkedList.deleteNode();
        playerLinkedList.printList();

        System.out.println("Contains: " +playerLinkedList.contains(asuna));
        System.out.println("Index of: " +playerLinkedList.indexOf(heathcliff));


    }
}