public class Strings2{
    public static void main(String[] args) {
        
        String s1="CFB Cursos - Curso de Java - ";
        String s2="https://www.youtube.com/watch?v=1CM07WVog-A&list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW&index=42";
        System.out.println(s1);

        //concat
        System.out.println(s1.concat(s2)); //concatena, une 2 strings

        //substring
        System.out.println(s1.substring(13)); //substring de s1 a partir de 13, imprime uma parte da string, no caso Curso de Java
        
        System.out.println(s1.substring(4,18)); //substring de s1 começando no 4 e terminando em 18

        //IndexOf
        System.out.println(s1.indexOf('C'));

        System.out.println(s1.indexOf('C',1)); //para encontrar o segundo C eu coloco o índice para o segundo caractere, no caso o 1


        //StartsWith e EndsWith
        if(s1.startsWith("CFB")){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }

        if(s1.endsWith("Java")){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }


    }
}