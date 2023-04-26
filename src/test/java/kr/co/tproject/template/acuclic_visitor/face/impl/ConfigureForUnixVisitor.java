package kr.co.tproject.template.acuclic_visitor.face.impl;

import kr.co.tproject.template.acuclic_visitor.face.mdmvisitorimpl.ZoomVisitor;
import kr.co.tproject.template.acuclic_visitor.face.modemimpl.Zoom;

public class ConfigureForUnixVisitor implements ZoomVisitor{

	@Override
	public void visit(Zoom zoom) {
		System.out.println(zoom + "used with Unix configurators");
		
	}
}
