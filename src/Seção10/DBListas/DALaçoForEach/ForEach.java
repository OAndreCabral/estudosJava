package Seção10.DBListas.DALaçoForEach;

public class ForEach {
    public static void main(String[] args) {
        String[] arrayObjeto = new String[] {"Maria", "Bob", "Alex"};

        //FOR convencional
        for (int i = 0; i < arrayObjeto.length; i++) {
            System.out.println(arrayObjeto[i]);
        }

        System.out.println("----------------------");
        //ForEach
        for(String obj : arrayObjeto){
            System.out.println(obj);
        }
    }
}
