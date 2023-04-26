package kr.co.tproject.template.abstract_documents.face;

import java.util.stream.Stream;

import kr.co.tproject.template.abstract_documents.face.enums.Property;
import kr.co.tproject.template.abstract_documents.face.impl.Part;

public interface HasParts extends Document{
	
	default Stream<Part> getParts() {
		return children(Property.PARTS.toString(), Part::new);
	}
}