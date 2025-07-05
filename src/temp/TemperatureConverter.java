package temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setLayout(new FlowLayout());

        // Tạo các thành phần
        JLabel celsiusLabel = new JLabel("Celsius");
        JTextField celsiusField = new JTextField(10);
        JLabel fahrenheitLabel = new JLabel("Fahrenheit");
        JTextField fahrenheitField = new JTextField(10);
        fahrenheitField.setEditable(false);  // Chỉ hiển thị, không nhập được

        // Thêm sự kiện chuyển đổi
        celsiusField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(celsiusField.getText());
                    double fahrenheit = celsius * 9 / 5 + 32;
                    fahrenheitField.setText(String.format("%.1f", fahrenheit));
                } catch (NumberFormatException ex) {
                    fahrenheitField.setText("Invalid");
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(celsiusLabel);
        frame.add(celsiusField);
        frame.add(fahrenheitLabel);
        frame.add(fahrenheitField);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}
