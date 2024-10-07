package OOPS.Generics;


public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
//        list.add(4);
//        list.add(5);
//
//        System.out.println(list.get(0));


        for(int i = 0; i<14; i++){
            list.add(i);
        }
        System.out.println(list);

    }

}
