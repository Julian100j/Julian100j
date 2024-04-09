
package umariana.automovil;
import java.util.*;

public class GestionarMoto {
    
    ArrayList<Moto>misMotos = new ArrayList<>();
    
    public void agregarMoto(int pId, String pPlaca, String pMarca, String pLinea, String pColor){
        
        Moto miMoto = new Moto(pId, pPlaca, pMarca, pLinea, pColor);
        misMotos.add(miMoto);
        for(Moto moto : misMotos) {
            System.out.println("id :"+moto.getId());
            System.out.println("placa: "+moto.getPlaca());
            System.out.println("marca: "+moto.getMarca());
            System.out.println("linea: "+moto.getLinea());
            System.out.println("color: "+moto.getColor());
            
        }
    }
    
    public void listarMotos(){
        
        List<Moto> miMoto = new ArrayList<>();
        
        for(Moto m: miMoto){
            System.out.println(m);
        }
    }
    
    public void modificarMoto(int pId){
        
    }
    
    public void eliminarMoto(int pId){
        
        
        
        
        
        
        
    }
    
    
}
