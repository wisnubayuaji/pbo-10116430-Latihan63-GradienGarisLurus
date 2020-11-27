/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */
public class Koordinat implements GarisLurus {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Koordinat(int x1, int y1, int x2, int y2) {
     
    }

    public int getX1() {
        return x1;
        
    }

    public int getY1() {
        return y1;
        
    }

    public int getX2() {
        return x2;
        
    }

    public int getY2() {
        return y2;
        
    }

    @Override
    public int hitungGradien() {
        int gradien = 0;

        x1 = 2;
        y1 = 10;
        x2 = 5;
        y2 = 7;
        System.out.println("Garis yang melalui titik " + "(" + x1 + "," + y1 + ")" + 
            " dan " + "(" + x2 + "," + y2 + ")");
        int gradien1 = (y2 - y1) / (x2 - x1);
        System.out.println("memiliki gradien sebesar " + gradien1 + "\n");

        x1 = 5;
        y1 = 1;
        x2 = 3;
        y2 = 12;
        System.out
                .println("Garis yang melalui titik " + "(" + x1 + "," + y1 + ")" + " dan " + "(" + x2 + "," + y2 + ")");
        int gradien2 = (y2 - y1) / (x2 - x1);
        System.out.println("memiliki gradien sebesar " + gradien2 + "\n");

        return gradien;
    }

}
