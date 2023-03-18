package code.thread.test1;

class prinQishu extends Thread {
    @Override
    public void run() {
        int i = -1;
        while (i < 99) {
            if (Test2.flag == 0) {
                i += 2;
                System.out.println(i);
                Test2.flag = 1;
            }
        }
    }
}
