public class weather {
    //calculates the average temperature
    public static double averageTemp(int[] temp) {
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        return (double) sum / temp.length;
    }

    // numbers of days above average
    public static int aboveAverage(int[] temp) {
        int count = 0;
        double avg = averageTemp(temp);
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > avg) {
                count++;
            }
        }
        return count;
    }

    // value of highest temperature
    public static int highestTemp(int[] temp) {
        int max = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        return max;
    }

    // index of lowest temperature
    public static int lowestTemp(int[] temp) {
        int min = temp[0];
        int index = 0;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] < min) {
                min = temp[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int temp[] =  {7, 45, 44, 39, 48, 37, 46, 53};
    
    }
}