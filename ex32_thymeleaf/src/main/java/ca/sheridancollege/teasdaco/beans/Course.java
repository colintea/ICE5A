package ca.sheridancollege.teasdaco.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String prefix;
	private String code;
	private String name;

}
