package kr.co.tproject.template.adapter.face.impl;

import kr.co.tproject.template.adapter.face.RowingBoat;
import kr.co.tproject.template.adapter.face.cla.FishingBoat;

public class FishingBoatAdapter implements RowingBoat{

	private final FishingBoat boat = new FishingBoat();
	
	@Override
	public void row() {
		boat.sail();
	}
}
