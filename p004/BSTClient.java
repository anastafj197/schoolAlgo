import java.util.*;

public class BSTClient {
    public static final int RANGE = 1000;

    public static void main (String [] args) {
	BST<String, Integer> tree = new BSTT<String, Integer>();
	int N = Integer.parseInt(args[0]);
	Random rand = new Random();
	for (int i = 0; i < N; i++) {
	    String key = getRandKey(rand);
	    int value = getRandValue(rand);
	    tree.insert(key, value);
	}
	System.out.println(tree);
    }

    public static String getRandKey(Random rand) {
	int length = rand.nextInt(5)+1;
	String result = "";
	for (int i = 0; i < length; i++)
	    result += (char)(rand.nextInt(26) + 'a');
	return result;
    }

    public static int getRandValue(Random rand) {
	return rand.nextInt(RANGE);
    }
}
