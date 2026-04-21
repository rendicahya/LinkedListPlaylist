
public class LinkedListBasedPlaylist {

    private Node head;
    private Node tail;

    public void appendSong(Song song) {
        var newNode = new Node(song);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

            System.out.println("\"" + song + "\" added");
        }
    }

    @Override
    public String toString() {
        var output = new StringBuilder();
        var pointer = head;

        while (pointer != null) {
            output.append(pointer.data);
            output.append(", ");

            pointer = pointer.next;
        }

        return output.toString();
    }

    public static void main(String[] args) {
        var myPlaylist = new LinkedListBasedPlaylist();

        myPlaylist.appendSong(new Song("Everything You Are"));
        myPlaylist.appendSong(new Song("Cincin"));
        myPlaylist.appendSong(new Song("Rumah ke Rumah"));
        myPlaylist.appendSong(new Song("Evaluasi"));
        myPlaylist.appendSong(new Song("Secukupnya"));
        myPlaylist.appendSong(new Song("Kita ke Sana"));
        myPlaylist.appendSong(new Song("Membasuh"));

        System.out.println(myPlaylist);

    }
}
