package AdventCalendar;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        
    // This section gets the information from the input file and adds it to a list of integers
        List<Integer> input = new ArrayList<Integer>();
        String s ="";
        File inputFile = new File("E:\\IdeaProjects\\AdventDayOne\\src\\AdventCalendar\\input.txt");
        Scanner scan;
        try {
            scan = new Scanner(inputFile);
            while(scan.hasNext()) {
                s = scan.nextLine();
                input.add(Integer.valueOf(s));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        int total = 0;

        System.out.println(compare(input));
    }

    public static int compare(List<Integer> input) {
        int total = 0, i = 0;
        while(i< input.size()-1) {

            if(input.get(i) < input.get(i+1)) {
                total++;
            }

            i++;
        }
        return total;
    }
}