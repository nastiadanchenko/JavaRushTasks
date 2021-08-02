package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.CurrencyManipulator;
import com.javarush.task.task26.task2613.CurrencyManipulatorFactory;

class DepositCommand implements Command {
    @Override
    public void execute() {

        ConsoleHelper.writeMessage("Deposit:");
        String currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator manipulatorByCurrencyCode = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);

        while (true) {
            String[] digits = ConsoleHelper.getValidTwoDigits(currencyCode);
            try {
                int denomination = Integer.parseInt(digits[0]);
                int count = Integer.parseInt(digits[1]);
                manipulatorByCurrencyCode.addAmount(denomination, count);
                ConsoleHelper.writeMessage(String.format("%d %s was deposited successfully", (denomination * count), currencyCode));
                break;
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage("Пожалуйста введите корректные данные.");
            }
        }

    }
}
