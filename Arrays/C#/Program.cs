using System;

class HelloWorld {
  static void Main() {
    int i = 10;
    Console.WriteLine("pre increment  {0}", ++i);
    Console.WriteLine("post increment {0}", i++);
    Console.WriteLine("post increment {0}", i);
  }
}