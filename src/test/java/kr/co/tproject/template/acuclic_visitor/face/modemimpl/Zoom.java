package kr.co.tproject.template.acuclic_visitor.face.modemimpl;

import kr.co.tproject.template.acuclic_visitor.face.Modem;
import kr.co.tproject.template.acuclic_visitor.face.ModemVisitor;
import kr.co.tproject.template.acuclic_visitor.face.mdmvisitorimpl.ZoomVisitor;

public class Zoom implements Modem {

	@Override
	public void accept(ModemVisitor modemVisitor) {
		if(modemVisitor instanceof ZoomVisitor) {
			((ZoomVisitor) modemVisitor).visit(this);
		} else {
			System.out.println("Only zoomVisitor is allowed to visit Zoom modem");
		}
	}
	
	
}
