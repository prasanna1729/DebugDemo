package com.vl.debug;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    public static void main(String[] args){
        List<Point> lineCoordinates = createCordinates();
        outPutValues(lineCoordinates);
        Point p=new Point(23,34);
        removeValue(lineCoordinates,p);
        outPutValues(lineCoordinates);
        System.out.println("succesfully updated");
        System.out.println("so easy to update succesfully updated");
    }

    private static void removeValue(List<Point> lineCoordinates, Point p) {
        lineCoordinates.remove(p);
    }


    private static void outPutValues(List<Point> lineCordinates) {
        for (Point coordinate : lineCordinates) {
            System.out.println(coordinate.getX() +" x and y values are "+coordinate.getY());
        }

    }



    private static List<Point> createCordinates(){
        List<Point> l1=new ArrayList<>();
        l1.add(new Point(23,34));
        l1.add(new Point(34,45));
        l1.add(new Point(24,45));
        l1.add(new Point(64,45));
        return l1;

    }

}
