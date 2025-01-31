public class vari {
       public static void main(String[] args) {
        int var1;
        int var2;
        var1 = 1024;
        System.out.println("var1 contains"+var1);
        var2=var1/2;
        System.out.print("var2 contains var1/2:");
        System.out.println(var2);
        
}
class Example4{
    public static void main1(String[]args) 
    {
       int iresult,irem;
       double dresult, drem;
        iresult=10/3;
        irem=10%3;
        dresult=10.0/3.0;
        drem=10.0%3.0;
        System.out.println(
            "Result and remaider of 10/3:"+ iresult + ""+irem
        );
        System.out.println("Result and remainder of 10.0/3.0"+dresult + irem);
        System.out.println(
            "Resoult and remainder of 10.0/3.0:"+dresult +""+ drem
        );
    }
}
}