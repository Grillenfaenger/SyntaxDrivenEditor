package model;

import java.util.Arrays;
import java.util.Map;

public class ContentState {

	private Map<Integer,Entity> entityMap;
	private ContentBlock[] blocks;
	
	public ContentState(Map<Integer, Entity> entityMap, ContentBlock[] blocks) {
		this.entityMap = entityMap;
		this.blocks = blocks;
	}
	
	public String getText(){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < blocks.length; i++) {
			sb.append(blocks[i].getText());
			sb.append("\n");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "ContentState [entityMap=" + entityMap + ", blocks=" + Arrays.toString(blocks) + "]";
	}
	
	

}
