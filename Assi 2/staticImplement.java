class staticImplement {
static int a = 10;
static int b;
// Static block
static {
System.out.println("Static block initialized.");
b = a * 4;
}
public static void main(String[] args) {
System.out.println("from main");
System.out.println("Value of a: " + a);
System.out.println("Value of b: " + b);
}
}
