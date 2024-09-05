package creating_tasks;
import br.com.streaming.models.Filme;
import java.text.DecimalFormat;



public class Main {
    public static void main(String[] args) {
       DecimalFormat formatOne = new DecimalFormat("#.##");
        DecimalFormat formatTwo = new DecimalFormat("#.#");  
      
      Filme firstFilme = new Filme();
      firstFilme.setNome("O Poderoso Chefão");
      firstFilme.setAnoLancamento(1972);
      firstFilme.setDuracaoMinutos(152);
  
      firstFilme.receiveAvaliar(10.8);
      firstFilme.receiveAvaliar(7.0);
      firstFilme.receiveAvaliar(5.854);
      firstFilme.receiveAvaliar(3.41);
  
      firstFilme.exibeFichaTecnica();
      
      System.out.println("Média das avaliações: " + formatTwo.format(firstFilme.mediaAvaliacoes()));
      
      System.out.println("Total de avaliações: " + firstFilme.getTotalAvaliacoes());
  
  
      /////////////////////////////////////
  
      ContaBancaria firstContaBancaria = new ContaBancaria();
  
          firstContaBancaria.setNumConta("o525rv6");
          firstContaBancaria.setSaldo(3459.6350);
          firstContaBancaria.titular = "Thais Farias";
  
          firstContaBancaria.extratoConta();
  
      /////////////////////////////////////////
  
      IdadePessoa firstPessoa = new IdadePessoa();
  
          firstPessoa.setNome("Thaís Novamente");
          firstPessoa.setIdade(18);
  
          firstPessoa.idadeVerify();
  
  
      //////////////////////////////////////////////////////
        
          Produto firstProduct = new Produto();
  
          firstProduct.setNome("Camiseta java");
          firstProduct.setPreco(75.00f);
          firstProduct.setPercentualDesconto(15.15f);
  
          firstProduct.discountApply();
  
      //////////////////////////////////////////////////////////
  
      Alunos firstAluno = new Alunos();
  
      firstAluno.setNome("Thaís Opa Novamente");
  
        
        
      firstAluno.setNotas(new double[]{5.957, 5.9303, 5.565, 5.948});
     
      firstAluno.mediaCalc();
  
        /////////////////////////////////////////////////////
        Livros firstLivro = new Livros();
  
        firstLivro.setTitulo("O reverso da medalha");
        firstLivro.setAutor("Sydney Sheldon");
  
        firstLivro.displayDetails();
  
        /////////////////////////////////////////////
  
   
  
        counter task = new Counter();
        Thread counter1 = new Thread(Thread(task));
        Thread counter2 = new Thread(Thread(task));
        Thread counter3 = new Thread(Thread(task));
         counter1.start();
         counter2.start();
         counter3.start();
         counter4.start();

    

         Thread task1 = new Thread(new PrintHelloTask("Task1"));
         Thread task2 = new Thread(new PrintHelloTask("Task2"));
         Thread task3 = new Thread(new PrintHelloTask("Task3"));
         Thread task4 = new Thread(new PrintHelloTask("Task4"));
 
 
         task1.start();
         task2.start();
         task3.start();
         task4.start();
 

         //////////////////////////////////////////////////////////////////
  
      }
    }


        
    
