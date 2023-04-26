package kr.co.tproject.template.abstract_documents.face;

import kr.co.tproject.template.abstract_documents.face.enums.Property;

public interface HasType extends Document{
	
	default String getType(){
		return (String) get(Property.TYPE.toString());
	}

}
