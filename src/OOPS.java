/*
 * OOPS :-
 *
 * 1. Concept of Class and Objects :- The concept of classes and objects were
 * introduced in programming languages to solve the real world problems in
 * programming.
 * We can understand this with the example of a car say Maruti 800, before
 * making this car first they might have made a blueprint and then this
 * blueprint would be given to the engineers in the factory to produce this car.
 * That means all the cars produced were according to this blueprint. So the
 * object becomes all those cars which has been produced from the factory and
 * blueprint are the class which.
 * So in programming all the real world things are objects like car, person,
 * instruments, etc. and blueprint is the instruction to make that object.
 *
 * In JAVA, we have to make a public class in every single file. Below is the
 * example of a public class OOPS and another class called Pen and this becomes
 * the blueprint of the pen which has a property called color and type. Every
 * class may also contain some methods (methods are the functions which are
 * present inside a class).
 */

// The Pen class is just a blueprint of a pen and the pen has yet to be made
// (i.e. Object is yet to be made). This object is made in our main() method.

// class Pen {
// String color;
// String type;

// public void write() {
// System.out.println("Writing something.");
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// // Syntax to create an object :- className objectName = new className();
// Pen pen1 = new Pen();

// // To use the properties of this object we use dot(.) operator.
// pen1.color = "blue";
// pen1.type = "gel";

// // To use the methods of this object we again use dot(.) operator.
// pen1.write();
// }
// }
// // This properties and methods are also known as data and members
// respectively.
/*---------------------------------------------------------------- */

// Now, if we want to print the properties of this Pen class then we have have
// to use 'this' keyword. Let create another method inside this Pen class and
// see how it works.

// class Pen {
// String color;
// String type;

// public void write() {
// System.out.println("Writing something.");
// }

// public void printColor() {
// System.out.println(this.color);
// // Here, this keyword is used to tell that which object has called this
// // property. In our case there is only one object so there is no issue but
// // when there are multiple objects then it will be useful. Lets demonstrate
// // this by creating another object too called as pen2.
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// // 1st object called pen1
// Pen pen1 = new Pen();
// pen1.color = "blue";
// pen1.type = "gel";

// // 2nd object called pen2.
// Pen pen2 = new Pen();
// pen2.color = "black";
// pen2.type = "ball point";

// // This keyword helps to identify which object has called this property. In
// // our case, first pen1 has called printColor property and then pen2 has
// called.
// pen1.printColor();
// pen2.printColor();
// }
// }
/*---------------------------------------------------------------- */

// Lets take the another e.g. of a Student class.

// class Student {
// String name;
// int age;

// public void printInfo() {
// System.out.println(this.name);
// System.out.println(this.age);
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Student s1 = new Student();

// s1.name = "Aman";
// s1.age = 24;

// s1.printInfo();
// }
// }
/*---------------------------------------------------------------- */

/*
 * To understand how it works we have to understand that whenever there is a
 * 'new' keyword with some object that means this object occupies some space in
 * heap memory and after 'new' keyword there is 'Student()' which is a special
 * type of function/method called as constructor function which helps us to
 * construct and object.
 *
 * Now, in JAVA, constructors are of three types i.e. we can create objects in
 * three ways. Before that we need to understand the three properties of a
 * constructor.
 * 1. The Class constructor or Object constructor will have the same name as
 * that of Class.
 * 2. Constructors, although are methods but it does not return anything i.e. it
 * does not have any datatype not even 'void'. It just helps to create an
 * object.
 * 3. For one object a constructor can be called only once. The normal
 * methods/functions which are without objects can be called again and again by
 * an object but constructors can be called only once that too when the object
 * is created.
 */

/*
 * 1. Non-parameterized constructors :- Those constructors which does not
 * accepts any parameters. Suppose we want to make a constructor for student
 * class then we do like below and now whenever an object is created then this
 * constructor will be called first and then the remaining code will be
 * executed. Now you might be thinking that we didn't create the constructor in
 * the beginning then also our code was executing, how? It is because if in java
 * we do not write a non-parameterized constructor then creates it by itself.
 */

// class Student {
// String name;
// int age;

// public void printInfo() {
// System.out.println(this.name);
// System.out.println(this.age);
// }

// // Creating a class constructor.
// Student() {
// System.out.println("Constructor called.");
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Student s1 = new Student();

// s1.name = "Aman";
// s1.age = 24;

// s1.printInfo();
// }
// }
/*---------------------------------------------------------------- */

// 2. Parameterized constructor :- Those constructor which accepts the
// parameters are called parameterized constructors. e.g. is shown below.

// class Student {
// String name;
// int age;

// public void printInfo() {
// System.out.println(this.name);
// System.out.println(this.age);
// }

// Student(String name, int age) {
// this.name = name;
// this.age = age;
// // Here, this.name is the 'name of the object' wheres as the name on the
// // right side is the parameter which we have passed. Similarly, this.age
// // is the object's property and age is the parameter which is passed to the
// // constructor.
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Student s1 = new Student("Om Prakash", 24);
// s1.printInfo();
// }
// }
/*---------------------------------------------------------------- */

// 3. Copy constructors :- This concept has come from C++, there by default we
// have copy constructors. But in Java we have to define it manually. e.g. is
// shown below.

// class Student {
// String name;
// int age;

// public void printInfo() {
// System.out.println(this.name);
// System.out.println(this.age);
// }

// Student(Student s2) {
// this.name = s2.name;
// this.age = s2.age;
// }
// // The above student class constructor is called as copy constructor as it is
// // copying all the details of student 2 in its current object.

// // Now, as we have defined copy constructor, we also have to define the
// // student class constructor manually because it won't be getting created by
// // default now. e.g. is shown below.
// Student() {

// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Student s1 = new Student();
// s1.name = "Om Prakash";
// s1.age = 24;

// Student s2 = new Student(s1);
// s2.printInfo();

// }
// }

// Now, if you see in the above code, we haven't defined s2 anywhere, what we
// did here is that we have assigned the property of s1 to s2 (i.e. copied s1
// properties to s2).
/*---------------------------------------------------------------- */

/*
 * As like there is balance in the world, there is balance in the Java too. That
 * means the object that has been created there should be the mechanism to
 * destroy too. So, as there are constructors, there are destructors too because
 * programmers are very smart. In C++, as we write constructor we also write
 * destructors too but in Java we don't have to write destructors as it happens
 * automatically in Java.
 *
 * In Java, we have something called garbage collector, which automatically
 * deletes the objects and variables which has been defined but is not being
 * used. So, Java is very efficient and intelligent language.
 *
 * If someone asks you how to write destructor in Java then you should be able
 * to answer now that in Java we don't write destructors as it has garbage
 * collector.
 *
 * 1. Polymorphism :- Which means many forms. It has two types.
 * i. Compile-Time polymorphism :- It is also called as "method overloading".
 * ii. Run-Time polymorphism :- It is also called as "method overriding".
 *
 * Now, we will be learning about Compile-Time polymorphism only and we will
 * learn Run-Time polymorphism when we are learning the concept of Inheritance.
 *
 * Compile-TIme polymorphism (Method overloading) :- In this we have multiple
 * functions/methods and all have the same name but does different works. e.g.
 * is shown below.
 */

// class Student {
// String name;
// int age;

// public void printInfo(String name) {
// System.out.println(name);
// }

// public void printInfo(int age) {
// System.out.println(age);
// }

// public void printInfo(String name, int age) {
// System.out.println(name + " " + age);
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Student s1 = new Student();
// s1.name = "Om Prakash";
// s1.age = 24;

// // s1.printInfo(s1.age);
// s1.printInfo(s1.name, s1.age);
// }
// }
/*---------------------------------------------------------------- */

/*
 * There are some rules to do method overloading. These are :-
 * i. All these methods should have different return types then they can have
 * same parameters.
 * ii. If return type is same then type of parameters should be different.
 * iii. If above both are same then they should have different number of
 * arguments.
 * This called compile time polymorphism because the errors are detected during
 * compilation of the program whether the polymorphism has correctly been
 * implemented or not.
 * In run-time polymorphism the compiler cannot detect the errors during
 * compilation so, it is more dangerous as the problem gets detected only during
 * execution.
 * So, while while implementing polymorphism, we should try to use compile-time
 * wherever possible rather than run-time polymorphism.
 */

/*---------------------------------------------------------------- */

// 2. Inheritance :- It simply means passing our properties and methods to our
// child. In Java, Inheritance means passing all the properties and methods of
// one class to another class. e.g. is given below.

// class Shape {
// String color;
// }

// class Triangle extends Shape {

// }
/*
 * Here, extends keyword is used. The above code means that the Triangle class
 * has taken/inherited all the properties of Shape class. That means in Triangle
 * class there will be a property present named color even if we don't define it
 * in this class. Here, from the class which we take properties and methods from
 * is called base class (Parent class), and the one who takes these properties
 * and methods is called sub-class / derived class (Child class).
 */

// public class OOPS {
// public static void main(String args[]) {
// Triangle t1 = new Triangle();
// t1.color = "red";
// }
// }
/*---------------------------------------------------------------- */

// This is how Inheritance works. And in Java there are five types of
// Inheritance. These are :-
// i. Single Level Inheritance :- It will have one base class and one derived
// class i.e. one parent class and one child class. e.g. is shown below.

// class Shape {
// String color;

// public void area() {
// System.out.println("Display area");
// }
// }

// class Triangle extends Shape {
// public void area(int l, int h) {
// System.out.println(1 / 2 * l * h);
// }
// }

// public class OOPS {
// public static void main(String args[]) {

// }
// }

// In above e.g. Shape is the base class and Triangle is the derived class which
// is taking properties and methods from Shape class. Lets consider one more
// e.g.
/*---------------------------------------------------------------- */

// ii. Multi Level Inheritance :- This has one Parent class and then one child
// class and then that child class also has one child class which becomes the
// sub-child class of the Parent class.

// class Shape {
// String color;

// public void area() {
// System.out.println("Display area");
// }
// }

// class Triangle extends Shape {
// public void area(int l, int h) {
// System.out.println(1 / 2 * l * h);
// }
// }

// class EquilateralTriangle extends Triangle {
// public void area(int l, int h) {
// System.out.println(1 / 2 * l * h);
// }
// }

// public class OOPS {
// public static void main(String args[]) {

// }
// }

// In this above e.g. The Triangle class is derived class of Shape class and
// EquilateralTriangle is the derived class of Triangle class that means there
// are two level of inheritance now.
/*---------------------------------------------------------------- */

// iii. Hierarchial Inheritance :- This has one base class (parent class) and
// many sub-classes (Child classes). e.g. is shown below.

// class Shape {
// String color;

// public void area() {
// System.out.println("Display area");
// }
// }

// class Triangle extends Shape {
// public void area(int l, int h) {
// System.out.println(1 / 2 * l * h);
// }
// }

// class Circle extends Shape {
// public void area(int r) {
// System.out.println(3.14 * r * r);
// }
// }

// public class OOPS {
// public static void main(String args[]) {

// }
// }
// Here, in above e.g. both Circle and Triangle classes are child of Shape
// class.
/*---------------------------------------------------------------- */

// iv. Hybrid Inheritance :- Here you can see different types of inheritances
// combined together. e.g. is shown below.

// class Shape {
// public void area() {
// System.out.println("Display area");
// }
// }

// class Triangle extends Shape {
// public void area(int l, int h) {
// System.out.println(1 / 2 * l * h);
// }
// }

// class Circle extends Shape {
// public void area(int r) {
// System.out.println(3.14 * r * r);
// }
// }

// class EquilateralTriangle extends Triangle {
// public void area(int l, int h) {
// System.out.println(1 / 2 * l * h);
// }
// }

// public class OOPS {
// public static void main(String args[]) {

// }
// }
/*---------------------------------------------------------------- */

// v. Multiple Inheritance :- This is not present in Java in the form of classes
// but in C++ it is there. Here in Java, it is in the form of Interfaces. Now,
// before learning Multiple Inheritance, we need to learn about Access modifiers
// and Packages.
/*---------------------------------------------------------------- */

// Packages :- Packages are containers that holds the similar/related codes to
// maintain the folder structure of the project. It is of two types, Inbuilt
// packages like util package which holds Scanner class and other similar
// utility classes and the other one is we can create packages manually.

// // Importing manually created package.
// import java.util.*;
// import bank;

// public class OOPS {
// public static void main(String args[]) {
// bank.Account account1 = new bank.Account();
// account1.name = "customer1";
// }
// }
/*---------------------------------------------------------------- */

/*
 * Access Modifiers :- This helps us to protect the data from unauthorized
 * users. These are of four types :-
 * i. Public :- If we use public in front of any method or variable then that
 * method or variable can be accessed from anywhere within the class as well as
 * other packages can also access it. The main method in our Java program should
 * always be public as it has to be accesses by compiler and JVM.
 *
 * ii. Default :- For default we don't have to mention anything in front of the
 * method, variable, parameter, etc. and these can be accesses anywhere inside
 * the package but not outside that package.
 *
 * iii. Protected :- If we use protected then any class within the package can
 * access it and only the sub-classes outside the package can access this
 * variable, method, properties.
 *
 * iv. Private :- If we use private in front of any variable or method or
 * property then only that particular class can access that variable, method,
 * property and no-one outside that class can access it not even our Main class
 * or package can access.
 * The question arises that, how do we access the private variables, methods,
 * properties, parameters?
 * The answer is that we have to use getter() and setter() methods.
 */
/*---------------------------------------------------------------- */

/*
 * 3. Encapsulation :- Now, whatever we studied above till now is only known as
 * encapsulation and the code for that is given below.
 * Basically, encapsulation in Java means combining data (i.e. properties of the
 * class) and its methods (functions of that class) together i.e. forming a
 * class to bind these together. With the help of Encapsulation the process of
 * "Data Hiding" becomes possible.
 *
 * Data Hiding means hiding the sensitive data which you don't want users to
 * see. And this concept is implemented by the help of access modifiers.
 */

// package bank;

// class Account {
// public String name;
// protected String email;
// private String password;
// }

// public class Bank {
// public static void main(String args[]) {
// Account account1 = new Account();
// account1.name = "KGiSL";
// account1.email = "omchaurasia@gmail.com";
// account1.password = "abcd";
// }
// }
/*---------------------------------------------------------------- */

// To access the private variable we use getter and setter methods.

// package bank;

// class Account {
// public String name;
// protected String email;
// private String password;

// // getters and setters

// // getter
// public String getPassword() {
// return this.password;
// }

// // setter
// public void setPassword(String password) {
// this.password = password;
// }
// }

// public class Bank {
// public static void main(String args[]) {
// Account account1 = new Account();
// account1.name = "KGiSL";
// account1.email = "omchaurasia@gmail.com";
// account1.setPassword("abcd");
// System.out.println(account1.getPassword());
// }
// }
/*---------------------------------------------------------------- */

// If we don't want to give options to the user to set password and the default
// password will be set then we can make the setter() method as private or we
// can remove it. Lets see how to do this.

// package bank;

// class Account {
// public String name;
// protected String email;
// private String password;

// // getters and setters

// // getter
// public String getPassword() {
// setPassword(randomPassword);
// return this.password;
// }

// // setter
// private void setPassword(String password) {
// this.password = password;
// }
// }

// public class Bank {
// public static void main(String args[]) {
// Account account1 = new Account();
// account1.name = "KGiSL";
// account1.email = "omchaurasia@gmail.com";
// account1.setPassword("abcd");
// System.out.println(account1.getPassword());
// }
// }

// Now, why to make this setter as private? Because we don't want other classes
// to access this password options outside the Account's class.

/*---------------------------------------------------------------- */

/*
 * 4. Abstraction :- This is the 4th pillar of OOPS which helps us to show the
 * important data to the users where as hide the unnecessary data. Student
 * often gets confused with Data hiding and Abstraction, we'll discuss about it
 * in detail to see what is the difference between these two.
 * In Java, abstraction can be implemented in two ways.
 * i. Using the Abstract keyword and make Abstract class. Lets see the e.g.
 * below.
 */

// abstract class Animal {
// abstract public void walk();
// }

// class Horse extends Animal {
// public void walk() {
// System.out.println("Walks on 4 legs");
// }
// }

// class Chicken extends Animal {
// public void walk() {
// System.out.println("Walks on 2 legs");
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Horse horse = new Horse();
// horse.walk();
// }
// }
/*---------------------------------------------------------------- */

/*
 * Now, here in the above example it is good to display Horse and Chicken as
 * these are animals but displaying actual Animal class is irrelevant as no
 * actual Animal is present there but we are just using its properties and
 * methods defined there, so, we hide this Animal class and this is known as
 * Abstraction. Here, the actual animals are Horse and Chicken and Animal is
 * just an imaginary blueprint for this Horse and Chicken that's why we made it
 * as abstract class using abstract keyword.
 * Apart from this we can also set properties and methods also to be abstract.
 * Now, while creating method as abstract, we don't have to use the method body,
 * we can directly close the function as shown above.
 */

// abstract class Animal {
// abstract public void walk();
// }

// class Horse extends Animal {
// public void walk() {
// System.out.println("Walks on 4 legs");
// }
// }

// class Chicken extends Animal {
// public void walk() {
// System.out.println("Walks on 2 legs");
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Horse horse = new Horse();
// horse.walk();

/*
 * Now, if we create an Animal object then it will throw an error saying
 * "cannot instantiate the type Animal" as we have made it abstract class and
 * abstract classes are just the concept not a real time class. And the error
 * that we faced here is called run-time error as you may not be able to see
 * error during compilation.
 */

// Animal animal = new Animal();
// animal.walk();
// }
// }
/*---------------------------------------------------------------- */

/*
 * There are some properties of Abstract class :-
 * i. An Abstract class must be declared with an abstract keyword.
 * ii. It can have abstract and non-abstract methods.
 * iii. It cannot be instantiated (meaning cannot be initiated).
 * iv. It can have constructor and static method also.
 * v. It can have final method which will force the subclass not to change the
 * body of the method.
 * vi. Abstract method body is not present in the parent class.
 */

// abstract class Animal {
// abstract public void walk();

// // Creating a class constructor.
// Animal() {
// System.out.println("You are creating a new Animal.");
// }

// public void eats() {
// System.out.println("Animal eats");
// }
// }

// class Horse extends Animal {
// Horse() {
// System.out.println("Created a horse constructor.");
// }

// public void walk() {
// System.out.println("Walks on 4 legs");
// }
// }

// class Chicken extends Animal {
// public void walk() {
// System.out.println("Walks on 2 legs");
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Horse horse = new Horse();
// // horse.walk();
// // horse.eats();
// }
// }

// The output of the above code shows that 1st base class constructor is called
// and then derived class constructor is called. This concept in Java is called
// constructor chaining.
/*---------------------------------------------------------------- */

/*
 * ii. Using Interfaces :- This is called pure abstraction as it hides all the
 * useless information. In previous method of abstract class not all the useless
 * information were hidden as not all the classes were abstract.
 * Interfaces are just like class but they have some fixed properties. We define
 * Interface using interface keyword. e.g. is shown below.
 */

// interface Animal {
// public void walk();

// // Interfaces cannot have constructors. If you try to make one then it will
// // throw error as shown below.
// // Animal() {

// // }

// // It also does not support not abstract methods nor we can have any
// // implementation of the method. If you try to make one then it will throw
// // error as shown below.
// // void eat() {

// // }
// }

// // We do not extend the interfaces but we implement it by using implements
// // keyword.

// class Horse implements Animal {
// // Now we again have to implement the method here which we have defined in
// // the interface Animal as shown below. Above we have just defined not
// // implemented.

// public void walk() {
// System.out.println("Walks on 4 legs");
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Horse horse = new Horse();
// horse.walk();
// }
// }
/*---------------------------------------------------------------- */

/*
 * Now, there are some properties of Interfaces too.
 * i. All the fields in interfaces are public, static and final by default.
 * ii. All methods are public and abstract by default.
 * iii. A class that implements an interface must implement all the methods
 * declared in the interface.
 * iv. Interfaces support the functionality of multiple inheritance.
 */

// interface Animal {
// int eyes = 2; // this is by default public, static and finally (meaning it
// // can be accessed by any class and its value is fixed).

// public void walk(); // even if we remove public from here then also by
// // default it is public only.
// }

// class Horse implements Animal {
// public void walk() { // but when we write here then public keyword is
// // mandatory because if we don't write public then by default the access
// // modifier will be of default type as it is a class
// System.out.println("Walks on 4 legs");
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Horse horse = new Horse();
// horse.walk();
// }
// }
/*---------------------------------------------------------------- */

/*
 * Multiple Inheritance :- It is not possible in Java by using class so we use
 * Interface. Multiple interface has two or more base class and one or more
 * derived classes which is shown below in e.g. using interface.
 */

// interface Animal {
// int eyes = 2;

// void walk();
// }

// interface Herbivore {

// }

/*
 * Here, we can implement both animal class as well as herbivore class as Horse
 * is an animal as well as herbivore too so this horse class can take properties
 * and methods from both animal and herbivore classes.
 */
// class Horse implements Animal, Herbivore {
// public void walk() {
// System.out.println("Walks on 4 legs.");
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Horse horse = new Horse();
// horse.walk();
// }
// }
/*---------------------------------------------------------------- */

/*
 * Static keyword meaning :- Static in Java means it is accessible by everyone
 * but not like public. We say static to those properties or methods which is
 * common for the classes. e.g. is shown below.
 */

// class Student {
// String name;
// static String school; // since school is common for all the student so we
// // have used static keyword.
// // So, as soon as we use static keyword then no matter how many objects we
// // create for all the school will be common.
// }

// public class OOPS {
// public static void main(String args[]) {
// // Anything which is static can be accessed by className as shown below. For
// // these we don't have to create Objects as these are the part of class not
// // the direct part of object. For objects the things which we declare inside
// // the Object are its direct part.
// Student.school = "KGiSL";

// Student student1 = new Student();
// student1.name = "Om Prakash";
// System.out.println(student1.school);

// // Here, if we change the name of the school then it will get changed for all
// // the students.
// }
// }
/*---------------------------------------------------------------- */

// Similarly, we can make the methods also as static. Lets see how,

// class Student {
// String name;
// static String school;

// public static void changeSchool() {
// school = "newschool";
// }
// }

// public class OOPS {
// public static void main(String args[]) {
// Student.school = "KGiSL";

// Student student1 = new Student();
// student1.name = "Om Prakash";
// System.out.println(student1.school);
// }
// }
/*---------------------------------------------------------------- */

/*
 * Now, we can use static keywords in four ways i.e. We can use it in front of
 * some properties or in front of some methods or in front of some block or
 * in front of some nested classes.
 * Also, one good thing about static keyword is that it occupies memory only
 * once but object properties or methods occupies memory again and again. So,
 * static keyword saves the memory.
 */
/*---------------------------------------------------------------- */
/*---------------------------------------------------------------- */