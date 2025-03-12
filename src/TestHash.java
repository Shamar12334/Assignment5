import java.util.Scanner;

public class TestHash {
    public static void main(String[] args) {
        HashTables ht = new HashTables();

        // Create a table of size SIZE
        int[] table = new int[ht.getSize()];

        // Ask for probing type once
        System.out.println("yo mom 0");

        Scanner sc = new Scanner(System.in);
        System.out.println("yo mom 1");
        System.out.println("Enter the type of probing: (linear, quadratic, or double)");
        System.out.println("yo mom 2");

        String probingType = sc.next();
        System.out.println("yo mom 3");

// Get probing type from user

        // Inserting elements using different probing methods
        System.out.println("Inserting elements using " + probingType + " probing:");

        // Inserting elements using the chosen probing method
        ht.hash_insert(table, 5, probingType);
        ht.hash_insert(table, 15, probingType);  // Collision with key 5, will use probing
        ht.hash_insert(table, 25, probingType);  // Collision with keys 5 and 15, will use probing

        // Print the table after insertion
        System.out.println("\nTable after " + probingType + " Probing Insertion:");
        ht.table(table);

        // Searching for a key using the chosen probing method
        int keyToSearch = 15;
        int index = ht.hash_search(table, keyToSearch, probingType);
        if (index != -1) {
            System.out.println("Key " + keyToSearch + " found at index " + index);
        } else {
            System.out.println("Key " + keyToSearch + " not found");
        }

        // Reset table and insert using the same probing method
        table = new int[ht.getSize()];
        System.out.println("\nInserting elements using " + probingType + " probing again:");
        ht.hash_insert(table, 5, probingType);
        ht.hash_insert(table, 15, probingType);  // Collision with key 5, uses probing
        ht.hash_insert(table, 25, probingType);  // Collision with keys 5 and 15, uses probing

        // Print the table after insertion
        System.out.println("\nTable after " + probingType + " Probing Insertion again:");
        ht.table(table);

        // Searching for a key using the same probing method
        keyToSearch = 25;
        index = ht.hash_search(table, keyToSearch, probingType);
        if (index != -1) {
            System.out.println("Key " + keyToSearch + " found at index " + index);
        } else {
            System.out.println("Key " + keyToSearch + " not found");
        }
    }
}
