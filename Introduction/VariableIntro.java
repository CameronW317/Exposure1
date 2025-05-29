package Introduction;

public class VariableIntro {
    public static void main(String[] args) {
        System.out.println("Lab03, 80 Point Version\n");

        int seconds = 10000;
        int hours = seconds / 3600;


        System.out.println("Starting seconds: \t" + seconds);
        System.out.println("Hours: \t\t\t\t" + hours);
        seconds = seconds % 3600;
        seconds = seconds / 60;
        System.out.println("Minutes: \t\t\t" + seconds);
        seconds = 2800;
        seconds = seconds % 60;
        System.out.println("Seconds: \t\t\t" + seconds);

    }
}
