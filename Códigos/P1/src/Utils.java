
public class Utils {
    public int[] converter (boolean[] b) {
        int[] array = new int[b.length];
        for(int i = 0; i < b.length; i++) {
            if (b[i]) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }
}
