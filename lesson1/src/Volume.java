public class Volume {
    int width;
    int length;

    public static int volume (int width) {
        int v = (int) Math.pow(width, 2);
        return v;
    }

    static int volume (int width, int length) {
        int v = width * length;
        return v;
    }

    Volume(int width) {
        this.width = width;
    }

    Volume(int width, int length) {
        this(width);
        this.length = length;
    }


}

class Figure {
    public static void main(String[] args) {
        Volume cub = new Volume(10,2);
        System.out.println(Volume.volume(cub.width,cub.length));
    }
}
