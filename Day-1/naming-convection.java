public class DirtyCodeExample {
public class void main(String[] args){
    int[] x = {0,-1,2,1};
    int[] y = {-2,3,8,1};
    int cnt =0;
    for(int i=0;i<4;i++){
        if(Math.sqrt(x[i]*x[i] + y[i]*y[i]) < 3.0){
            cnt++;
        }
    }
    System.out.println(cnt);
}
}


public class CleanCodeExample {
    private static final double Distance_Threshold = 3.0;
    public static void main(String[] args){
        List<Point> points = new ArrayList<Point>();
        points.add(new Point(x:0, y:-2));
        points.add(new Point(x:-1, y:3));
        points.add(new Point(x:2, y:0));
        points.add(new Point(x:1, y:1));
        int countOfPointsCloserThanThreshold = 0;
        for(int i=0;i<points.size();i++){
            int x = points.get(i).x, y= points.get(i).y;
            double distanceFromOrigin= Math.sqrt(x*x + y*y);
            if(distanceFromOrigin < Distance_Threshold)
               countOfPointsCloserThanThreshold++;
        }
        System.out.println(countOfPointsCloserThanThreshold);
    }
    public static class Point{
        public int x;
        public int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}

// Naming must be descriptive