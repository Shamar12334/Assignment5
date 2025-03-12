import java.util.Scanner;

import static java.lang.Math.pow;

public class HashTables{
    Scanner sc = new Scanner(System.in);
     public static  int size=10;

    public static int getSize() {
        return size;
    }

    // function for inserting values into the hash table
    public int hash_insert(int [] Table,int key,String name )
    {
        int i= 0;
        int j=0;

    // do while loop to iterate while i !=m the length of the data set
        while(i!= size){
            if(name.equals("double")) {
                j = getDoubleHash(key, i);
            }else if(name.equals("linear")) {
                j = getLinearProbIndex(key, i);
            }else if(name.equals("quadratic") ) {
                j = getQuadraticProbIndex(key, i);
            }
            if(Table[j] == 0) {
                Table[j] = key;
                return j;
            }else{
                i=i+1;
            }
        }
        return -1;
    }
    // function for searching a hash table
    public int hash_search(int [] Table,int key,String name) {
        int i = 0;
        int j=0;
        // do while loop for i !m or array at j != null;
        while ( i != size) {
            if (name.equals("double")){
                j = getDoubleHash(key, i);
        } else if (name.equals("linear")){
            j = getLinearProbIndex(key, i);
         } else if(name.equals("quadratic")) {
                j = getQuadraticProbIndex(key, i);
            }
            if(Table[j] == key){
                return j;
            }
            i= i+1;
        }
        return -1;
    }
    public int getLinearProbIndex (int key,int i){
        
        return ((key % size)+i)%size;
    }
 public int getQuadraticProbIndex (int key,int  i)
 {
        return (int) (((key%size)+pow(i,2))% size);
 }
public int getDoubleHash (int key,int i)
{
    return ((key%size)+(1+(key%(size-1))))% size;
}
public void table(int [] table){
        for(int i= 0; i<size; i++)
            System.out.println("Index "+i +" "+ table[i]);
}

}
