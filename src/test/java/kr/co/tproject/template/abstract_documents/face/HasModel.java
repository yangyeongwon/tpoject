package kr.co.tproject.template.abstract_documents.face;

import kr.co.tproject.template.abstract_documents.face.enums.Property;

public interface HasModel extends Document {
	
	default String getModel(){
		return (String) get(Property.MODEL.toString());
	}
}
