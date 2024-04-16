import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int n = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (scanner.hasNextInt()){
            if (n % 2 != 0){
                arrayList.add(scanner.nextInt());
            }
            else scanner.next();
            n++;
        }

        for (int i = arrayList.size() - 1; i >= 0 ; i-- ) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}