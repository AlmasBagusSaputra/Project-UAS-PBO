package pkguas.project.pbo;

import database.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import koperasi.*;

public class UASProjectPBO extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("formNasabah.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
//        dbHelper db = new dbHelper();
//        db.createTable();
//        rekeningDataModel datamodel = new rekeningDataModel();
//        Rekening rek = new Rekening(1,1);
//        Perusahaan nasabahIndividu = new Perusahaan(1,"Adiwijaya","Gisting","120",rek);
//        datamodel.addNasabah(nasabahIndividu);
    }
    
}
