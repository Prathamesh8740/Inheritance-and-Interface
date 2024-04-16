package evolution;

class telephone {
	public void call() {
		System.out.println("Call to 199");
	}
}
class phone extends telephone{
	public void message() {
		System.out.println("message to 199");
	}
}
interface music{
	public void pause();
	void play();
}
interface camera{
	void click();
	void record();
}
interface whatsapp{
	void VoiceCall();
	void VideoCall();
	void Chat();
	void Status();
}
class smartphone extends phone implements music,camera,whatsapp { 
	public void pause() {
		
	}
	public void play() {
		
	}
	public void click() {
		
	}
	public void record() {
		
	}
	public void VoiceCall() {
		
	}
	public void VideoCall() {
		
	}
	public void Chat() {
		
	}
	public void Status() {
		
	}
}