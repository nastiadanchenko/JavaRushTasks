package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

class ExitCommand implements Command {
    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("вы действительно хотите выйти? <y,n>");
        String answer = ConsoleHelper.readString();

        if (answer !=null && answer.equalsIgnoreCase("y")) {
            ConsoleHelper.writeMessage("Всего доброго!");
        }else {

        }

    }
}
