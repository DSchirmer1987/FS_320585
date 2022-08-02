package adapter_beispiel_dozent;

import adapter_beispiel_dozent.mediaplayer.AudioPlayer;

public class App {

	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();
		
		player.play("mp3", "tetris.mp3");
		player.play("mp4", "far far away.mp4");
		player.play("vlc", "urlaub.vlc");
		player.play("avi", "rennen.avi");
		player.play("MP3", "BlaBla.mp3");

	}

}
