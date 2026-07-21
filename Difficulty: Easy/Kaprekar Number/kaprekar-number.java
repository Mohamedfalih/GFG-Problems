class Solution {
    public boolean isKaprekar(int n) {
        
        int org = n;
		int nSqr = n*n;
		int divides =1;
		
		while(n!=0) {
			n /= 10;
			divides *= 10;
		}
		 
		int remainder = nSqr%divides;
		int quotient = nSqr/divides;
		if(remainder == 0 ) {
			return false;
		}
		return( quotient+remainder == org);
    }
};