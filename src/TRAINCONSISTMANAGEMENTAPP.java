import java.util.*;

public class TRAINCONSISTMANAGEMENTAPP {

    public static boolean binarySearch(String[] bogieIds, String key) {
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) return true;
            else if (result < 0) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }

    public static boolean searchBogie(String[] bogieIds, String key) {
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }
        Arrays.sort(bogieIds);
        return binarySearch(bogieIds, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogieIds, key);
            if (found) System.out.println("FOUND");
            else System.out.println("NOT FOUND");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}