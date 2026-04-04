package DemoTest;

public class TestGemnai {
	 public static void main(String[] args) {
	  String result = GeminiUtils.getResponse("Write 100 word easy on automobil");
      System.out.println("AI Response: " + result);
}
}