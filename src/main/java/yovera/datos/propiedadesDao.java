package yovera.datos;

import java.util.List;


public interface propiedadesDao<T> {
    public List<T> listar(String texto);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean eliminar(int id);
    public T obtener(int id);
}
/**/

