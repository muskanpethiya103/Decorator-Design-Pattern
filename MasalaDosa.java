public class MasalaDosa extends DosaDecorator
{
 
 public MasalaDosa( Dosa dosa )
 {
 super(dosa);
 }
 
 public String makeDosa()
 {
 return dosa.makeDosa() + addMasala();
 }
 
 private String addMasala()
 {
 return ",Masala added";
 
 }
}
