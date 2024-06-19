public class Percentage {
    public static void main(String[] args) {
        String name = "Hemanth";
        String mailid = "hemanthchowdary9347@gmail.com";
        String phone = "9347990132";
        String qual = "BTech";
        float s1 = 100, s2 = 100, s3 = 100, s4 = 100, s5 = 25, s6 = 45, per, total;
        total = s1 + s2 + s3 + s4 + s5 + s6;
        per = (total / 600) * 100;
        //per = 95;
        System.out.println("Name is : " + name);
        System.out.println("Qualification is : " + qual);
        System.out.println("Total marks is : " + total);
        System.out.println("Percentage is : " + per);
        if (per > 50 && per < 60)
            System.out.print("obtained grade is : C  " + "PASS");
        else if (per >= 60 && per < 70)
            System.out.println("obtained grade is : B  " + "PASS");
        else if (per >= 70 && per < 90)
            System.out.println("obtained grade is : A  " + "PASS");
        else if (per >= 90)
            System.out.println("obtained grade is : A+  " + "Distinction");
        else
            System.out.println("sorry u failed");
    }
}