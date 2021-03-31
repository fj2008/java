package chapter7;

public class Parsermanager {
	public static Parseable getParser(String type) {
		if (type.equals("korean")) {
			return new KoreanPatser();
		}else {
			return new EnglishPatser();
		}
	}
}
