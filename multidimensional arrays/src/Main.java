public class Main {

    public static void main(String[] args) {

        String[][] countries = new String[3][3];
        String[] continents = {"Asia", "Europe", "Africa"};

        countries[0][0] = "china";
        countries[0][1] = "russia";
        countries[0][2] = "india";
        countries[1][0] = "sweden";
        countries[1][2] = "germany";
        countries[1][2] = "france";
        countries[2][0] = "egypt";
        countries[2][1] = "morocco";
        countries[2][2] = "libya";

        for (int i = 0; i < 3; i++) {   //nested loop
            System.out.print(continents[i] + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(countries[i][j] + ", ");
            }
            System.out.println();

        }
    }
}
