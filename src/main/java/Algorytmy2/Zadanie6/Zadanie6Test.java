package Algorytmy2.Zadanie6;

public class Zadanie6Test {

    public static void TestQueue() throws Exception {
        IQueue<String> myQueue = new MyQueue<>();
        String temp = myQueue.Peek();
        myQueue.Add("Bartosz");
        System.out.println(myQueue.Size());
        System.out.println(myQueue.Peek());
        myQueue.Add("Ania");
        System.out.println(myQueue.Size());
        System.out.println(myQueue.Peek());
        myQueue.Add("Robert");
        System.out.println(myQueue.Size());
        System.out.println(myQueue.Peek());
        myQueue.Add("Michal");
        System.out.println(myQueue.Size());
        System.out.println(myQueue.Peek());

        System.out.println(myQueue.Size());
        System.out.println(myQueue.Poll());

        System.out.println(myQueue.Size());
        System.out.println(myQueue.Poll());

        System.out.println(myQueue.Size());
        System.out.println(myQueue.Poll());

        System.out.println(myQueue.Size());
        System.out.println(myQueue.Poll());
    }
    public static void TestDeque() throws Exception {
        IQueue<String> myQueue = new MyDeque<String>();
        String temp = myQueue.Peek();
        myQueue.Add("Bartosz");
        System.out.println(myQueue.Size());
        System.out.println(myQueue.Peek());
        myQueue.Add("Ania");
        System.out.println(myQueue.Size());
        System.out.println(myQueue.Peek());
        myQueue.Add("Robert");
        System.out.println(myQueue.Size());
        System.out.println(myQueue.Peek());
        myQueue.Add("Michal");
        System.out.println(myQueue.Size());
        System.out.println(myQueue.Peek());

        System.out.println(myQueue.Size());
        System.out.println(myQueue.Poll());

        System.out.println(myQueue.Size());
        System.out.println(myQueue.Poll());

        System.out.println(myQueue.Size());
        System.out.println(myQueue.Poll());

        System.out.println(myQueue.Size());
        System.out.println(myQueue.Poll());
    }
}
