package com.core_java.chapter_6_7;

class ErrorMsg {
    //method@ veradarcvuma objectov

    String msg[] = {
            " Ошибка вывода ",
            " Ошибка ввода ",
            " Отсутствует место на диске ",
            " Выход индекса за границы диапазона "
    };

    String getError(int i) {
        if (i >= 0 & i < msg.length) {
            return msg[i];
        } else {
            return " Не существующий код ошибки ";
        }
    }
}

public class ErrorMsgMain {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getError(5));
        System.out.println(err.getError(0));
    }
}
