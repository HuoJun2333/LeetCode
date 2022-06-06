import java.util.Random;

/**
 * @author 学徒
 * @create 2022-06-05
 * @description
 */
public class L478 {

    double r, x, y;
    Random random = new Random();

    public L478(double _r, double _x, double _y) {
        r = _r;
        x = _x;
        y = _y;
    }

    public double[] randPoint() {
        double len = Math.sqrt(random.nextDouble() * r * r), ang = random.nextDouble() * 2 * Math.PI;
        double nx = x + len * Math.cos(ang), ny = y + len * Math.sin(ang);
        return new double[]{nx, ny};
    }

}
