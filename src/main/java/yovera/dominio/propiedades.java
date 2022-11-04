package yovera.dominio;

public class propiedades {
    private int id;
    private String nombre;
    private String direccion;
    private String caracterisitca;
    private String estado;
    private float precioalquiler;
    
    public propiedades() {
    }
    public propiedades(int id, String nombre, String direccion, String caracteristicas, String estado, Float precioalquiler) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.caracterisitca = caracteristicas;
        this.estado = estado;
        this.precioalquiler = precioalquiler;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCaracterisitca() {
		return caracterisitca;
	}
	public void setCaracterisitca(String caracterisitca) {
		this.caracterisitca = caracterisitca;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public float getPrecioalquiler() {
		return precioalquiler;
	}
	public void setPrecioalquiler(float precioalquiler) {
		this.precioalquiler = precioalquiler;
	}
    
}
