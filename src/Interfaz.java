import javax.swing.*;
import java.awt.*;

/**
 * @author Andres Uriza
 * @author Daniel Castro
 * @author Ricardo Borbon
 * @author Jose Pablo Esquetini
 * 
 * This class
 */
public class Interfaz {
    // Atributos de la clase - Aquí están los principales componentes de la interfaz
    JFrame root;
    JPanel panelInicio;
    JPanel panelNavegacion;
    JPanel[] lugares = new JPanel[15];
    JButton[] botonesLugar = new JButton[15];
    JButton[] botonesVolver = new JButton[15];

    /**
     * Constructor method
     */
    public Interfaz(){
        root = new JFrame();
        //-----------------------------------------
        // Creación del Panel que recibe al usuario
        panelInicio = new JPanel();
        panelInicio.setLayout(null);
        panelInicio.setBounds(0, 0, 1024, 768);
        JLabel fondo = new JLabel();
        ImageIcon fondoBarco = new ImageIcon("imagenes/fondo.png");
        fondo.setIcon(fondoBarco);
        fondo.setBounds(0,0,1024,768);
        JButton iniciarBoton = new JButton();
        ImageIcon botonInicio = new ImageIcon("imagenes/boton.png");
        iniciarBoton.setIcon(botonInicio);
        iniciarBoton.setBounds(302, 480,420,132);
        iniciarBoton.addActionListener(e -> {cambiarPanel(panelInicio, panelNavegacion);});
        panelInicio.add(iniciarBoton);
        panelInicio.add(fondo);
        // Final del Panel que recibe al usuario
        //-----------------------------------------

        //-----------------------------------------
        // Creación del Panel de Navegación
        panelNavegacion = new JPanel();
        panelNavegacion.setLayout(null);
        panelNavegacion.setBounds(0, 0, 1024, 768);

        JPanel panelNavegacionMapa = new JPanel();
        panelNavegacionMapa.setLayout(null);
        panelNavegacionMapa.setBounds(0,0, 800,768);
        panelNavegacionMapa.setBackground(Color.red);

        JPanel panelNavegacionLugar = new JPanel();
        panelNavegacionLugar.setLayout(null);
        panelNavegacionLugar.setBounds(800,0, 224,768);
        panelNavegacionLugar.setBackground(Color.blue);
        int buttonCordX = 12;
        int buttonCordY = 50;
        for (int i = 0; i<15; i++){
            int finalI = i;
            lugares[i] = new JPanel();
            lugares[i].setLayout(null);
            lugares[i].setBounds(0, 0, 1024, 768);
            lugares[i].setVisible(false);
            root.add(lugares[i]);
            botonesVolver[i] = new JButton();
            botonesVolver[i].setBounds(312, 680,400,60);
            botonesVolver[i].addActionListener(e -> {cambiarPanel(lugares[finalI], panelNavegacion);});
            lugares[i].add(botonesVolver[i]);
            botonesLugar[i] = new JButton();
            botonesLugar[i].setBounds(buttonCordX, buttonCordY, 185, 40);
            panelNavegacionLugar.add(botonesLugar[i]);
            buttonCordY += 45;
        }
        botonesLugar[0].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[0]);});
        botonesLugar[1].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[1]);});
        botonesLugar[2].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[2]);});
        botonesLugar[3].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[4]);});
        botonesLugar[5].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[6]);});
        botonesLugar[7].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[7]);});
        botonesLugar[8].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[8]);});
        botonesLugar[9].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[9]);});
        botonesLugar[10].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[10]);});
        botonesLugar[11].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[11]);});
        botonesLugar[12].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[12]);});
        botonesLugar[13].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[13]);});
        botonesLugar[14].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[14]);});

        panelNavegacion.add(panelNavegacionMapa);
        panelNavegacion.add(panelNavegacionLugar);
        panelNavegacion.setVisible(false);

        // Final del Panel de Navegación
        //-----------------------------------------


        //-----------------------------------------
        // Creación del Frame Principal
        root.setLayout(null);
        root.setSize(1024, 768);
        root.setResizable(false);
        root.setTitle("Navegador GPS");
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("imagenes/icono.jpg"); // Imagen de Icono
        root.setIconImage(icon.getImage()); // Asignarle un ícono al Frame

        // Añadir todos los componentes al Frame
        root.add(panelInicio);
        root.add(panelNavegacion);

        root.setVisible(true); // Mostrar la Ventana
        // Final del Frame Principal
        //------------------------------------------
    }

    /**
     * Method that changes JPanel
     * 
     * @param primerPanel
     * @param segundoPanel
     */
    public void cambiarPanel(JPanel primerPanel, JPanel segundoPanel){
        primerPanel.setVisible(false);
        segundoPanel.setVisible(true);
    }
}
