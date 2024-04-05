class PrintThread extends Thread {
    private String message;

    public PrintThread(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }
}

class Main {
    public static void main(String[] args) {
        PrintThread morningThread = new PrintThread("Good Morning");
        PrintThread nightThread = new PrintThread("Good Night");

        morningThread.start();
        nightThread.start();
    }
}