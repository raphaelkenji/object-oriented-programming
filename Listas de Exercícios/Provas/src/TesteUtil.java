public class TesteUtil {
    public static void main(String[] args) {
        Utils utils = new Utils();
        boolean[] b = {true, true, false, true, false};
        for (boolean x : b) {
            System.out.print(x);
        }
        int[] convert = utils.converter(b);
        for (int i : convert) {
            System.out.print(i);
        }
    }

}
