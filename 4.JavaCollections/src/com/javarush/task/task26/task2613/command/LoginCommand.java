package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CashMachine;
import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.ResourceBundle;

class LoginCommand implements Command {
    private ResourceBundle validCreditCards = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.verifiedCards");
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.class.getPackage().getName() + ".resources.info_en.properties");
    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Login in: ");
        
        while (true){
            ConsoleHelper.writeMessage("Введите номер карты");
            String cardNumber = ConsoleHelper.readString();
            ConsoleHelper.writeMessage("Введите пин код");
            String pin = ConsoleHelper.readString();

            if (cardNumber == null || (cardNumber = cardNumber.trim()).length() !=12||
                    pin == null || (pin.trim()).length()!=4) {
                ConsoleHelper.writeMessage("Please specify valid credit card number - 12 digits, pin code - 4 digits.");
            }else {
                try {
                    if (validCreditCards.containsKey(cardNumber) && validCreditCards.getString(cardNumber).equals(pin)) {
                        ConsoleHelper.writeMessage(String.format("Credit card [%s] is verified successfully!", cardNumber));
                        break;
                    } else {
                        ConsoleHelper.writeMessage(String.format("Credit card [%s] is not verified.", cardNumber));
                        ConsoleHelper.writeMessage("Please try again or type 'EXIT' for urgent exiting");
                    }
                } catch (NumberFormatException e) {
                    ConsoleHelper.writeMessage("Please specify valid credit card number - 12 digits, pin code - 4 digits.");
                }
            }

        }
    }
}
