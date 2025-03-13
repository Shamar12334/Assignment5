

public class TestHash {
    public static void main(String[] args) {
        // hash table object
        HashTables ht = new HashTables();
        // array
        int[] table = new int[ht.getSize()];

        // probing type linear
        String probingType = "linear";

        // Inserting elements using different probing methods
        System.out.println("Use of " + probingType + " probing:");

        // Inserting elements using the chosen probing method
        ht.hash_insert(table, 5, probingType);
        ht.hash_insert(table, 10, probingType);
        ht.hash_insert(table, 25, probingType);
        ht.hash_insert(table, 15, probingType);
        ht.hash_insert(table, 1, probingType);
        ht.hash_insert(table, 2, probingType);
        ht.hash_insert(table, 51, probingType);
        ht.hash_insert(table, 16, probingType);
        ht.hash_insert(table, 28, probingType);
        ht.hash_insert(table, 3, probingType);
        // Print the table after insertion
        ht.table(table);

        // Searching for a key using the chosen probing method
        int keyToSearch = 5;
        int index = ht.hash_search(table, keyToSearch, probingType);
        if (index > -1) {
            System.out.println("Key " + keyToSearch + " found at index " + index);
        } else {
            System.out.println("Key " + keyToSearch + " not found");
        }
        table = new int[ht.getSize()];

        // probing type quadratic
         probingType = "quadratic";

        // Inserting elements using different probing methods
        System.out.println("Use of " + probingType + " probing:");

        // Inserting elements using the chosen probing method
        ht.hash_insert(table, 5, probingType);
        ht.hash_insert(table, 10, probingType);
        ht.hash_insert(table, 25, probingType);
        ht.hash_insert(table, 15, probingType);
        ht.hash_insert(table, 1, probingType);
        ht.hash_insert(table, 2, probingType);
        ht.hash_insert(table, 51, probingType);
        ht.hash_insert(table, 16, probingType);
        ht.hash_insert(table, 28, probingType);
        ht.hash_insert(table, 3, probingType);
        // Print the table after insertion
        ht.table(table);

        // Searching for a key using the chosen probing method
         keyToSearch = 5;
         index = ht.hash_search(table, keyToSearch, probingType);
        if (index > -1) {
            System.out.println("Key " + keyToSearch + " found at index " + index);
        } else {
            System.out.println("Key " + keyToSearch + " not found");
        }
        table = new int[ht.getSize()];

        // probing type double
         probingType = "double";

        // Inserting elements using different probing methods
        System.out.println("Use of " + probingType + " probing:");

        // Inserting elements using the chosen probing method
        ht.hash_insert(table, 5, probingType);
        ht.hash_insert(table, 10, probingType);
        ht.hash_insert(table, 25, probingType);
        ht.hash_insert(table, 15, probingType);
        ht.hash_insert(table, 1, probingType);
        ht.hash_insert(table, 2, probingType);
        ht.hash_insert(table, 51, probingType);
        ht.hash_insert(table, 16, probingType);
        ht.hash_insert(table, 28, probingType);
        ht.hash_insert(table, 3, probingType);
        // Print the table after insertion
        ht.table(table);

        // Searching for a key using the chosen probing method
         keyToSearch = 5;
         index = ht.hash_search(table, keyToSearch, probingType);
        if (index > -1) {
            System.out.println("Key " + keyToSearch + " found at index " + index);
        } else {
            System.out.println("Key " + keyToSearch + " not found");
        }
}}
