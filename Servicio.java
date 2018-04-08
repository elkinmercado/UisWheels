
import java.util.List;


public class Servicio
{
    
   //numero de cupos
  private int cupos;
  
  //prestante del servicio
  private Conductor conductor;
  
  //lista de pasajeros
  List<Pasajero> pasajeros;
  
  //coleccion de rutas por donde se va a pasar
  List<Ruta> rutas;
  
  private Vehiculo vehiculo;
  
  //Respuestas a acciones del  Conductor
  
  public void CancelarServicio(){}
   
   public void CalificarUsuarios(){} 
   
   private void ModificarServicio(){}
   
 //------------------------------------- 
  
 //metodos y respuestas a acciones de pasajeros 
    public void CancelarCupo(){}
   
   public void CalificarServicio(){} 
   
 //------------------Metodos generales-----------------------
 public int getCuposDisponibles(){return 0;}
 
 public int TotalCupos(){return 0;}
 
 
   
}
