package Questions;

public class PrintInJsonFormat {

	public static void main(String[] args) {
		String ip = "123Sandesh456Bhutada789";
		String word = ip.replaceAll("[0-9]+", " ").trim();
		System.out.println(word);
		String[] split = word.split("\\s");

		String output = String.format("{\n\"First_Name\":\"%s\",\n\"Last_Name\":\"%s\",\n}", split[0], split[1]);
		System.out.println(output);
	}

}
