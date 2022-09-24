public class Main {
    public static void main(String[] args) {
        int[][] marks = new int[4][3];
        marks[0][0]=10;
        marks[0][1]=12;
        marks[0][2]=marks[0][0]+marks[0][1];

        marks[1][0]=16;
        marks[1][1]=marks[0][2]+marks[1][0];
        marks[1][2]=20;

        marks[2][0]=22;
        marks[2][1]=24;
        marks[2][2]=marks[0][0]+marks[0][0];

        marks[3][0]=28;
        marks[3][1]=30;
        marks[3][2]=32;
        System.out.println("The first output is " + marks[1][1]);
        System.out.println("The second output is " + marks[3][2]);
    }
}