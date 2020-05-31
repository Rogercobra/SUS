package com.mycompany.sosus;
import java.util.Scanner;

public class SOSus {
    public static void main(String[] args){
   int cod ;
 final Scanner teclado = new Scanner(System.in);
 
 int Cpf,dataNascimento,Cadastro;
 String nome;
 //Lint cod;
int Senha;

 //Classe Usuario---------------------------------------------------------------
  System.out.println("Usuario-------");   
 System.out.print("Seu Nome: ");
		nome = teclado.nextLine();

    System.out.print("Seu CPF: ");
		Cpf = teclado.nextInt();

    System.out.print("Idade: ");
		dataNascimento = teclado.nextInt();
    System.out.println("Seu Cadastro 0 nao 1 sim:");
		Cadastro = teclado.nextInt();

    Usuario usuario = new Usuario(nome, Cpf ,dataNascimento,Cadastro);
 // Tem cadastro---------------------------------------------------------------- 
  System.out.println("Cadastro-------");   
 if (Cadastro == 0){
     System.out.print("Seu Endereço: ");
	String	endereco = teclado.nextLine();

    System.out.print("Seu Telefone: ");
	int	Telefone = teclado.nextInt();

    System.out.print("Cartão SUS: ");
	int	Sus = teclado.nextInt();
    
    System.out.print("Sua ID: ");
        CadastroSOSus cs = new CadastroSOSus(endereco,Telefone,Sus);
        cs.Id();
    } 

  
  // Formulario-----------------------------------------------------------------
    System.out.println("Formulario-------");
    System.out.print("Numero de filhos: ");
	int	Nfilhos = teclado.nextInt();

    System.out.println("Teve COVID-19?: ");
	String	TDoenca = teclado.nextLine();

    System.out.println("toma algum remedio: ");
	String	Remedio = teclado.nextLine();
    System.out.println("Pressao arterial:");
	int	Pressao = teclado.nextInt();
    System.out.println("temperatura Corporal:");
	float	tempC = teclado.nextInt();

    Formulario fm = new Formulario(Nfilhos, TDoenca, Remedio, Pressao,tempC);
    
 // Administrativo--------------------------------------------------------------
 System.out.println("Administrativo-------");
System.out.println("Deseja logar com ADM 1 sim 0 nao" );
cod = teclado.nextInt();
Senha = 0;


 if(cod == 1){
     System.out.println("Seu Nome: ");
		nome = teclado.nextLine();
     System.out.println("Senha:");
		Senha = teclado.nextInt();
                
                Administrativo adm = new Administrativo(nome,Senha); 
                

    }else{
 
System.exit(0);
 
}  
}
}
 