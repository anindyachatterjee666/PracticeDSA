package com.dsa.dsapractice.test;

interface Logger {
    void log(String msg);
}

class Console implements Logger {

    @Override
    public void log(String msg){
        System.out.println("Console : " + msg);
    }
}


class Database implements Logger {

    @Override
    public void log(String msg){
        System.out.println("Datebase : " + msg);
    }
}


class OperatingSystem implements Logger {

    @Override
    public void log(String msg){
        System.out.println("OperatingSystem : " + msg);
    }
}


class LoggerFactory{
    public static Logger getLogger(String type){
        return switch (type){
            case "console" -> new Console();
            case "Database" -> new Database();
            case "OperatingSystem" -> new Database();
            default -> throw new IllegalArgumentException("Not Matching");
        };
    }
}

public class Test2 {

    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger("console");
        log.log("Console Log");
    }
}
