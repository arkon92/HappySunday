private class Main implements Comparator<Point>
    {
        public int compare(Point p1, Point p2) {
            double slope1 = slopeTo(p1);
            double slope2 = slopeTo(p2);

		// Add comment ti create conflict

            if (slope1 < slope2) return -1;
            if (slope2 < slope1) return 1;
            return 0;
        }
