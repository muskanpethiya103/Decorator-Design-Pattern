public class DecoratorDesignPattern
{
 
 public static void main( String args[] )
 {
 PlainDosa plainDosaObj = new PlainDosa();
 String plainDosa = plainDosaObj.makeDosa();
 System.out.println(plainDosa);
 
 String onionDosa = new OnionDosa(plainDosaObj).makeDosa();
 System.out.println("\n'" + onionDosa + "' using OnionDosa");
 
 String masalaDosa = new MasalaDosa(plainDosaObj).makeDosa();
 System.out.println("\n'" + masalaDosa + "' using MasalaDosa");
 
 String mysoreDosa = new MysoreDosa(plainDosaObj).makeDosa();
 System.out.println("\n'" + mysoreDosa + "' using MysoreDosa");
 
 }
 
}