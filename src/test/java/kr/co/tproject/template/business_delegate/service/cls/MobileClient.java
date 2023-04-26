package kr.co.tproject.template.business_delegate.service.cls;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MobileClient {
	
	private final BusinessDelegate businessDelegate;
	
	public void playbackMovies(String movie) {
		businessDelegate.playbackMovie(movie);
	}
	
}
