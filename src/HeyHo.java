public class HeyHo {
    public static void main(String[] args) {
        int yearDays[][] = new int [12] [];

        yearDays[0] = new int [31];
        yearDays[1] = new int [28];
        yearDays[2] = new int [31];
        yearDays[3] = new int [30];
        yearDays[4] = new int [31];
        yearDays[5] = new int [30];
        yearDays[6] = new int [31];
        yearDays[7] = new int [31];
        yearDays[8] = new int [30];
        yearDays[9] = new int [31];
        yearDays[10] = new int [30];
        yearDays[11] = new int [31];

        int i, j, k = 0;

        for (i = 0; i < 12; i++) {
            for (j = 0; j < yearDays[i].length; j++) {
                yearDays[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 12; i++) {
            for (j = 0; j < yearDays[i].length; j++) {
                System.out.print(yearDays[i][j] + " ");
            }
            System.out.println();
        }
    }
}