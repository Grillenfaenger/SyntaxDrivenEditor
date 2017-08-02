package model;

import java.util.ArrayList;

public class ContentBlock {
	
	private String key;
	private String text;
	private String type; // DraftBlockType
	private int depth;
	private ArrayList<InlineStyleRange> inlineStyleRanges;
	private ArrayList<EntityRange> entityRanges;
	
	public String getKey() {
		return key;
	}
	
	public String getText() {
		return text;
	}

	public String getType() {
		return type;
	}

	public int getDepth() {
		return depth;
	}

	public ArrayList<InlineStyleRange> getInlineStyleRanges() {
		return inlineStyleRanges;
	}

	public ArrayList<EntityRange> getEntityRanges() {
		return entityRanges;
	}

	@Override
	public String toString() {
		return "ContentBlock [key=" + key + ", text=" + text + ", type=" + type + ", depth=" + depth
				+ ", inlineStyleRanges=" + inlineStyleRanges + ", entityRanges=" + entityRanges + "]";
	}
	
	
	

}
