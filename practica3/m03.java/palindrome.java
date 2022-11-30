public class palindrome {
 /**
 * @param n
 * @return
 */
public static boolean isPalindrome(int n){
    int forwardNum=n;
    int reverseNum=0;
    while(forwardNum !=0){
        reverseNum = (reverseNum * 10) + (forwardNum % 10);
        forwardNum = (forwardNum / 10) ;
    }if(n<9){
        return false;
    }
    return (reverseNum == n);
 }
 public static int sumOf2Num(int n){
  return 0;
 }
/**
 * @param args
 */
public static void main (String args []){
    int n =23336014;
    boolean isPal = isPalindrome(n);
    System.out.println(isPalindrome(n));
    System.out.println( sumOf2Num(n));



}
}

/*(11211230, Result=false)]
		[TestCase(13001120, Result=true)]
		[TestCase(23336014, Result=true)]
		[TestCase(11, Result=true)]
		[TestCase(1122, Result=false)]
		[TestCase(332233, Result=true)]
		[TestCase(10210112, Result=true)]
		[TestCase(9735, Result=false)]
		[TestCase(97358817, Result=false)] */