package adapter_beispiel_dozent.adapter;

import adapter_beispiel_dozent.advancedMediaPlayer.AdvancedMediaPlayer;
import adapter_beispiel_dozent.advancedMediaPlayer.Mp4Player;
import adapter_beispiel_dozent.advancedMediaPlayer.VclPlayer;
import adapter_beispiel_dozent.mediaplayer.MediaPlayer;

public class MediaPlayerAdapter implements MediaPlayer {
	AdvancedMediaPlayer amp;
	
	public MediaPlayerAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			amp = new VclPlayer();
		} else if(audioType.equalsIgnoreCase("mp4")) {
			amp = new Mp4Player();					
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			amp.playVlc(fileName);
		} else if(audioType.equalsIgnoreCase("mp4")) {
			amp.playMp4(fileName);					
		}
	}

}
