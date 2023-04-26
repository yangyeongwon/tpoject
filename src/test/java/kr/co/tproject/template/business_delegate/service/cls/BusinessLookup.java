package kr.co.tproject.template.business_delegate.service.cls;

import java.util.Locale;

import kr.co.tproject.template.business_delegate.service.face.VideoStreamingService;
import kr.co.tproject.template.business_delegate.service.face.impl.NetflixService;
import kr.co.tproject.template.business_delegate.service.face.impl.YoutubeService;
import lombok.Data;

@Data
public class BusinessLookup {
	private NetflixService netflixService;
	private YoutubeService youtubeService;
	
	public VideoStreamingService getBusinessService(String movie) {
		if(movie.toLowerCase(Locale.ROOT).contains("die hard")) {
			System.out.println(movie.toLowerCase(Locale.ROOT));
			System.out.println(movie.toLowerCase(Locale.ROOT).contains("die hard"));
			return netflixService;
		} else{
			return youtubeService;
		}
	}
}
