package kr.co.tproject.template.acuclic_visitor.main;

import org.junit.jupiter.api.Test;

import kr.co.tproject.template.acuclic_visitor.face.impl.ConfigureForDosVisitor;
import kr.co.tproject.template.acuclic_visitor.face.impl.ConfigureForUnixVisitor;
import kr.co.tproject.template.acuclic_visitor.face.modemimpl.Hayes;
import kr.co.tproject.template.acuclic_visitor.face.modemimpl.Zoom;

class App {

	@Test
	void test() {
		ConfigureForDosVisitor conDos = new ConfigureForDosVisitor();
		ConfigureForUnixVisitor conUnix = new ConfigureForUnixVisitor();
		
		Zoom zoom = new Zoom();
		Hayes hayes = new Hayes();
		
		hayes.accept(conDos);
		zoom.accept(conDos);
		hayes.accept(conUnix);
		zoom.accept(conUnix);
	}

}
