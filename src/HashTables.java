import java.util.Scanner;

import static java.lang.Math.pow;

public class HashTables{
     public static  int size=10;

    public static int getSize() {
        return size;
    }

    // function for inserting values into the hash table
    public int hash_insert(int [] Table,int key,String name )
    {
        int i= 0;
        int j=0;

    // do while loop to iterate while i != size
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
        // do while loop for i !=size
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
    //linear probing function
    public int getLinearProbIndex (int key,int i){
        
        return ((key % size)+i)%size;
    }
    //quadratic probing function
 public int getQuadraticProbIndex (int key,int  i)
 {
        return (int) (((key%size)+pow(i,2))% size);
 }
 //double hash probing function
public int getDoubleHash (int key,int i)
{
    return ((key%size)+(1+(key%(size-1))))% size;
}
// prints table
public void table(int [] table){
        for(int i= 0; i<size; i++)
            System.out.println("Index: "+i +" "+"value: "+ table[i]);
}

}
