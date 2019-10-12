package com.mycompany.app;

public class App{
        public static boolean method1(int[] array, int target,int a,int b){
            if(array==null || a<0 || b<0) return false;

            for(int i = 0; i< array.length; i++){
                if(array[i] == target){
                    return true;
                }
                else{
                    if(target==a+b){
                        return true;
                    }
                }

            }
            return false;
        }


}
