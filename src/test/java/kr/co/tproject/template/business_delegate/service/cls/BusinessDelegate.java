package kr.co.tproject.template.business_delegate.service.cls;

import kr.co.tproject.template.business_delegate.service.face.VideoStreamingService;
import lombok.Data;

@Data
public class BusinessDelegate {
	
	private BusinessLookup lookupService;
	
	public void playbackMovie(String movie) {
		VideoStreamingService videoStreamingService = lookupService.getBusinessService(movie);
		videoStreamingService.doProcessing();
	}
	
}
