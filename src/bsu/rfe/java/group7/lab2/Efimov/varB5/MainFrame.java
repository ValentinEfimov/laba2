package bsu.rfe.java.group7.lab2.Efimov.varB5;
import javax.swing.*;
import java.lang.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


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
        return Math.pow(Math.cos(Math.PI * Math.pow(x, 3)) + Math.log(Math.pow(1 + y, 2)), 1 / 4) * (Math.exp(z * z) + Math.sqrt(1 / x) + Math.cos(Math.exp(y)));
    }

    // Формула №2 для рассчѐта
    public Double calculate2(Double x, Double y, Double z) {
        return Math.exp(0.5 * x) / (Math.sqrt(z + y) * Math.log(Math.pow(x, z)));
    }

    // Вспомогательный метод для добавления кнопок на панель
    private void addRadioButton(String buttonName, final int formulaId) {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                MainFrame.this.formulaId = formulaId;
            }
        });
        radioButtons.add(button);
        hboxFormulaType.add(button);


    }
}
