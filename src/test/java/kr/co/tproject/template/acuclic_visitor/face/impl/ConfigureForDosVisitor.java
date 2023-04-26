package kr.co.tproject.template.acuclic_visitor.face.impl;

import kr.co.tproject.template.acuclic_visitor.face.mdmvisitorimpl.allimpl.AllModemVisitor;
import kr.co.tproject.template.acuclic_visitor.face.modemimpl.Hayes;
import kr.co.tproject.template.acuclic_visitor.face.modemimpl.Zoom;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConfigureForDosVisitor implements AllModemVisitor{

	@Override
	public void visit(Hayes hayes) {
		System.out.println(hayes + " used whth Dos configuratior");
	}

	@Override
	public void visit(Zoom zoom) {
		System.out.println(zoom + " used whth Dos configuratior");
	}

}
