// package Interfaces;

// interface Figure {
// // double a;
// // double b;

// double area();
// }

// class Rectangle implements Figure {
// Rectangle(double i, double j) {
// a = i;
// b = j;
// }

// Rectangle(double i) {
// a = b = i;
// }

// double area() {
// return a * b;
// }
// }

// class RightTriangle implements Figure {
// RightTriangle(double i, double j) {
// a = i;
// b = j;
// }

// RightTriangle(double i) {
// System.out.println("Not enough dimensions");
// }

// double area() {
// return a * b / 2;
// }
// }

// public class InterfaceFig_Ex1 {
// public static void main(String[] args) {
// Rectangle myRect1 = new Rectangle(10, 20);
// Rectangle myRect2 = new Rectangle(10);

// RightTriangle t1 = new RightTriangle(10, 15);
// RightTriangle t2 = new RightTriangle(10);

// System.out.println("Area of myRect1: " + myRect1.area());
// System.out.println("Area of myRect2: " + myRect2.area());
// System.out.println("Area of t1: " + t1.area());
// System.out.println("Area of t2: " + t2.area());
// }
// }
