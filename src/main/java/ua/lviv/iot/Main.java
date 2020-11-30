package ua.lviv.iot;

import java.sql.SQLException;
import ua.lviv.iot.view.View;

public class Main {
    public static void main(String[] args) throws SQLException {
        new View().show();
    }
}