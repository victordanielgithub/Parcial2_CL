/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import java.util.Iterator;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Oriana
 */
public class JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("CONSUMIR RECURSOS DE WEB-SERVICE");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                

                System.out.println("CONSUMIENDO WEB-SERVICE CON POSTGRESQL");
                System.out.println("======================================");
                List<wsdl.Persona> list2 = conexionPostgreSQL();
                imprimeLista(list2);
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static void imprimeLista(List<wsdl.Persona> list){
        wsdl.Persona p = new wsdl.Persona();
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            p = new wsdl.Persona();
            p = (wsdl.Persona)iter.next();
            System.out.println("PERSONA: "+p.getIdPersona()+" - "+p.getNombre());
        }
    }
    private static java.util.List<wsdl.Persona> personaList() {
        wsdl.NewWebService_Service service = new wsdl.NewWebService_Service();
        wsdl.NewWebService port = service.getNewWebServicePort();
        return port.personaList();
    }

    private static java.util.List<wsdl.Persona> conexionPostgreSQL() {
        wsdl.NewWebService_Service service = new wsdl.NewWebService_Service();
        wsdl.NewWebService port = service.getNewWebServicePort();
        return port.conexionPostgreSQL();
    }
    
}
