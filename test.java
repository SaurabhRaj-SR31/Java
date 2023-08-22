class Box {
    int width;
    int height;
    int depth;

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(int len) {
        width = height = depth = len;
    }

    Box(Box o) {
        width = o.width;
        height = o.height;
        depth = o.depth;

    }

    double volume() {
        return width * height * depth;
    }
}

class test {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);
        double vol;
        vol = myclone.volume();
        System.out.println("Volume of mybox1 is " + vol);
    }
}
