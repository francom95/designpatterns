package generic.observer.example;

public class YoutubeChannel extends Subject{

	private String lastVideoPosted;

	public YoutubeChannel() {}
	
	public boolean addSubscriber(Subscriber subscriber) {
		return this.attach(subscriber);
	}
	
	public boolean removeSubscriber(Subscriber subscriber) {
		return this.detach(subscriber);
	}
	
	public void addNewVideo(String title) {
		System.out.println("New Youtube video added to channel. Title: "+title); // add video logic
		this.lastVideoPosted = title;
		this.notifyObservers(); //notify
	}

	public String getLastVideoPosted() {
		return lastVideoPosted;
	}
	
}
