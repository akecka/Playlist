import java.util.ArrayList;

public class Playlist {

    private ArrayList<Song> songs;
    private String playlistName;

    public Playlist() {
        songs = new ArrayList<Song>();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public void add(Song a) {
        songs.add(a);
    }

    public void remove(Song a) {
        songs.remove(a);
    }


}
