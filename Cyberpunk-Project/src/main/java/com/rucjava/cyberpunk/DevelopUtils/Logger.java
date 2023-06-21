package com.rucjava.cyberpunk.DevelopUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    private static OutputType outputType;

    private static final String CommonLoggerFilePath = "../../../Output/warning-logger-file.txt";
    private static final String WarningLoggerFilePath = "../../../Output/warning-logger-file.txt";
    private static final String ErrorLoggerFilePath = "../../../Output/error-logger-file.txt";

    private static File commonLoggerFile;
    private static File warningLoggerFile;
    private static File errorLoggerFile;

    public static FileWriter commonLoggerFileWriter;
    public static FileWriter warningLoggerFileWriter;
    public static FileWriter errorLoggerFileWriter;

    static {
        // initialize logger file, this is a static object
        commonLoggerFile = new File(CommonLoggerFilePath);
        warningLoggerFile = new File(WarningLoggerFilePath);
        errorLoggerFile = new File(ErrorLoggerFilePath);
        try {
            commonLoggerFileWriter = new FileWriter(commonLoggerFile);
            warningLoggerFileWriter = new FileWriter(warningLoggerFile);
            errorLoggerFileWriter = new FileWriter(errorLoggerFile);
        } catch (IOException e) {
            System.out.println("Logger: " + LevelType.ERROR.toString() + " -> logger file is not exist !!!");
        }
    }

    public static void setOutputType(OutputType loggerType) {
        Logger.outputType = loggerType;
    }

    public static OutputType getOutputType() {
        return outputType;
    }

    private Logger() {} // do nothing

    /**
     * 记录程序输出
     * @param classTag：类名
     * @param message：信息
     * @param levelType：报告级别，有警告、错误和常规报告
     */
    public static void log(String classTag, String message, LevelType levelType) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String timeTag = formatter.format(calendar.getTime());
        String logInfo = classTag + ": " + timeTag + " | " + levelType.toString() + " -> " + message;
        if (outputType == OutputType.STDOUT) {
            System.out.println(logInfo);
        }
        else {
            try {
                switch (levelType) {
                    case ERROR -> {
                        errorLoggerFileWriter.write(logInfo + "\n");
                        break;
                    }
                    case COMMON -> {
                        commonLoggerFileWriter.write(logInfo + "\n");
                        break;
                    }
                    case WARNING -> {
                        warningLoggerFileWriter.write(logInfo + "\n");
                        break;
                    }
                    default -> { break; }
                }
            } catch (IOException e) {
                System.out.println("Logger: " + LevelType.ERROR.toString() + " -> logger file is not exist !!!");
            }
        }
    }

    public static void close() {
        try {
            commonLoggerFileWriter.close();
            warningLoggerFileWriter.close();
            errorLoggerFileWriter.close();
        } catch (IOException e) {
            System.out.println("Logger: " + LevelType.ERROR.toString() + " -> logger is unable to close !!!");
        }
    }
}
