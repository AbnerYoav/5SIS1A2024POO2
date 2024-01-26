import java.util.*;
public class AccionesPersona {

    /*Vamos hacer un crud
     * Mostra Personas
     */
    public ArrayList<Persona> listaPersona = new ArrayList<Persona>();
// Lista de personas
    public ArrayList<Persona>mostrarPersonas(){
        return listaPersona;
    }

    //Registrar

    public void agregarPersona(Personap){
        listaPersonas.add(p);
    }

    //Buscar persona

    public Persona buscarPersona(int id){
        Persona encontrada = new Persona();

        for(Persona p : listaPersona){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("Persona encontrada");
            }
        }
        return encontrada;
    }

    //actualizar
    public void actualizarPersona(Persona actualizada){
        Persona actualizar = buscarPersona(actualizada.getId());
        listaPersonas.remove(actualizar);
        listaPersonas.add(actualizar);
    }
}public void eliminarPersona(Personaeliminar){
    listaPersonas.remove(eliminar);
}


}
