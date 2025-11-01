import cu.edu.cujae.ceis.tree.binary.BinaryTreeNode;
import cu.edu.cujae.ceis.tree.general.GeneralTree;
import cu.edu.cujae.ceis.tree.iterators.general.InBreadthIterator;

import java.util.*;

public class Controladora {

    private GeneralTree<ElementoMusical> tree;

    public Controladora(Plataforma p){
        tree = new GeneralTree<ElementoMusical>();
        BinaryTreeNode<ElementoMusical> root = new BinaryTreeNode<ElementoMusical>((ElementoMusical)p);
        tree.setRoot(root);
    }

    // Inciso b)
    public String cancionMasReproducida(){
        String nombre = null;
        InBreadthIterator<ElementoMusical> it = new InBreadthIterator<>(tree);
        int cant = -1;

        while(it.hasNext()){
            BinaryTreeNode<ElementoMusical> temp = it.nextNode();

            if((ElementoMusical)temp.getInfo() instanceof Cancion){
                Cancion c = (Cancion)temp.getInfo();
                if(c.getCantReproducciones() > cant) {
                    cant = c.getCantReproducciones();
                    nombre = c.getNombre();
                }
            }
        }

        return nombre;
    }

    //Inciso c)
    public void transferirArtista(String nombreArtista, String nombreSello){
        BinaryTreeNode<ElementoMusical> nodoArtista = buscarElementoMusical(nombreArtista);
        BinaryTreeNode<ElementoMusical> nodoSello = buscarElementoMusical(nombreSello);

        tree.insertNode(nodoArtista,nodoSello);
        tree.deleteNode(nodoArtista);
    }

    private BinaryTreeNode<ElementoMusical> buscarElementoMusical(String nombre){
        boolean found = false;
        InBreadthIterator<ElementoMusical> it = new InBreadthIterator<ElementoMusical>(tree);
        BinaryTreeNode<ElementoMusical> result = null;

        while(it.hasNext() && !found){
            BinaryTreeNode<ElementoMusical> node = it.nextNode();

            if(node.getInfo().getNombre().equalsIgnoreCase(nombre)){
                result = node;
                found = true;
            }
        }

        return result;
    }

    // Inciso d)
    public void agregarNuevasCanciones(String nombreArtista, String tituloAlbum, LinkedList<Cancion> canciones){
        boolean found = false;
        BinaryTreeNode<ElementoMusical> nodoArtista = buscarElementoMusical(nombreArtista);
        BinaryTreeNode<ElementoMusical> album = null;
        List<BinaryTreeNode<ElementoMusical>> listaAlbumes = tree.getSons(nodoArtista);
        Iterator<BinaryTreeNode<ElementoMusical>> it = listaAlbumes.iterator();

        while(it.hasNext() && !found){
            BinaryTreeNode<ElementoMusical> temp = it.next();
            if(temp.getInfo().getNombre().equalsIgnoreCase(tituloAlbum)){
                album = temp;
                found = true;
            }
        }

        for(Cancion c : canciones) {
            BinaryTreeNode<ElementoMusical> temp = new BinaryTreeNode<ElementoMusical>(c);
            tree.insertNode(temp,album);
        }

        Album albumObject = (Album)album.getInfo();
        albumObject.setCantCanciones(albumObject.getCantCanciones() + canciones.size());
    }

    // Inciso e)
    public Queue<Cancion> obtenerReproductorDeCanciones(ArrayList<String> nombresArtistas, ArrayList<Integer> cantidades){
        Queue<Cancion> cola = new ArrayDeque<Cancion>();
        int count = 0;

        for(int i = 0; i < nombresArtistas.size(); i++){
            BinaryTreeNode<ElementoMusical> artista = buscarElementoMusical(nombresArtistas.get(i));
            List<BinaryTreeNode<ElementoMusical>> listaAlbumes = tree.getSons(artista);
            for(int j = 0; j < listaAlbumes.size() && count < cantidades.get(i); j++){
                List<ElementoMusical> cancionesPorAlbum = tree.getSonsInfo(listaAlbumes.get(j));
                for(int k = 0; k < cancionesPorAlbum.size() && count < cantidades.get(i); k++){
                    cola.offer((Cancion)cancionesPorAlbum.get(k));
                }
            }
            count = 0;
        }

        return cola;
    }

}
