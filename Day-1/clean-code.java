public class Dirty {
    public static void main(String[] args){
        int[] nums = new int[]{5,3,7,9,12,4,7};
        int c1 = 0, c2=0; // bad naming
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1){
                if((nums[i]+nums[i+1])%3 == 0) // many level of indentations
                  c1++;
                if((nums[i]+nums[i+1])%5 ==0)// no modularity , violates dry principle
                 c2++;
            }
        }
        System.pot.println(c1 + " " + c2);
    }
}



public class Clean {
    public static boolean isSumDivisibleByVal(int sum, int val){
        return sum % val == 0;

    }
    public static void main(String[] args){
        int[] nums = new int[]{5,3,7,9,12,4,7};
        int[] divisors = new int[]{3,5};
        int[] countOfDivisibleAdjPairs = new int[]{0, 0};
        for(int i=0;i<nums.length-1;i++){
            int adjPairSum = nums[i] + nums[i+1];
            for(int j=0;j<divisors.length;j++){
                if(isSumDivisibleByVal(adjPairSum, divisors[j]))
                   countOfDivisibleAdjPairs[j]++;
            }
        }
        System.out.println(countOfDivisibleAdjPairs[0]+ " "+countOfDivisibleAdjPairs[1]);
    }
}


//dry means -> do not repeate yourself , so a codewhich is non  modular automatically violet dry principal, do not repeate any line of code do it just once.

// when you write clean code where you not tempered the logic  part again and again only data part is tempered .
// always make modular fxn (for example one fxn have one fxnality like that)