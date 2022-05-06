public class OnionDosa extends DosaDecorator
{
 
 public OnionDosa( Dosa dosa )
 {
 super(dosa);
 }
 
 public String makeDosa()
 {
 return dosa.makeDosa() + addOnion();
 
 }
 
 private String addOnion()
 {
 return ",Onion added";
 }
}