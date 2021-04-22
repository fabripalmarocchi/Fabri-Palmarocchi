public class Venta {

	private String producto;
	private Double precio;
	private Integer cantidad;

	public Venta(){

	}

	public String getProducto(){
		return producto;
	}

	public void setProducto(String producto){
		this.producto = producto;
	}

	public Double getPrecio(){
		return precio;
	}

	public void setPrecio(Double precio){
		this.precio = precio;
	}

	public Integer getCantidad(){
		return cantidad;
	}

	public void setCantidad(Integer cantidad){
		this.cantidad = cantidad;
	}


	public void venta(){

		System.out.println("Se realizo una venta");

	}

	public void RegistroVenta(){

		System.out.println("Se registro una venta");

	}



}