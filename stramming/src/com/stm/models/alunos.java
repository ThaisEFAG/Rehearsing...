public class Alunos {

    private String nome;
    private double[] notas;
    private double mediaNotas;
      private double mediaNotas1;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNotas(double[] notas) {
      this.notas = notas;
    }
    
    public String getNome() {
      return nome;
    }
    
    public void mediaCalc() {
     
      for(int n = 0; n < notas.length; n++){   
         mediaNotas1 += notas[n];
      }
      mediaNotas = Math.floor((mediaNotas1 / notas.length) * 100) / 100;
      if(mediaNotas >= 7) {
        System.out.println("--------if 1-----------");
        System.out.println("Aluno aprovodo com média: " + mediaNotas);
        return;
      }if(mediaNotas < 7 && mediaNotas > 5) {
         System.out.println("---------if 2----------");
        System.out.println("Aluno com depenência com média: " + mediaNotas);
        return;
      }else{
         System.out.println("----------if 3---------");
        System.out.println("Aluno reprovado com média: " + mediaNotas);
        return;
      }
    
    }
    
    }