package esempioJSONparse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

import esempioJSONparse.Foto;
import jdk.nashorn.internal.parser.JSONParser;

public class TestJSONgetAndDecodeArray {

	public static void main(String[] args) {
		ObjectMapper mapper= new ObjectMapper();
		ArrayList<Foto> PhotoList = new ArrayList<Foto>();

		String url = "https://graph.facebook.com/v7.0/3120253634680310?fields=photos&access_token=EAAH51tUzLoUBANTwlXHngL1sZCaQ5zJhNMROVPVh3kjeBXvtHZACa34AJZCrb9RUEd6KXg373gz7h6LeL2LY2AF4HHe9gWsSNuTOZCMadgfphVBqtbUE8ZA7MLMPxEdT0lRmrFJxWXhh0ERbdcYcPzCZBWMs1m9f9THFL6hNZASmCqz36G3xmD7C5QwocGykQRqGZCj2ARuk9kDeGZAyeq6kEgoKJDwj954xipr32SnbEVwZDZD";
		String fileName = "test";

		try {

			URLConnection openConnection = new URL(url).openConnection();
			InputStream in = openConnection.getInputStream();
			
			
			String Photo1="[{\"created_time\":\"2018-11-28T23:00:16+0000\",\"id\":\"2091266917588916\"},{\"created_time\":\"2018-11-28T23:00:16+0000\",\"id\":\"2091265640922377\"},{\"created_time\":\"2016-10-24T19:04:26+0000\",\"id\":\"1304188279630121\"}]";
			
			String Photo="{\r\n" + 
					"      \"created_time\": \"2018-11-28T23:00:16+0000\",\r\n" + 
					"      \"id\": \"2091266917588916\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2018-11-28T23:00:16+0000\",\r\n" + 
					"      \"id\": \"2091265640922377\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2016-10-24T19:04:26+0000\",\r\n" + 
					"      \"id\": \"1304188279630121\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2016-10-03T18:44:10+0000\",\r\n" + 
					"      \"id\": \"1794642804139574\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2016-10-03T18:40:51+0000\",\r\n" + 
					"      \"id\": \"1794640467473141\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2016-09-26T13:36:54+0000\",\r\n" + 
					"      \"id\": \"1279122202136729\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2016-09-26T13:37:00+0000\",\r\n" + 
					"      \"id\": \"1279122288803387\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2016-09-26T13:33:35+0000\",\r\n" + 
					"      \"id\": \"1279118215470461\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2016-07-25T10:46:21+0000\",\r\n" + 
					"      \"id\": \"561757377359084\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2016-07-25T10:48:31+0000\",\r\n" + 
					"      \"id\": \"561757704025718\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2015-11-02T14:19:21+0000\",\r\n" + 
					"      \"name\": \"Clicca mi piace alla pagina Guerilla Crew, Tagga i tuoi amici, la foto con piu' mi piace entro il 15/11 vince l'ingresso omaggio per tutti i soggetti per il 23/12 CHRISTMAS PARTY con Mezzosangue! (concorso valido per foto con max 5 soggetti)\",\r\n" + 
					"      \"id\": \"908675465889549\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2015-05-04T12:39:57+0000\",\r\n" + 
					"      \"id\": \"818431508247279\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2014-09-30T14:30:06+0000\",\r\n" + 
					"      \"id\": \"667067780074805\"\r\n" + 
					"    },\r\n" + 
					"    {\r\n" + 
					"      \"created_time\": \"2014-09-30T14:30:04+0000\",\r\n" + 
					"      \"id\": \"667067743408142\"\r\n" + 
					"    }";

			String data = "";
			String line = "";
			try {
				InputStreamReader inR = new InputStreamReader(in);
				BufferedReader buf = new BufferedReader(inR);

				while ((line = buf.readLine()) != null) {
					data += line;
				}
			} finally {
				in.close();
			}
			System.out.println(data);
			 JSONArray obj2 = (JSONArray) JSONValue.parseWithException(Photo1); //parse JSON
			// Array
			JSONObject obj = (JSONObject) JSONValue.parseWithException(data); // parse JSON Object
			System.out.println("OK");
			String jsoninstring ="{\"created_time\": \"2018-11-28T23:00:16+0000\",\"id\": \"2091266917588916\"},{\\\"created_time\\\": \\\"2018-11-28T23:00:16+0000\\\",\\\"id\\\": \\\"2091266917588916\\\"},{\\\"created_time\\\": \\\"2018-11-28T23:00:16+0000\\\",\\\"id\\\": \\\"2091266917588916\\\"}";
			Foto pics = mapper.readValue(jsoninstring, Foto.class);
			System.out.println(pics.toString());
			System.out.println(mapper);
			String jsonout = "{\"created_time\": \"2018-11-28T23:00:16+0000\",\"id\": \"2091266917588916\"}";
			System.out.println(jsonout);
			Foto s2 =mapper.readValue(jsonout, Foto.class);
			System.out.println(s2.getCreated_time());
			Foto s3 = new ObjectMapper().readValue(jsonout, Foto.class);
			System.out.println(s3.getCreated_time() + s3.getId());
			Foto s =mapper.readValue(jsoninstring, Foto.class);
			
			
			Gson gson = new Gson();
	Metadata metadata = gson.fromJson(data, Metadata.class);
	
	System.out.println(metadata.id);
	System.out.println(metadata.id);
	System.out.println(metadata.id);
	//System.out.println(metadata.PhotosObject.pagingObject.CursorsObject);
	//String postMessage = metadata.getPhotosObject().getData().get(i).getMessage();
	//String commentMessage = metadata.getPosts().getData().get(i).getComments().getData().get(i).getMessage();
			
	
	
			// JSONObject obj1 = new JSONObject();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
