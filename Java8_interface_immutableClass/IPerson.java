public interface IPerson
{
    default void defaultMethod()
  {
      System.out.println("this is default method");
  }
  static void staticMethod()
  {
      System.out.println("this is static method");
  }

  void abstractMethod();

}
