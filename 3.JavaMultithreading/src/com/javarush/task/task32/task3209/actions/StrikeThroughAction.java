package com.javarush.task.task32.task3209.actions;

import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

/**
 * Created by User on 17.09.2020.
 */
public class StrikeThroughAction extends StyledEditorKit.StyledTextAction {

    public StrikeThroughAction() {
        super("Зачеркнутый");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
