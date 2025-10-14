public class BinaryToDecimal {
    public static void binToDec(int binNum) {
        int pow=0;
        int dec=0;
        while(binNum>0){
            int lastDig=binNum%10;
            dec=dec+(lastDig * (int)Math.pow(2,pow));
            pow++;
            binNum/=10;
            
        }
        System.out.println("Decimal number of "+binNum+ "is: " + dec);
        System.out.println();
        }
    public static void main(String[] args) {            
            binToDec(111);
        
    }
    
}