package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        double c = 0;
        if(sideA ==  sideB  && sideB == sideC){
            return "Equilateral";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC){
            return "Isosceles";
        } else if (sideC > sideB && sideC > sideA){
            c = Math.sqrt((sideA*sideA)+(sideB*sideB));
            if(c == sideC){
                return "Right";
            }
        }
        return "";
    }
}
