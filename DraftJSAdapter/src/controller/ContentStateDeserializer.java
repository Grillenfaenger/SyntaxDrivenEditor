package controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import model.ContentBlock;
import model.ContentState;
import model.Entity;

public class ContentStateDeserializer implements JsonDeserializer<ContentState>{

	@Override
	public ContentState deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		
		final JsonObject jsonObject = json.getAsJsonObject();
		
		final JsonObject jsonEntityMap = jsonObject.getAsJsonObject("entityMap");
		
//		HashMap<Integer, Entity> entityMap = new HashMap<Integer, Entity>();
//		ArrayList<ContentBlock> blocks = new ArrayList<ContentBlock>();
		
		Type mapType = new TypeToken<Map<Integer, Entity>>() {}.getType();
	    Map<Integer, Entity> entityMap = context.deserialize(jsonEntityMap, mapType);
//		Map<Integer, Entity> entityMap = context.deserialize(jsonEntityMap, Map<Integer,Entity>.class);
		ContentBlock[] blocks = context.deserialize(jsonObject.get("blocks"), ContentBlock[].class);
		
		
		ContentState cs = new ContentState(entityMap, blocks);
		return cs;
	}

}
