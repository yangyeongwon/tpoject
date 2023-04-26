package kr.co.tproject.template.abstract_documents.face.impl;

import java.util.Map;
import java.util.Optional;

import kr.co.tproject.template.abstract_documents.face.HasModel;
import kr.co.tproject.template.abstract_documents.face.HasPrice;
import kr.co.tproject.template.abstract_documents.face.HasType;
import kr.co.tproject.template.abstract_documents.face.abs.AbstractDocument;
import lombok.Data;

public class Part extends AbstractDocument implements HasType, HasModel, HasPrice  {

	
	public Part(Map<String, Object> properties) {
		super(properties);
	}
}