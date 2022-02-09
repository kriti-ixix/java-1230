class MultiThreading
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            try
            {
                System.out.println("Thread 1: " + i);
                Thread.sleep(1000);
            }

            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        for (int i = 10; i <= 100; i+=10)
        {
            try
            {
                System.out.println("Thread 2: " + i);
                Thread.sleep(1000);
            }

            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}