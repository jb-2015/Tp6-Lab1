package tp6.negocio;

import java.util.HashMap;
import java.util.Map;

public class Directorio {
<<<<<<< HEAD
    private HashMap<String,Cliente> registro=new HashMap<String,Cliente>();
    
    
    public Cliente buscarCliente(String numTelefono){
        for (Map.Entry<String, Cliente> entry : registro.entrySet()) {
            String key = entry.getKey();
            Cliente value = entry.getValue();
            if(numTelefono.equals(key)){
                return value;
            }
        }
        System.out.println("No se encontrò el telefono asociado a un cliente");
        return null;
    }
=======

private HashMap<String, Cliente> registro = new HashMap<>();

//AgregarCliente() que permite registrar un nuevo cliente con su respectivo nro de 
//teléfono. Siendo el nro del teléfono la clave del mismo.
    public boolean agregarCliente(String telefono, Cliente c) {
        boolean agregado = false;
        if (!registro.containsKey(telefono)) {
            registro.put(telefono, c);
            agregado = true;
        }
        return agregado;
    }   
>>>>>>> 2a0ce480407404da97c59988fb7f424569d362c8
}
