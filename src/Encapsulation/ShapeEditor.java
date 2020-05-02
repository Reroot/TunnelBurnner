package Encapsulation;


//Principles
//Open - Close
//Open for extension but closed for modifications
//The design and writing of the code should be done in a way that new functionality should be added with minimum changes in the existing code. The design should be done in a way to allow the adding of new functionality as new classes, keeping as much as possible existing code unchanged.
//Example
//class ShapeEditor{
//    void drawShape(Shape s){
//        if (s.m_type==1)
//             drawRectangle(s);
//         else if (s.m_type==2)
//             drawCircle(s);
//     };
//    void drawRectangle(Shape s);
//    void drawCircle(Shape s);
//}
class Shape{}
class Rectangle extends Shape{}
class Circle extends Shape{}

//---> Every time if new shape added, we have to modify method in the editor class, which violates this rule!
// ---> change!!! write draw method in each shape concreted class
//class Shape{ abstract void draw(); }
//class Rectangle extends Shape{ public void draw() { /*draw the rectangle*/} }
//class Circle extends Shape{ public void draw() { /*draw the circle*/} }
//class ShapeEditor{
//    void drawShape(Shape s){ s.draw(); }
//    }
