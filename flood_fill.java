public class flood_fill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int origColor = image[sr][sc];
        if (origColor == newColor)
            return image;
        
        image[sr][sc] = newColor;

        if (sc+1 < image[0].length && image[sr][sc+1] == origColor) // right
            floodFill(image, sr, sc+1, newColor);
        if (sc-1 >= 0 && image[sr][sc-1] == origColor) // left
            floodFill(image, sr, sc-1, newColor);
        if (sr+1 < image.length && image[sr+1][sc] == origColor) // down
            floodFill(image, sr+1, sc, newColor);
        if (sr-1 >= 0 && image[sr-1][sc] == origColor) // up
            floodFill(image, sr-1, sc, newColor);
        return image;
    }
}
