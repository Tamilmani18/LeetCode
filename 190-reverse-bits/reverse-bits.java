
public class Solution {
    // you need treat n as an unsigned value
    
    public int reverseBits(int n) {
        
        int reverse = 0;
        
        for ( int i = 1; i <= 32; i++ ) {
            
            reverse = reverse << 1;
            
            reverse = reverse | ( 1 & n );
            
            n = n >> 1;
        
        }
        
        return reverse;
    }  
}

/*

n = 0011100

output = 0011100

integer takes 32 bits

we are taking a variable which is reverse and initialize with 0 to store reverse bits,
first taking a right most bit in the integer and performing and (&) operation with 1 to get same number,
and add it to reverse using | (or) operation,
then left shift reverse by one position 
and then right shift the interger n by one position right to remove reverse bit which is added to reverse variable. 

*/
