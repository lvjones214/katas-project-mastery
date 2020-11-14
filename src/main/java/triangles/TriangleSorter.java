package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        int a = 0;
        int b = 0;
        int c = 0;

        if(sideA > sideB && sideA > sideC){
            c = sideA;
            b = sideB;
            a = sideC;
        } else if(sideB > sideA && sideB > sideC){
            c = sideB;
            a = sideA;
            b = sideC;
        } else {
            c = sideC;
            b = sideB;
            a = sideA;
        }
        double hypoteneuse = Math.sqrt((a*a)+(b*b));
        int longside = a + b;
        if(sideA ==  sideB  && sideB == sideC){
            return "Equilateral";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC){
            return "Isosceles";
        } else if (hypoteneuse == c) {
                return "Right";
        } else if (c < longside){
            return "Triangle";
        }
        return "Not A Triangle";
    }
}
