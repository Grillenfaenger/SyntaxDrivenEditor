package model;

import java.util.HashMap;

public class Entity {
	
	private String type;
	private String mutability;
	private HashMap<String, String> data;
	
	@Override
	public String toString() {
		return "Entity [type=" + type + ", mutability=" + mutability + ", data=" + data + "]";
	}
	
	

}
