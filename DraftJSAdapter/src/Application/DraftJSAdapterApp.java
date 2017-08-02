package Application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import controller.ContentStateDeserializer;
import model.ContentState;

public class DraftJSAdapterApp {

	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		// Configure GSON
	    final GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(ContentState.class, new ContentStateDeserializer());
//	    gsonBuilder.registerTypeAdapter(Author.class, new AuthorDeserializer());
	    final Gson gson = gsonBuilder.create();

	    // Read the JSON data
	    FileInputStream inputStream = new FileInputStream(new File("resources/draftRaw.json"));
	    InputStreamReader reader = new InputStreamReader(inputStream);
	    

	    // Parse JSON to Java
	    final ContentState cs = gson.fromJson(reader, ContentState.class);
	    System.out.println(cs);
	    System.out.println(cs.getText());
	    
	  }

	}


