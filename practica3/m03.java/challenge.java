public class challenge {
    public static int inverseNum(int seqNum){

        int inverseNum = 0;
        while (seqNum!=0){
          int digit = seqNum % 10;
          inverseNum = inverseNum * 10 + digit;
          seqNum = seqNum / 10;
        }
        return inverseNum;
    }
    public static void main(String args[]) {
        int inverseNum=inverseNum(139);
        System.out.println(inverseNum);
    }


    public static boolean palindromeDescendant(int num){
        int candidate=num;
        boolean found=false;
        while( candidate>9 && !found){
            int inverseNum = inverseNum(num);
            if(inverseNum == candidate){
                found = true;
            }else{
              
            }
        }
        return found;
    }
    /**
     * 
     * @param args
     */
  public static void main(String[]args){
        int num=112211;
        boolean isPalindrome=palindromeDescendant(num);
        System.out.println(isPalindrome);
        
    }
}
