
public class ArrayBasedPlaylist {

    private final Song[] songs;
    private final int capacity;
    private int size;

    public ArrayBasedPlaylist(int capacity) {
        this.capacity = capacity;
        this.songs = new Song[capacity];
        this.size = 0;
    }

    public void appendSong(Song song) {
        if (size == capacity) {
            System.out.println("Playlist is full!");
        } else {
            songs[size] = song;
            System.out.println("\"" + song + "\" added to index " + size);
            size++;
        }
    }

    @Override
    public String toString() {
        var output = new StringBuilder();

        for (Song song : songs) {
            output.append(song);
            output.append(", ");
        }

        return output.toString();
    }

    public static void main(String[] args) {
        var myPlaylist = new ArrayBasedPlaylist(5);

        myPlaylist.appendSong(new Song("Everything You Are"));
        myPlaylist.appendSong(new Song("Cincin"));
        myPlaylist.appendSong(new Song("Rumah ke Rumah"));
        myPlaylist.appendSong(new Song("Evaluasi"));
        myPlaylist.appendSong(new Song("Secukupnya"));
        myPlaylist.appendSong(new Song("Kita ke Sana"));

        System.out.println(myPlaylist);
    }
}
