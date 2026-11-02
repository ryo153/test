import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("商品は何個？");
        int num=sc.nextInt();
        sc.nextLine();
        Node[] nodes=new Node[num];
        for (int i=0;i<num;i++){
          System.out.println("商品名は?");
          String tmpa=sc.nextLine();
          System.out.println("いくら？");
          int tmpb=sc.nextInt();
          sc.nextLine();
          nodes[i]=new Node(tmpa,tmpb) ;
        }
        System.out.println("探すよ");
       while(true){
         String tmpc=sc.nextLine();
         boolean found=false;
         for(int i=0;i<num;i++){
            if(nodes[i].name.equals(tmpc)){
                System.out.println(nodes[i].data);
                found=true;
                break;
            }
         }
         if(!found){
            System.out.println("-1");
         }
       }
          
    }

}