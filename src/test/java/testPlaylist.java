import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testPlaylist {

    @Test
    public void shouldAddSong() {
        //Given
        Song song1 = new Song("Help", "The Beatles", "White Album");
        Song song2 = new Song("Tupelo", "Nick Cave", "XXX");
        Playlist playlist1 = new Playlist();
        playlist1.setPlaylistName("Moja");
        playlist1.getPlaylistName();
        playlist1.add(song1);
        playlist1.add(song2);
        //When
        //Then
        assertEquals(song1, playlist1.getSongs().get(0));
    }

    @Test
    public void shouldRemoveSong() {
        //Given
        Song song1 = new Song("Help", "The Beatles", "White Album");
        Song song2 = new Song("Tupelo", "Nick Cave", "XXX");
        Playlist playlist1 = new Playlist();
        playlist1.setPlaylistName("Moja");
        playlist1.getPlaylistName();
        playlist1.add(song1);
        playlist1.add(song2);
        playlist1.remove(song1);
        //When
        //Then
        assertEquals(1, playlist1.getSongs().size());
    }

}
