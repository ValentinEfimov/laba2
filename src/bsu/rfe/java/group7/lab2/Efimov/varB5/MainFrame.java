package bsu.rfe.java.group7.lab2.Efimov.varB5;
import javax.swing.*;
import java.lang.*;

public class MainFrame extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 320;
    private JTextField textFieldX;
    private JTextField textFieldY;
// Текстовое поле для отображения результата,

    // как компонент, совместно используемый в различных методах
    private JTextField textFieldResult;
    // Группа радио-кнопок для обеспечения уникальности выделения в группе
    private ButtonGroup radioButtons = new ButtonGroup();
    // Контейнер для отображения радио-кнопок
    private Box hboxFormulaType = Box.createHorizontalBox();
    // Идентификатор выбранной формулы
    private int formulaId = 1;
    public Double calculate1(Double x, Double y, Double z) {
        return Math.pow(Math.cos(Math.PI*Math.pow(x,3))+Math.log(Math.pow(1+y,2)),1/4)*(Math.exp(z*z)+Math.sqrt(1/x)+Math.cos(Math.exp(y)));
    }
    // Формула №2 для рассчѐта
    public Double calculate2(Double x, Double y, Double z) {
        return Math.exp(0.5*x)/(Math.sqrt(z+y)*Math.log(Math.pow(x,z)));
    }


}
