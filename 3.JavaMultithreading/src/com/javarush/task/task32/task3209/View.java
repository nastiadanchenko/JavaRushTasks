package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 16.09.2020.
 */
public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();

    public View() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void init(){
        initGui();
        this.addWindowListener(new FrameListener(this));
        this.setVisible(true);

        /*initGui();
        FrameListener frameListener = new FrameListener(this);

        addWindowListener(frameListener);
        setVisible(true);*/
    }
    public void exit(){
        controller.exit();
    }
    public void initMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        MenuHelper.initFileMenu(this, jMenuBar); //file
        MenuHelper.initEditMenu(this, jMenuBar); // edit
        MenuHelper.initStyleMenu(this, jMenuBar); //style
        MenuHelper.initAlignMenu(this, jMenuBar); // align
        MenuHelper.initColorMenu(this, jMenuBar); //colorFont
        MenuHelper.initFontMenu(this, jMenuBar); // fonts
        MenuHelper.initHelpMenu(this, jMenuBar); //help

        getContentPane().add(jMenuBar, BorderLayout.NORTH);

    }
    public void initEditor(){
        htmlTextPane.setContentType("text/html");

        tabbedPane.addTab("HTML", new JScrollPane(htmlTextPane));

        tabbedPane.addTab("Текст", new JScrollPane(plainTextPane));

        tabbedPane.setPreferredSize(new Dimension(100, 100));
        tabbedPane.addChangeListener(new TabbedPaneChangeListener(this));
        this.getContentPane().add(tabbedPane, BorderLayout.CENTER);

    }
    public void initGui(){
        initMenuBar();
        initEditor();
        pack();
    }
    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void selectedTabChanged() {

    }
}
