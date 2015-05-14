+public class Solution {
+    public int reverse(int x) {
+    //checking whether input is bigger or smaller than the int boundary. if it is return 0
+    if(x>=Integer.MAX_VALUE||x<=Integer.MIN_VALUE)
+    {
+        return 0;
+    }
+    else
+    {
+        //check whether the input is negative, if it is, then change to positive
+        boolean isNegative = x<0;
+        if(isNegative == true)
+        {
+             x*=-1;
+        }
+    
+            int output=0;
+            int digit = (int)(Math.log10(x));
+        
+        //reversing occuer
+        while(x!=0)
+        {
+            output += (int)(x%10)*Math.pow(10,digit);
+            //if revesred value is bigger or smaller than the int boundray return 0
+            if(output>=Integer.MAX_VALUE||output<=Integer.MIN_VALUE)
+            {
+                return 0;
+            }
+            x/=10;
+            digit--;
+        }
+    
+        //if the input is negative, convert the output into negative value
+        if(isNegative == true)
+        {
+            output*=-1;
+        }
+    
+        return output;
+    }
+}
+    
+} 
