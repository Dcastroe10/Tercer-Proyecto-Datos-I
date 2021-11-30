import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

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
    private JFrame root;
    private JPanel panelInicio;
    private JPanel panelNavegacion;
    private JPanel[] lugares = new JPanel[15];
    private JButton[] botonesLugar = new JButton[15];
    private JButton[] botonesVolver = new JButton[15];
    private Font title = new Font("Cambria", Font.BOLD, 40);
    private Font paragraph = new Font("Cambria", Font.PLAIN, 22);
    private Font titlesFont = new Font("Cambria", Font.BOLD, 30);
    private Font buttonsFont = new Font("Cambria", Font.BOLD, 18);
    private JTextField from_field = new JTextField("Ex: San Jose");
    private JTextField goto_field = new JTextField("Ex: Turrialba");
    private JTextField delays_field = new JTextField("In minutes, Ex: 10");

    /**
     * Constructor method
     */
    public Interfaz(){
        // Creation of the main frame
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
            lugares[i].setBounds(0, 0, 1024, 1000);
            lugares[i].setBackground(Color.WHITE);
            lugares[i].setVisible(false);
            root.add(lugares[i]);
            botonesVolver[i] = new JButton("Return");
            botonesVolver[i].setBounds(312, 850, 400, 60);
            botonesVolver[i].addActionListener(e -> {cambiarPanel(lugares[finalI], panelNavegacion);});
            lugares[i].add(botonesVolver[i]);
            botonesLugar[i] = new JButton();
            botonesLugar[i].setBounds(buttonCordX, buttonCordY, 185, 40);
            botonesLugar[i].setFont(buttonsFont);
            panelNavegacionLugar.add(botonesLugar[i]);
            buttonCordY += 50;
        }
        
        JLabel upala = new JLabel("Upala");
        upala.setFont(title);
        upala.setBounds(400,0,900,100);
        JTextArea upala_info = new JTextArea("43,953 live here!\nYou can visit the Parque Central and Rincon Verde Hotel here!\nYou can eat at El Fogon and Harleys Burger!\nNearby gas stations are Gasolinera Upala and JSM Upala");
        upala_info.setFont(paragraph);
        upala_info.setBounds(40,150,900,120);
        JLabel picture_label0 = new JLabel();
        picture_label0.setBounds(50,310,900,500);
        ImageIcon picture0 = new ImageIcon("imagenes/upala.png");
        picture_label0.setIcon(picture0);

        lugares[0].add(picture_label0);
        lugares[0].add(upala);
        lugares[0].add(upala_info);

        JLabel liberia = new JLabel("Liberia");
        liberia.setFont(title);
        liberia.setBounds(400,0,900,100);
        JTextArea liberia_info = new JTextArea("53,382 live here!\nYou can visit the Museo de Guanacaste and Catedral de la Inmaculada Concepcion!\nYou can eat at Cielito Lindo Liberia and Restaurante Terrazas!\nNearby gas stations are Estacion De Servicio Ciudad Blanca and Estacion de Gasolina Full");
        liberia_info.setFont(paragraph);
        liberia_info.setBounds(40,150,900,120);
        JLabel picture_label1 = new JLabel();
        picture_label1.setBounds(50,310,900,500);
        ImageIcon picture1 = new ImageIcon("imagenes/liberia.png");
        picture_label1.setIcon(picture1);

        lugares[1].add(picture_label1);
        lugares[1].add(liberia);
        lugares[1].add(liberia_info);

        JLabel quesada = new JLabel("Quesada");
        quesada.setFont(title);
        quesada.setBounds(400,0,900,100);
        JTextArea quesada_info = new JTextArea("42,060 live here!\nYou can visit the Parque de Ciudad Quesada and Volcan Platanar!\nYou can eat at Julio’s Grill and Soda Punto del sabor!\nNearby gas stations are Estacion de Servicio LOYVA and Delta Ciudad Quesada");
        quesada_info.setFont(paragraph);
        quesada_info.setBounds(40,150,900,120);
        JLabel picture_label2 = new JLabel();
        picture_label2.setBounds(50,310,900,500);
        ImageIcon picture2 = new ImageIcon("imagenes/quesada.png");
        picture_label2.setIcon(picture2);

        lugares[2].add(picture_label2);
        lugares[2].add(quesada);
        lugares[2].add(quesada_info);

        JLabel alajuela = new JLabel("Alajuela");
        alajuela.setFont(title);
        alajuela.setBounds(400,0,900,100);
        JTextArea alajuela_info = new JTextArea("42,975 live here!\nYou can visit the Museo Historico Cultural Juan Santamaria and the Monument of Tomas Guardia!\nYou can eat at Pesqueria da Limonta and Miski Peru!\nNearby gas stations are Santa Anita Ala Gas and Delta Alajuela");
        alajuela_info.setFont(paragraph);
        alajuela_info.setBounds(40,150,900,120);
        JLabel picture_label3 = new JLabel();
        picture_label3.setBounds(50,310,900,500);
        ImageIcon picture3 = new ImageIcon("imagenes/alajuela.png");
        picture_label3.setIcon(picture3);

        lugares[3].add(picture_label3);
        lugares[3].add(alajuela);
        lugares[3].add(alajuela_info);

        JLabel heredia = new JLabel("Heredia");
        heredia.setFont(title);
        heredia.setBounds(400,0,900,100);
        JTextArea heredia_info = new JTextArea("18,697 live here!\nYou can visit the Fortin and Palacio de los Deportes!\nYou can eat at La Candelaria and Estadero Bistro & Cafe!\nNearby gas stations are Llantera el Pana and Total Gas Station");
        heredia_info.setFont(paragraph);
        heredia_info.setBounds(40,150,900,120);
        JLabel picture_label4 = new JLabel();
        picture_label4.setBounds(50,310,900,500);
        ImageIcon picture4 = new ImageIcon("imagenes/heredia.png");
        picture_label4.setIcon(picture4);

        lugares[4].add(picture_label4);
        lugares[4].add(heredia);
        lugares[4].add(heredia_info);

        JLabel santa_cruz = new JLabel("Santa Cruz");
        santa_cruz.setFont(title);
        santa_cruz.setBounds(400,0,900,100);
        JTextArea santa_cruz_info = new JTextArea("21,544 live here!\nYou can visit the Parque Bernabela Ramos and Parque Nacional Diria!\nYou can eat at Restaurante D’Leo Santa Cruz and El Marino Real!\nNearby gas stations are Gascentro Santa Cruz and Gasolinera JSM");
        santa_cruz_info.setFont(paragraph);
        santa_cruz_info.setBounds(40,150,900,120);
        JLabel picture_label5 = new JLabel();
        picture_label5.setBounds(50,310,900,500);
        ImageIcon picture5 = new ImageIcon("imagenes/santa_cruz.png");
        picture_label5.setIcon(picture5);

        lugares[5].add(picture_label5);
        lugares[5].add(santa_cruz);
        lugares[5].add(santa_cruz_info);

        JLabel palmares = new JLabel("Palmares");
        palmares.setFont(title);
        palmares.setBounds(400,0,900,100);
        JTextArea palmares_info = new JTextArea("3,599 live here!\nYou can visit the Parroquia Nuestra Senora de Las Mercedes and Parque Simon Ruiz Elizondo!\nYou can eat at Restaurante El Hidalgo and La Pataquena!\nNearby gas stations are Servicentro La Bomba Tres Puentes and Servicentro A.V. Palmares");
        palmares_info.setFont(paragraph);
        palmares_info.setBounds(40,150,900,120);
        JLabel picture_label6 = new JLabel();
        picture_label6.setBounds(50,310,900,500);
        ImageIcon picture6 = new ImageIcon("imagenes/palmares.png");
        picture_label6.setIcon(picture6);

        lugares[6].add(picture_label6);
        lugares[6].add(palmares);
        lugares[6].add(palmares_info);

        JLabel limon = new JLabel("Limon");
        limon.setFont(title);
        limon.setBounds(400,0,900,100);
        JTextArea limon_info = new JTextArea("61,072 live here!\nYou can visit the Playa Bonita and Vargas Park!\nYou can eat at Restaurante Kalisi and Maestros Wine & Grill!\nNearby gas stations are Guapiles El Progreso and Total");
        limon_info.setFont(paragraph);
        limon_info.setBounds(40,150,900,120);
        JLabel picture_label7 = new JLabel();
        picture_label7.setBounds(50,310,900,500);
        ImageIcon picture7 = new ImageIcon("imagenes/limon.png");
        picture_label7.setIcon(picture7);

        lugares[7].add(picture_label7);
        lugares[7].add(limon);
        lugares[7].add(limon_info);

        JLabel san_jose = new JLabel("San Jose");
        san_jose.setFont(title);
        san_jose.setBounds(400,0,900,100);
        JTextArea san_jose_info = new JTextArea("342,188 live here!\nYou can visit the Museo Nacional de Costa Rica and Plaza de la Cultura!\nYou can eat at La 22 Gastronomia and Cafe Rojo!\nNearby gas stations are Gas LP and Servicentro Las Avenidas");
        san_jose_info.setFont(paragraph);
        san_jose_info.setBounds(40,150,900,120);
        JLabel picture_label8 = new JLabel();
        picture_label8.setBounds(50,310,900,500);
        ImageIcon picture8 = new ImageIcon("imagenes/san_jose.png");
        picture_label8.setIcon(picture8);

        lugares[8].add(picture_label8);
        lugares[8].add(san_jose);
        lugares[8].add(san_jose_info);

        JLabel cartago = new JLabel("Cartago");
        cartago.setFont(title);
        cartago.setBounds(400,0,900,100);
        JTextArea cartago_info = new JTextArea("156,600 live here!\nYou can visit the Basilica de Nuestra Senora de los Angeles and Ruinas de Cartago!\nYou can eat at La Ventanita Criolla and Area 27 Street Food!\nNearby gas stations are Delta El Molino and Estacion de Servicio Los Angeles");
        cartago_info.setFont(paragraph);
        cartago_info.setBounds(40,150,900,120);
        JLabel picture_label9 = new JLabel();
        picture_label9.setBounds(50,310,900,500);
        ImageIcon picture9 = new ImageIcon("imagenes/cartago.png");
        picture_label9.setIcon(picture9);

        lugares[9].add(picture_label9);
        lugares[9].add(cartago);
        lugares[9].add(cartago_info);

        JLabel turrialba = new JLabel("Turrialba");
        turrialba.setFont(title);
        turrialba.setBounds(400,0,900,100);
        JTextArea turrialba_info = new JTextArea("26,680 live here!\nYou can visit the Catarata La Muralla and Mirador de El Ceibo!\nYou can eat at Wok & Roll and El Sabor Turrialbeno!\nNearby gas stations are Estacion de Servicio TRANCARTAGI and Servicentro JSM");
        turrialba_info.setFont(paragraph);
        turrialba_info.setBounds(40,150,900,120);
        JLabel picture_label10 = new JLabel();
        picture_label10.setBounds(50,310,900,500);
        ImageIcon picture10 = new ImageIcon("imagenes/turrialba.png");
        picture_label10.setIcon(picture10);

        lugares[10].add(picture_label10);
        lugares[10].add(turrialba);
        lugares[10].add(turrialba_info);

        JLabel orotina = new JLabel("Orotina");
        orotina.setFont(title);
        orotina.setBounds(400,0,900,100);
        JTextArea orotina_info = new JTextArea("9,664 live here!\nYou can visit the Choco Tour Costa Rica and Quinta Orotina!\nYou can eat at Marisqueria Placeres del Mar and La Hoja Verde!\nNearby gas stations are Centro de Servicio La Estacion De Jesus and Servicentro Demer");
        orotina_info.setFont(paragraph);
        orotina_info.setBounds(40,150,900,120);
        JLabel picture_label11 = new JLabel();
        picture_label11.setBounds(50,310,900,500);
        ImageIcon picture11 = new ImageIcon("imagenes/orotina.png");
        picture_label11.setIcon(picture11);

        lugares[11].add(picture_label11);
        lugares[11].add(orotina);
        lugares[11].add(orotina_info);

        JLabel escazu = new JLabel("Escazu");
        escazu.setFont(title);
        escazu.setBounds(400,0,900,100);
        JTextArea escazu_info = new JTextArea("11,984 live here!\nYou can visit the Mirador Valle Verde and Avenida Escazu!\nYou can eat at Budare’s Venezuelan Experience and The Pub!\nNearby gas stations are Delta San Rafael de Escazu and La Favorita y Gas Lp");        
        escazu_info.setFont(paragraph);
        escazu_info.setBounds(40,150,900,120);
        JLabel picture_label12 = new JLabel();
        picture_label12.setBounds(50,310,900,500);
        ImageIcon picture12 = new ImageIcon("imagenes/escazu.png");
        picture_label12.setIcon(picture12);

        lugares[12].add(picture_label12);
        lugares[12].add(escazu);
        lugares[12].add(escazu_info);

        JLabel parrita = new JLabel("Parrita");
        parrita.setFont(title);
        parrita.setBounds(400,0,900,100);
        JTextArea parrita_info = new JTextArea("16,115 live here!\nYou can visit the Pura Vida Tours & Transfers and Playa Palo Seco!\nYou can eat at AraVe and Soda Paya!\nNearby gas stations are Gasolinera Costanera Sur and Gasolinera Paquita");
        parrita_info.setFont(paragraph);
        parrita_info.setBounds(40,150,900,120);
        JLabel picture_label13 = new JLabel();
        picture_label13.setBounds(50,310,900,500);
        ImageIcon picture13 = new ImageIcon("imagenes/parrita.png");
        picture_label13.setIcon(picture13);

        lugares[13].add(picture_label13);
        lugares[13].add(parrita);
        lugares[13].add(parrita_info);

        JLabel puntarenas = new JLabel("Puntarenas");
        puntarenas.setFont(title);
        puntarenas.setBounds(400,0,900,100);
        JTextArea puntarenas_info = new JTextArea("410,929 live here!\nYou can visit the Faro de Puntarenas and Parque Marino del Pacifico!\nYou can eat at Josefina Restaurante & Cafe and Maes Grill!\nNearby gas stations are Delta Puntarenas and Trova Servicentro");
        puntarenas_info.setFont(paragraph);
        puntarenas_info.setBounds(40,150,900,120);
        JLabel picture_label14 = new JLabel();
        picture_label14.setBounds(50,310,900,500);
        ImageIcon picture14 = new ImageIcon("imagenes/puntarenas.png");
        picture_label14.setIcon(picture14);

        lugares[14].add(picture_label14);
        lugares[14].add(puntarenas);
        lugares[14].add(puntarenas_info);

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
        information.setBounds(22, -26, 200, 100);
        information.setFont(titlesFont);
        panelNavegacionLugar.add(information);

        JPanel travel_plan = new JPanel();
        travel_plan.setBounds(0,800,1300,1000);
        travel_plan.setLayout(null);
        travel_plan.setBackground(new Color(102,201,97));

        JLabel from = new JLabel("From:");
        from.setBounds(50, 0, 100, 100);
        from.setFont(buttonsFont);
        JLabel go_to = new JLabel("Go to:");
        go_to.setBounds(300, 0, 100, 100);
        go_to.setFont(buttonsFont);
        JLabel delays = new JLabel("Delays?");
        delays.setBounds(600, 0, 100, 100);
        delays.setFont(buttonsFont);

        from_field.setBounds(30, 80, 200, 30);
        goto_field.setBounds(280, 80, 200, 30);
        delays_field.setBounds(580, 80, 200, 30);

        JButton go = new JButton("Let's go");
        go.setBounds(850,50,120,65);
        go.setFont(buttonsFont);
        go.addActionListener(e -> {calculate_travel();});

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

    public void calculate_travel() {
        String[] information = {from_field.getText(), goto_field.getText()};
        JOptionPane.showInternalMessageDialog(null, "It should take you " + "to arrive to " + information[1] + " from " + information[0], "test", JOptionPane.INFORMATION_MESSAGE);
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
