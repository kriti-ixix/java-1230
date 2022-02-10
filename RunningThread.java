class RunningThread
{
    public static void main(String[] args)
    {
        TestThread t1 = new TestThread();
        t1.startThread();
    }
}

class TestThread implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            try
            {
                System.out.println("Thread: " + i);
                Thread.sleep(1000);
            }

            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    void startThread()
    {
        Thread t = new Thread(this);
        t.start();
    }
}