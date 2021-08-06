package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.CurrencyManipulator;
import com.javarush.task.task26.task2613.CurrencyManipulatorFactory;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;
import com.javarush.task.task26.task2613.exception.NotEnoughMoneyException;

import java.util.Map;

class WithdrawCommand implements Command {
    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage("Withdraw: ");

        String currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);

        while (true) {
            try {
                ConsoleHelper.writeMessage("Введите сумму");
                String str = ConsoleHelper.readString();

                if (str == null) {
                    ConsoleHelper.writeMessage("Введите корректную сумму");
                } else {
                    try {
                        int expectedAmount = Integer.parseInt(str);

                        if (manipulator.isAmountAvailable(expectedAmount)) {
                            Map<Integer, Integer> map = manipulator.withdrawAmount(expectedAmount);
                            map.entrySet()
                                    .stream()
                                    .sorted()
                                    .forEach((k) -> ConsoleHelper.writeMessage(String.format("\t%d - %d", k.getKey(), k.getValue())));
                            break;
                        } else {
                            ConsoleHelper.writeMessage("Не достаточно средств");
                        }
                    } catch (NumberFormatException e) {
                        ConsoleHelper.writeMessage("Введите корректную сумму");
                    }
                }
            } catch (NotEnoughMoneyException e) {
                ConsoleHelper.writeMessage("Введите корректную сумму");
            }
        }

    }
}
