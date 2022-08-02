package adapter_beispiel_dozent.mediaplayer;

import adapter_beispiel_dozent.adapter.MediaPlayerAdapter;

public class AudioPlayer implements MediaPlayer {
	MediaPlayerAdapter mpa;
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		} else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mpa = new MediaPlayerAdapter(audioType);
			mpa.play(audioType, fileName);
		}
		else {
			System.out.println("Invalid Media");
		}

	}

}
