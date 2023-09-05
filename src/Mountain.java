public class Mountain {
    public static boolean isIncreasing(int[] array, int stop) {
        if(stop > array.length) return false;
        for(int i = 0; i < stop; i++) {
            if(!(array[i] < array[i+1])) return false;
        }
        return true;
    }
    public static boolean isDecreasing(int[] array, int start) {
        if(start < 0) return false;
        for(int i = array.length-1; i > start; i--) {
            if(!(array[i] < array[i-1])) return false;
        }
        return true;
    }
    public static int getPeakIndex(int[] array) {
        for(int i = 1; i < array.length-1; i++) {
            if(array[i] > array[i-1] && array[i] > array[i+1]) return i;
        }
        return -1;
    }
    public static boolean isMountain(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(isIncreasing(array, i) && isDecreasing(array, i) && i == getPeakIndex(array)) return true;
        }
        return false;
    }
}
