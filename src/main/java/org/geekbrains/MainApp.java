package org.geekbrains;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;

public class MainApp {

    //private static final Logger logger = Logger.getLogger("org.geekbrains.MainApp"); // при изменении имени класса привязка не сработает
        private static final Logger logger = Logger.getLogger(MainApp.class.getName());
    // можно сделать логгер и для всего проекта или пакета  private static final Logger logger = Logger.getLogger( " " );


    public static void main(String[] args) throws IOException {
        System.out.println("connection"); // пример простого логирования
       // logger.log(Level.SEVERE, "connection to Server");


        //Levels
        //OFF, SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST, ALL

       // LogManager manager = new LogManager.getLogManager();
      //  manager.readConfiguration(new FileInputStream("logging properties"));
        // можно в файле указать настройки логирования

        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new SimpleFormatter()); // Задаем формат вывода сообщения в консоль

        consoleHandler.setFilter(new Filter() {    // установили фильтр
            public boolean isLoggable(LogRecord record) {
                return record.getMessage().startsWith("TEST"); // на консоль выведется сообщение только кот начинается на "TEST"
            }
        });
        // настроим форматтер

        consoleHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return String.format(">>>>> %s %s \n", record); // задали свой формат сообщения
            }
        });

        logger.setUseParentHandlers(false);   // нужно отключить дефолтный форматтер

        logger.addHandler(consoleHandler); // добавляем Хандлер в Логгер
        logger.setLevel(Level.ALL);
        logger.severe("connection to Server");



        // Настроим Хендлер для файла
        Handler fileHandler = new FileHandler("1.log");
        logger.addHandler(fileHandler);
        logger.severe("connection to Server");





    }
}
