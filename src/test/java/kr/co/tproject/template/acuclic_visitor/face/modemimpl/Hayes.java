package kr.co.tproject.template.acuclic_visitor.face.modemimpl;

import kr.co.tproject.template.acuclic_visitor.face.Modem;
import kr.co.tproject.template.acuclic_visitor.face.ModemVisitor;
import kr.co.tproject.template.acuclic_visitor.face.mdmvisitorimpl.HayesVisitor;

public class Hayes implements Modem{

	@Override
	public void accept(ModemVisitor modemVisitor) {
		if(modemVisitor instanceof HayesVisitor) {
			((HayesVisitor) modemVisitor).visit(this);
		} else {
			System.out.println("Only hayesVisitor is allowed to visite Hayes modem");
		}
	}

}
