import java.util.*;
public class AmicablePair {
    class Pair {
        int one; 
        int other;
        Pair (int one, int other){
            this.one  = one; 
            this.other = other; 
        }
    }

    /*
        we all know that for any number ‘num’ all its divisors are always less than and equal to ‘num/2’ 
        and all prime factors are always less than and equal to sqrt(num). So
    */
    private Set<Integer> findProperDivisor(int num) {
        Set<Integer> set = new HashSet<>(); 
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) set.add(i); 
        }
        return set; 
    }

    private Set<Integer> PrimeDivisor(int num) {
        Set<Integer> set = new HashSet<>(); 
        for (int i = 1; i <= Math.sqrt((double)num); i++) {
            if (num % i == 0) {
                set.add(num);
                //This is important
                if (i * i != num && i != 1) {
                    set.add(num/i); 
                }
            }
        }
        return set;
    } 

    public Pair findPair(int num, boolean[] visited) {
        if (visited[num]) return null;
        Set<Integer> divisors = findProperDivisor(num);
        int pair = 0;
        for (Integer aDivisor : divisors) pair += aDivisor;
        Set<Integer> pairDivisors = findProperDivisor(pair); 
        int pairSum = 0; 
        for (Integer aPairDivisor : pairDivisors) pairSum += aPairDivisor; 
        if (num == pairSum && num != pair) {
            visited[num] = true;
            visited[pair] = true;
            return new Pair(Math.min(num, pair), Math.max(num, pair));
        }
        else return null; 
    }

    public List<Pair> findPairs(int limit) {
        //find one 
        boolean[] visited  = new boolean[limit + 1]; 
        List<Pair> result = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            Pair pair = findPair(i, visited);
            if (pair != null) result.add(pair); 
        }
        return result; 
    }
    public static void main(String[] args) {
        AmicablePair amicablePair = new AmicablePair(); 
        
        List<Pair> pairs = amicablePair.findPairs(10000);
        for (Pair aPair : pairs) {
            System.out.println(aPair.one + " " + aPair.other); 
        }
    }
}