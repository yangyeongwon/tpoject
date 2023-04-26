package kr.co.tproject.template.adapter.main;

import org.junit.jupiter.api.Test;

import kr.co.tproject.template.adapter.face.cla.Captain;
import kr.co.tproject.template.adapter.face.impl.FishingBoatAdapter;

class App {

	@Test
	void test() {
		Captain capTain = new Captain(new FishingBoatAdapter());
		capTain.row();

	}
}
