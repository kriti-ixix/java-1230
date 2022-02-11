class Timer extends Thread
{
    public void run()
    {
        try
        {
            for (int minute=0; minute <= 2; minute++)
            {
                for (int seconds = 0; seconds < 60; seconds++)
                {
                    if (seconds < 10)
                    {
                        System.out.println("0" + minute + ":" + "0" + seconds);
                    }
                    else
                    {
                        System.out.println("0" + minute + ":" + seconds);
                    }

                    if (minute == 2 && seconds == 0)
                    {
                        break;
                    }

                    Thread.sleep(1000);
                }
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Timer t1 = new Timer();
        t1.start();
    }
}