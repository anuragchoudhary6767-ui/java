import java.io.File;

public class filecreation {
   public filecreation() {
   }

   public static void main(String[] var0) {
      File var1 = new File("try.py");

      try {
         if (var1.createNewFile()) {
            System.out.println("file crreated ");
         } else {
            System.out.println("file already created ");
            System.out.println(var1.getPath());
         }
      } catch (Exception var3) {
         System.out.println(var3);
      }

   }
}
