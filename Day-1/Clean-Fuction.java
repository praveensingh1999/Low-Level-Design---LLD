// clean fxn

public static void printAdjacentCoPrimesWithSameParity(int[] nums, boolean changeToAbsoluteVal){
    for(int i=0;i<nums.length-1;i++){
        if(changeToAbsoluteVal){
            nums[i]= Math.abs(nums[i]);
            nums[i+1]=Math.abs(nums[i+1]);
        }
        int maxm = Math.max(nums[i],nums[i+1]), minm = Math.min(nums[i], nums[i+1]);
        while(maxm % minm !=0 ){
            int temp = minm;
            minm = maxm % minm;
            maxm = temp;
        }
        if(minm == 1){
            if(((nums[i] & 1)^(nums[i+1])&1)) == 0)
              System.out.println(nums[i]+" "+nums[i+1]);
        }
    }
}
public static void main(String[] args){
    int[] nums = new int[] {2,1,3,4,5,7,9};
    printAdjacentCoPrimesWithSameParity(nums, changeToAbsoluteVal true);
}


//clean fxn code

public static boolean areCoPrimes(int x, int y){
    return getGCD(x,y) ==1;
}
public static void changeElementsAbsoluteVal(int[] nums){
    for(int ii=0;i<nums.length;i++){
        nums[i] = Math.abs(nums[i]);
    }
}
public static void printAdjacentCoPrimesWithSameParity(int[] nums, boolean changeToAbsoluteVal){
    if(changeToAbsoluteVal){
        changeElementsAbsoluteVal(nums);
    }
    for(int i=0;i<nums.length-1;i++){
        boolean isAdjacentPairCoPrime = areCoPrimes(nums[i], nums[i+1]);
        if(isAdjacentPairCoPrime && isParitySame(nums[i],nums[i+1])){
            printPair(nums[i], nums[i+1]);
        }
    }
}
public static void main(String[] args){
    int[] nums = new int[]{2,1,3,4,5,7,9};
    printAdjacentCoPrimesWithSameParity(nums, changeToAbsoluteVal: true);
}


// =========================================================

public class clean Function {

    public static boolean isParitySame(int x, int y){
        return ((x&1)^(y&1)) ==0;
    }
    public static int getGCD(int x, int y){
        int maximum = Math.max(x,y), minimum = Math.min(x,y);
        while(maximum % minimum != 0){
            int temp = minimum;
            minimum = maximum % minimum;
            maximum = temp;
        }
        return minimum;
    }
    public static  void printPair(int x, int y){
        System.out.println(x+"is co-prime with "+y);
    }
    public static boolean isParitySame(int x, int y){
        return ((x & 1)^(y&1))==0;
    }
    public static int getGCD(int x, int y){
        int maximum = math.max(x,y), minimum = Math.min(x,y);
        while(maximum % minimum !=0){
            int temp = minimum;
            minimum = maximum % minimum;
            maximum = temp;
        }
        return minimum;
    }
}


// drawback (in a bad fxn)
// to many lines, does too many things
 //  - tranforms Array
  // - find gcd 
  //- check parity 
  //- print in a certain format
  // do only one things & do it absolutly correct

// a fxn does exactly one thing if eitherr of these hold one can't meaningfully extract any other fxn from it.
// all lines are just 1 level of abstract below below the fxn level
