package kr.co.tproject.template.adapter.face.cla;

import kr.co.tproject.template.adapter.face.RowingBoat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Captain {
	private RowingBoat rowingBoat;
	
	public void row() {
		rowingBoat.row();
	}
}
