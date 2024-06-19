public class Marks{
    public static void main(String[]args){
          String name = "Hemanth";
        System.out.println(name);
        String email = "Hemanthchowdary9347@gmail.com";
        System.out.println(email);
        long mobile = 9347990132l;
        System.out.println(mobile);
        int sub1=70, sub2=60, sub3=75, sub4=60, sub5=90, sub6=30,totalmarks;
        totalmarks = sub1+sub2+sub3+sub4+sub5+sub6;
        System.out.println("total marks of a students:"+ totalmarks);
        float percentage = ((float) totalmarks/600)*100;
        System.out.println("percentage:"+ percentage);
        if (percentage >= 50){
             System.out.println("pass");
         }else{
             System.out.println("fail");  
             
         }
}
}