package DemoTest;

import com.google.genai.Client;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
public class GenerateTextFromTextInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
			Client client = Client.builder()
					.apiKey("AIzaSyA59epP2kUi7rVvcrEYQc5smfzK5sOCWhY")
					.build();

			GenerateContentResponse response =
					client.models.generateContent(
							"gemini-3-flash-preview",
							"Explain how AI works in a few words",
							null);

			System.out.println(response.text());

		} catch (Exception e) {
			System.out.println("Error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
