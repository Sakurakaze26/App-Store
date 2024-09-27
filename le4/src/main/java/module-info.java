module guissica_soho {
    requires javafx.controls;
    exports guissica_soho;
    exports guissica_soho.model;
    requires com.google.gson;
    opens guissica_soho.model to com.google.gson;
}