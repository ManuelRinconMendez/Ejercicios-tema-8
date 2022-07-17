public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setEdad(20);
        persona1.setNombre("Manuel");
        persona1.setTelefono(40);

        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());

    }

    public static class Persona {

        private int edad;
        private String nombre;
        private int telefono;

        public int getEdad(){
            return edad;
        }

        public void setEdad(int edad){
            this.edad = edad;
        }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public int getTelefono(){
            return telefono;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
    }
}

