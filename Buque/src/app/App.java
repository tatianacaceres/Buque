package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        LogisticaAda logistica = new LogisticaAda();

        Buque buqueAda = new Buque ();

        logistica.cargarContenedores(buqueAda);

        System.out.println("El peso total del buque es " + buqueAda.calcularPesoTotal());

        Contenedor contenedorM = buqueAda.buscarContenedorMaximo();

        System.out.println("El contenedor mas pesado es " + contenedorM.getIdContenedor() + " y su peso es " 
        + contenedorM.getPeso());

        for (Puerto puerto : logistica.getPuertos()) {
            System.out.println("El puerto " + puerto.getNombre() + " van " + buqueAda.contarContenedores(puerto));
        }
    }
}