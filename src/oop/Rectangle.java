package oop;

public class Rectangle {
    double width, height;
//    double height;

    double getArea(){
        return width * height;
    }

    boolean isSquare(){
//        if (width == height){
//            return true;
//        } else {
//            return false;
//        }
        return width == height;
    }
}