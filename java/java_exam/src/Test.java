import java.util.function.BiFunction;

public class Test {

	public void modify(int index, String content, BiFunction<Integer, String, Boolean> biFunction) {
		System.out.println(biFunction.apply(index, content));
	}

	public static void main(String[] args) {
		Test test = new Test();

		test.modify(13, "asdaasdasd", (num, str) -> num > str.length());

	}

}
