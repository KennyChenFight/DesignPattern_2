package creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(20, 10);
        PointCornerFactory factory = new PointCornerFactory() {
            @Override
            public Point getPoint() {
                return width -> {
                    for (int i = 0; i < width; i++) {
                        System.out.print("-");
                    }
                };
            }

            @Override
            public Corner getCorner() {
                return new Corner() {
                    @Override
                    public void leftUp() {
                        System.out.print("+");
                    }

                    @Override
                    public void rightUp() {
                        System.out.print("+");
                    }

                    @Override
                    public void leftDown() {
                        System.out.print("+");
                    }

                    @Override
                    public void rightDown() {
                        System.out.print("+");
                    }
                };
            }
        };
        rect.paint(factory);
    }
}
