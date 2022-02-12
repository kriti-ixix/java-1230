class Box
{
    double height, width, depth, contents;

    Box(double height, double width, double depth)
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.contents = 0;
    }

    double percentFull()
    {
        double volume = this.depth * this.height * this.width;
        double percentage = (this.contents * 100) / volume;
        return percentage;
    }

    public String toString()
    {
        return "Height: " + this.height + " Depth: " + this.depth 
        + " Width: " + this.width;
    }
}

class TestBox
{
    public static void main(String[] args)
    {
        Box b1 = new Box(10, 10, 10);
        System.out.println(b1.toString());
        b1.contents = 500;
        System.out.println(b1.percentFull() + "%");
    }
}