package upeu.edu.pe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Categories {
	private int CategoryID;
	private String CategoryName;
	private String Descripcion;
	private String Picture;
	
}
