package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        double hypoteneuse = Math.sqrt((sideA*sideA)+(sideB*sideB));
        int longside = sideA + sideB;
        if(sideA ==  sideB  && sideB == sideC){
            return "Equilateral";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC){
            return "Isosceles";
        } else if (hypoteneuse == sideC) {
                return "Right";
        } else if (sideC < longside){
            return "Triangle";
        }
        return "";
    }
}
