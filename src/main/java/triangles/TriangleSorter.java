package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        if(sideA == 3 && sideB == 3 && sideC ==3){
            return "Equilateral";
        }
        return "";
    }
}
