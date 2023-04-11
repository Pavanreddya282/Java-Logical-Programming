/*
class A {
  public A() {
    super();

    System.out.println("in A");
  }

  public A(int n) {
    super();
    System.out.println("in int A");
  }
}

class B extends A {
  public B() {
    super();
    System.out.println("in B");
  }

  public B(int n) {
    super(n);
    System.out.println("in int B");
  }
}

class SuperKeyword {
  public static void main(String args[]) {
    B b = new B(5);
  }
}
*/
/*
 * By default it is calling default constructor we not pass any arguments
 if we not use super keyword and pass argument it call param method of B and default method of A
 if we want to call a method explicity: to call param method of A we pass argument to super keyword then it will call param methods explicitly, by default it will call default methods*/
/* if we pass param in default without passing in object it will call default and param of A*/

/*
class A {
  public A() {
    super();

    System.out.println("in A");
  }

  public A(int n) {
    super();
    System.out.println("in int A");
  }
}

class B extends A {
  public B() {
    super(5);
    System.out.println("in B");
  }

  public B(int n) {
    super(n);
    System.out.println("in int B");
  }
}

class SuperKeyword {
  public static void main(String args[]) {
    B b = new B();
  }
}
*/
/* this keyword executes the constructor of same class*/
class A {
  public A() {
    super();

    System.out.println("in A");
  }

  public A(int n) {
    super();
    System.out.println("in int A");
  }
}

class B extends A {
  public B() {
    super();
    System.out.println("in B");
  }

  public B(int n) {
    this();
    System.out.println("in int B");
  }
}

class SuperKeyword {
  public static void main(String args[]) {
    B b = new B(5);
  }
}
