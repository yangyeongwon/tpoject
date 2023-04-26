package kr.co.tproject.template.acuclic_visitor.face.mdmvisitorimpl;

import kr.co.tproject.template.acuclic_visitor.face.ModemVisitor;
import kr.co.tproject.template.acuclic_visitor.face.modemimpl.Hayes;

public interface HayesVisitor extends ModemVisitor {
	
	void visit(Hayes hayes);
}
