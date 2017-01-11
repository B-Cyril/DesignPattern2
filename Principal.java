import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame {

    private static final long serialVersionUID = 1L;

    public static void main (String[] args){

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                createAndShowGUI();
            }
        });
    }

    public Principal() {

        // set flow layout for the frame
        this.getContentPane().setLayout(new FlowLayout());
        Object[] elements = new Object[]{"Jaune", "Rouge"};
        JComboBox liste1 = new JComboBox(elements);
        JLabel label1 = new JLabel("Changer le thème");

        add(label1);
        add(liste1);


            themeJaune test = new themeJaune();
            add(test.getButton());

            themeRouge test2 = new themeRouge();
            add(test2.getButton());




    }

    private static void createAndShowGUI() {
        JFrame fenetre = new Principal();

        fenetre.setTitle("TP Abstract Factory");
        fenetre.setSize(400, 150);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
    }


   /* @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        final Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.LIGHTGREEN);

        but = new MarioThemeFactory().getButton();

        ObservableList<Option> options =
                FXCollections.observableArrayList(
                        Option.StarWars,
                        Option.Mario
                );

        final ComboBox comboBox = new ComboBox(options);
        comboBox.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                root.getChildren().remove(but);
                if(comboBox.getValue() == Option.Mario){
                    but = new MarioThemeFactory().getButton();
                } else {
                    but = new StarWarsThemeFactory().getButton();
                }
                root.getChildren().add(but);
            }
        });


        comboBox.setLayoutX(200);
        comboBox.setLayoutY(100);

        root.getChildren().add(but);
        root.getChildren().add(comboBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }*/

}
