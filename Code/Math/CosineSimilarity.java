import java.util.*;
class CosineSimilarity {
    static class Vector {
        int start;
        int end; 
        Vector(int start, int end) {
            this.start = start; 
            this.end = end; 
        }
    }

    private double computeCos(Vector one, Vector other){
        double dotProd = one.start * other.start + one.end * other.end; 
        double valOne = Math.sqrt(one.start * one.start + one.end * one.end);
        double valOther = Math.sqrt(other.start * other.start + other.end * other.end);
        double cos = dotProd / (valOne * valOther); 
        if (cos < - 1 && cos > -2) cos = -1; 
        if (cos > 1 && cos < 2) cos = 1; 
        double angle = Math.acos(cos) * 180 / Math.PI;
        return angle;
    }
    public static void main(String[] args) {
        CosineSimilarity similary = new CosineSimilarity(); 
        CosineSimilarity.Vector v1 = new CosineSimilarity.Vector(-1, 0);  
        CosineSimilarity.Vector v2 = new CosineSimilarity.Vector(1, 0);
        System.out.println(similary.computeCos(v1, v2)); 
    }
}