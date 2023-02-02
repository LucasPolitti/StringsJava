public class Strings{
    public static void main(String[] args) {
        
        char[] texto_c={'c','u','r','s','o',' ','d','e',' ','j','a','v','a'}; //char é um tipo primitivo
        char[] texto_c2=new char[10];
        String texto_s=new String("CFB Cursos"); //String é uma classe
        int tam;
        char c;

        String s1=new String();
        String s2=new String(texto_s);
        String s3=new String(texto_c); //posso usar um array de char como String
        String s4=new String(texto_c,0,5); //posso pegar apenas das posições 0 a 5, nesse exemplo, dentro do array de char

        //length, charAt, getChars

        tam=texto_s.length(); 
        c=texto_s.charAt(5); //recebe um int e retorna um char
        texto_s.getChars(4, 10, texto_c2, 0);


        System.out.println("Tamanho do texto: " + tam);
        System.out.println("O char da posição é: " + c);
        System.out.println(texto_c2);

        


    }
}