package com.kensoftph.textarea;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class TextAreaController implements Initializable {

    @FXML
    private Label counter;

    @FXML
    private TextArea textArea;

    @FXML
    void textAreaTyped(KeyEvent event) {
        ObservableList<CharSequence> list = textArea.getParagraphs();
        int par = list.size();
        String[] words = textArea.getText().split("\\s+");
        counter.setText("Paragraph: "+ par +" | Words: " + words.length + " | Characters: "+ textArea.getLength());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //textArea.setText("Kensoftph.com");
        //.out.println(textArea.getText());
        textArea.setWrapText(true);
    }
}
