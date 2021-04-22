

public class Control {///faltaria extenderla de administrador

    private String producto;///teoricamente habria
    

    public Control() {
    }

    public Control(String producto) {
        this.producto = producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void mantenimientoYcontrol(){
        try {
            
            System.out.println("HACIENDO MANTENIMIENTO NSDALSDNBÑASDNLASDÑAS PIUM PIUM TSSSSS");
            System.out.println("EJECTANDO PROTOCOLOS dpsanbdsadasda pium tsss");
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error. Es probable que los caracteres ingresados no sean correctos o no pertenezcan a un libro existente. " + e.getMessage());
        }
        
        
    }


    

    
}
