import java.util.*;
import java.android.emdia.AudioRecord;

public class WaterChatProofOfConcept {
/*	final int freqTransmit = 15000;
	final double period = 1.0/freqTransmit;
	final double duration = 0.002;
	final double durationInSamples = Math.ceil(duration * freqTransmit);
	
	int time = 0;
	double[] rawOutPut; 
	
	public WaterChatProofOfConcept() {
		rawOutPut = new double[(int) durationInSamples];
		for (int i = 0; i < durationInSamples; i++) {
			rawOutPut[i] = Math.sin(2 * Math.PI * 440 * time);
			time += period;
		}
	}*/
	AudioRecord audio = new AudioRecord(AudioSource.MIC, 16, AudioFormat.CHANNEL_IN_MONO,
			AudioFormat.ENCODING_PCM_16BIT, 
			AudioRecord.getMinBufferSize(16, AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT));
	audio.startRecording();
	System.out.println("recording");
	audio.stop();
}
