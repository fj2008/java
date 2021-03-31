package chapter7;

public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = Parsermanager.getParser("korean");
		parser.parse("한글 파일이 들어있는 파일.pdf");
		
		parser = Parsermanager.getParser("english");
		parser.parse("영어파일이 들어있는 파일.pdf");
	}

}
