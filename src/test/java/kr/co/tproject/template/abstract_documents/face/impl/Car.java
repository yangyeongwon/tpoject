package kr.co.tproject.template.abstract_documents.face.impl;

import java.util.Map;

import kr.co.tproject.template.abstract_documents.face.HasModel;
import kr.co.tproject.template.abstract_documents.face.HasParts;
import kr.co.tproject.template.abstract_documents.face.HasPrice;
import kr.co.tproject.template.abstract_documents.face.abs.AbstractDocument;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {

	public Car(Map<String, Object> properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
}
