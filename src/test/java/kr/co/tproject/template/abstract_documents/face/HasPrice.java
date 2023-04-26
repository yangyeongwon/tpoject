package kr.co.tproject.template.abstract_documents.face;

import kr.co.tproject.template.abstract_documents.face.enums.Property;

public interface HasPrice extends Document{
	
	default String getPrice(){
		return (String) get(Property.PRICE.toString());
	}
	
}
