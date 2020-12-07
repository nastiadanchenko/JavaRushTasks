package com.javarush.task.task36.task3601;

public class View {
    private Controller controller = new Controller();
    public void fireShowDataEvent() {
        System.out.println(this.controller.onShowDataList());
    } // view

}
