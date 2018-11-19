public class Song {

    public String songName;
    public String artistName;
    public String albumName;

    public Song(String songName, String artistName, String albumName) {
        this.songName = songName;
        this.artistName = artistName;
        this.albumName = albumName;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
