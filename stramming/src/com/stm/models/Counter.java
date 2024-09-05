public class Counter implements Runnable {
    private int counter;
  
    @Override
    public void run() {
  
      synchronized (this) {
        // tudo que está nesse bloco, é executando apenas se nenhuma thread esta executando- um de cadas vez
      counter++;
      System.out.println(Thread.currentThread().getName() + ":" + counter);
      }
    }
  }