package pl.java.mp3player.mp3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Mp3Collection {
	private ObservableList<Mp3Song> songlist;

	public ObservableList<Mp3Song> getSonglist() {
		return songlist;
	}
	
	public void addSong(Mp3Song song) {
		songlist.add(song);
	}
	public void addSongs(ObservableList<Mp3Song> mp3Songs) {
		songlist.addAll(mp3Songs);
	}
	public void clear() {
		songlist.clear();
	}
	public Mp3Collection() {
		this.songlist = FXCollections.observableArrayList();
	}
	
	

}
