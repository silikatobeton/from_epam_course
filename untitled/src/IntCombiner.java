@FunctionalInterface
interface IntCombiner {
    int  combine(int a, int b);
    default int zalupa(int a, int b){
       return a*b;
    }
}
