package cuecasbol.alberthapaza.sp3ctr3.cuecas_bolivia;

import java.io.Serializable;

public class Cueca implements Serializable{
    private String titulo;
    private String subtitulo;
    private String detalle;
    private int imagen;

    public Cueca() {

    }

    public Cueca(String titulo, String subtitulo, String detalle, int imagen) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.detalle = detalle;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
