public class Strings3{
    public static void main(String[] args) {
        
        String s1="CFB Cursos - Curso de Java - ";
        String s2="youtube.com/cfbcursos";
        String s3=s1.concat(s2);
        String s4;
        System.out.println(s3);

        //split
        String[] s5=s3.split(" "); //onde tem espaço ele deu split, ou seja, criou 8 caracteres de strings, nesse caso
        for(String s:s5){
            System.out.println(s);
        }

        //toCharArray
        char[] c=s3.toCharArray(); //converte um array de strings para um array de chars
        System.out.println(c);

        //trim
        System.out.println(s3.trim()); //elimina os espaços ou no início ou no final de uma string

        //toLowerCase - toUpperCase
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());

        //replace
        System.out.println(s4=s3.replace('C','@')); //substitui um caractere na string, no caso C por @
        //System.out.println(s4);
        
    }
}