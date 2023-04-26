package kr.co.tproject.template.acuclic_visitor.face.mdmvisitorimpl;

import kr.co.tproject.template.acuclic_visitor.face.ModemVisitor;
import kr.co.tproject.template.acuclic_visitor.face.modemimpl.Zoom;

public interface ZoomVisitor extends ModemVisitor{
	
	void visit(Zoom zoom);
}
