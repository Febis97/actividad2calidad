/**
 * Javier Abellán, 9 de Mayo de 2003
 *
 * Applet con el puzzle
 */
import java.awt.Image;
import java.awt.Graphics;

/**
 * Applet que instancia el puzzle y carga las imágenes, dejándolo todo
 * dispuesto para poder jugar con él.
 */
public class AppletPuzzle extends javax.swing.JApplet {

	/**
	 * Método llamado por el navegador cuando se inicia el applet por primera
	 * vez.
	 * Carga las imágenes e instancia GuiTableroBotones, Ordenador y Puzzle.
	 */
    public void init() {
        int i;
        
		/* Se instancia Ordenador y Puzzle */
        Puzzle puzzle = new Puzzle (3,3);
        Ordenador ordenador = new Ordenador(puzzle);
        
		/* Se cargan las imágenes de los ficheros .gif que harán de piezas
		 * del puzzle */
        Image [] imagenes = new Image[ficheros.length];
        
        for (i=0; i<ficheros.length; i++)
            imagenes[i] = this.getImage(
                this.getDocumentBase(), ficheros[i]);
        
		/* Se instancia la interface gráfica del puzzle, pasándole el Puzzle,
		 * el Ordenador y las imágenes. */
        GuiTableroBotones guiPuzzle = new GuiTableroBotones(
            ordenador, imagenes, puzzle);
        
        this.getContentPane().add (guiPuzzle);
    }
        
    /** Array con los ficheros de imágenes para las piezas del puzzle */
    private String [] ficheros = {"hueco.gif", "uno.gif", "dos.gif", "tres.gif",
        "cuatro.gif", "cinco.gif", "seis.gif", "siete.gif", "ocho.gif" };
}