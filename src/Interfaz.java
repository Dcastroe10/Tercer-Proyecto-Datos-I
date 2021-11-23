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
        panelInicio.setBounds(0, 0, 1024, 1000);
        JLabel fondo = new JLabel();
        ImageIcon fondoBarco = new ImageIcon("imagenes/fondo.png");
        fondo.setIcon(fondoBarco);
        fondo.setBounds(0,0,1024,1000);
        JButton iniciarBoton = new JButton();
        ImageIcon botonInicio = new ImageIcon("imagenes/boton.png");
        iniciarBoton.setIcon(botonInicio);
        iniciarBoton.setBounds(302, 600,420,132);
        iniciarBoton.addActionListener(e -> {cambiarPanel(panelInicio, panelNavegacion);});
        panelInicio.add(iniciarBoton);
        panelInicio.add(fondo);
        // Final del Panel que recibe al usuario
        //-----------------------------------------

        //-----------------------------------------
        // Creación del Panel de Navegación
        panelNavegacion = new JPanel();
        panelNavegacion.setLayout(null);
        panelNavegacion.setBounds(0, 0, 1024, 1000);

        JPanel panelNavegacionMapa = new JPanel();
        panelNavegacionMapa.setBounds(0, -5, 800, 800);
        

        JLabel map = new JLabel();
        ImageIcon costarica_map = new ImageIcon("imagenes/map.png");
        map.setIcon(costarica_map);
        panelNavegacionMapa.add(map);

        JPanel panelNavegacionLugar = new JPanel();
        panelNavegacionLugar.setLayout(null);
        panelNavegacionLugar.setBounds(800,0, 224,800);
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
            botonesVolver[i] = new JButton("Return");
            botonesVolver[i].setBounds(312, 680, 400, 60);
            botonesVolver[i].addActionListener(e -> {cambiarPanel(lugares[finalI], panelNavegacion);});
            lugares[i].add(botonesVolver[i]);
            botonesLugar[i] = new JButton();
            botonesLugar[i].setBounds(buttonCordX, buttonCordY, 185, 40);
            panelNavegacionLugar.add(botonesLugar[i]);
            buttonCordY += 45;
        }
        
        botonesLugar[0].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[0]);});
        botonesLugar[0].setText("Upala");
        botonesLugar[1].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[1]);});
        botonesLugar[1].setText("Liberia");
        botonesLugar[2].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[2]);});
        botonesLugar[2].setText("Quesada");
        botonesLugar[3].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[3]);});
        botonesLugar[3].setText("Alajuela");
        botonesLugar[4].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[4]);});
        botonesLugar[4].setText("Heredia");
        botonesLugar[5].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[5]);});
        botonesLugar[5].setText("Santa Cruz");
        botonesLugar[6].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[6]);});
        botonesLugar[6].setText("Palmares");
        botonesLugar[7].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[7]);});
        botonesLugar[7].setText("Limon");
        botonesLugar[8].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[8]);});
        botonesLugar[8].setText("San Jose");
        botonesLugar[9].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[9]);});
        botonesLugar[9].setText("Cartago");
        botonesLugar[10].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[10]);});
        botonesLugar[10].setText("Turrialba");
        botonesLugar[11].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[11]);});
        botonesLugar[11].setText("Orotina");
        botonesLugar[12].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[12]);});
        botonesLugar[12].setText("Escazu");
        botonesLugar[13].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[13]);});
        botonesLugar[13].setText("Parrita");
        botonesLugar[14].addActionListener(e -> {cambiarPanel(panelNavegacion, lugares[14]);});
        botonesLugar[14].setText("Puntarenas");

        JLabel information = new JLabel("Information");
        information.setBounds(70, -30, 100, 100);
        panelNavegacionLugar.add(information);

        JPanel travel_plan = new JPanel();
        travel_plan.setBounds(0,800,1300,1000);
        travel_plan.setLayout(null);
        travel_plan.setBackground(new Color(102,201,97));

        JLabel from = new JLabel("From:");
        from.setBounds(50, 0, 100, 100);
        JLabel go_to = new JLabel("Go to:");
        go_to.setBounds(300, 0, 100, 100);
        JLabel delays = new JLabel("Delays?");
        delays.setBounds(600, 0, 100, 100);

        JTextField from_field = new JTextField("Ex: San Jose");
        from_field.setBounds(30, 80, 200, 30);
        JTextField goto_field = new JTextField("Ex: Turrialba");
        goto_field.setBounds(280, 80, 200, 30);
        JTextField delays_field = new JTextField("In minutes, Ex: 10");
        delays_field.setBounds(580, 80, 200, 30);

        JButton go = new JButton("Let's go");
        go.setBounds(850,50,100,50);

        travel_plan.add(from);
        travel_plan.add(from_field);
        travel_plan.add(go_to);
        travel_plan.add(goto_field);
        travel_plan.add(delays);
        travel_plan.add(delays_field);
        travel_plan.add(go);

        panelNavegacion.add(panelNavegacionMapa);
        panelNavegacion.add(panelNavegacionLugar);
        panelNavegacion.add(travel_plan);

        panelNavegacion.setVisible(false);


        // Final del Panel de Navegación
        //-----------------------------------------


        //-----------------------------------------
        // Creación del Frame Principal
        root.setLayout(null);
        root.setSize(1024, 1000);
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
