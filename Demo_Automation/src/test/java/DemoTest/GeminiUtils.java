package DemoTest;
import okhttp3.*;
import org.json.JSONObject;
public class GeminiUtils {

	public static String getResponse(String prompt) {
		try {


			String apiKey = System.getenv("AIzaSyA59epP2kUi7rVvcrEYQc5smfzK5sOCWhY");

			OkHttpClient client = new OkHttpClient();

			String json = "{\n" +
					"  \"contents\": [{\n" +
					"    \"parts\": [{\"text\": \"" + prompt + "\"}]\n" +
					"  }]\n" +
					"}";

			RequestBody body = RequestBody.create(
					json, MediaType.parse("application/json"));

			Request request = new Request.Builder()
					.url("https://generativelanguage.googleapis.com/v1/models/gemini-1.5-flash:generateContent?key=" + apiKey)
					.post(body)
					.build();

			Response response = client.newCall(request).execute();

			String responseBody = response.body().string();

			System.out.println("FULL RESPONSE: " + responseBody);

			JSONObject obj = new JSONObject(responseBody);

			if (obj.has("candidates")) {
				return obj.getJSONArray("candidates")
						.getJSONObject(0)
						.getJSONObject("content")
						.getJSONArray("parts")
						.getJSONObject(0)
						.getString("text");
			} else {
				System.out.println("ERROR RESPONSE: " + responseBody);
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}}}