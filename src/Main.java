public class Main {
    public static void main(String[] args) {
        System.out.println("Hello dz-4!");
        System.out.println("Returned value c from secondClass is: " + secondClass.printC());

        secondClass retA = new secondClass();
        System.out.println("Returned value a from secondClass is: " + retA.a);
    }
}