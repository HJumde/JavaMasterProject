package com.algorithms;

public class PolindromSeries {

    public boolean isPlolindromString(String str) {

        int start = 0;
        int end = str.length() - 1;
         if(end!=start){

            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        } else{
             return true;
         }

    }

    public boolean isPlolindromNumber(int num) {
   int reverseNum=0;
   int orginalNum=num;
   while(num!=0){
   int reaminder=num%10;

   reverseNum=reverseNum*10+reaminder;

   num=num/10;

}

return reverseNum==orginalNum?true:false;

    }
}
