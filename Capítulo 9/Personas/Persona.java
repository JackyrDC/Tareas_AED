public class Persona implements Comparable<Persona> {

private String nombre;// nombre
private int tipo; // edad
private int com;// kilometros

public Persona(String nombre, int tipo, int com) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.com = com;
}

public int getCom() {
    return com;
}

public void setCom(int com) {
    this.com = com;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getTipo() {
    return tipo;
}

public void setTipo(int tipo) {
    this.tipo = tipo;
}

@Override
public int compareTo(Persona o) {
    Integer miTipo = Integer.valueOf(this.tipo);
    Integer otroTipo = Integer.valueOf(o.getTipo());

    return miTipo < 65 && otroTipo < 65 ? Integer.valueOf(o.getCom()).compareTo(this.com) : otroTipo.compareTo(mTipo);
}
}