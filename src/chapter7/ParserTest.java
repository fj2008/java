package chapter7;

public class ParserTest {

	public static void main(String[] args) {
		Parseable parser = Parsermanager.getParser("korean");
		parser.parse("�ѱ� ������ ����ִ� ����.pdf");
		
		parser = Parsermanager.getParser("english");
		parser.parse("���������� ����ִ� ����.pdf");
	}

}
