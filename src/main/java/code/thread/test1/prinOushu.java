package code.thread.test1;

class prinOushu extends Thread {
    @Override
    public void run() {
        int i = -2;
        while (i <= 98) {
            if (Test2.flag == 1) {
                i += 2;
                System.out.println(i);
                Test2.flag = 0;
            }
        }
    }
}
