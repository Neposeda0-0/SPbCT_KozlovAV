package com.company;

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class AppDemo extends Applet
{
    Button btReady; // Поле btReady хранит ссылку на кнопку с надписью Ready
    // В полях chbox1 и chbox2 записаны ссылки на переключатели с независимой
    // фиксацией, которые используются для активизации однострочных
    // текстовых полей
    Checkbox chbox1;
    Checkbox chbox2;
    // Поле grRadio хранит ссылку на группу переключателей с зависимой фиксацией,
    //определяющих режимы работы Mode 1, Mode 2 и Mode 3:
    CheckboxGroup grRadio;
    // Ссылки на эти переключатели находятся в следующих трех полях
    Checkbox rd1;
    Checkbox rd2;
    Checkbox rd3;
    // В поле ch1 хранится ссылка на список, предназначенный для выбора цвета
    Choice ch1;
    //Слева от однострочных полей редактирования в нашем окне имеются подписи,
    //реализованные как объекты класса Label. Ссылки на эти объекты находятся
    //в полях lbFirstName и lbSecondName
    Label lbFirstName;
    Label lbSecondName;
    TextField txtFirstName; // ссылка на многострочное текстовое поле хранится в поле
    TextField txtSecondName; // с именем txtFirstName и txtSecondName
    TextArea  txta;
    // Метод init занимается созданием компонент и добавлением их в окно апплета.
    // Кроме того, этот метод изменяет цвет фона окна апплета и окон добавляемых
    // компонент.
    // Прежде всего метод init создает два переключателя с независимой фиксацией,
    // два объекта класса Label и два однострочных поля редактирования текста
    public void init()
    {
        chbox1 = new Checkbox("First");
        add(chbox1);
        lbFirstName =  new Label("Enter your first name:");
        add(lbFirstName);
        txtFirstName = new TextField(" ", 30);
        add(txtFirstName);
        chbox2 = new Checkbox("Second");
        add(chbox2);
        lbSecondName = new Label("Enter your second name:");
        add(lbSecondName);
        txtSecondName = new TextField(" ", 30);
// Поля создаются при помощи конструкторов, а добавляются в окно апплета
// методом add. Согласно схемы расположения компонент, установленой по
// умолчанию, добавляемые компоненты размещаются   сверху вниз и слева
// направо.

        add(txtSecondName);
// Для группы переключателей с зависимой фиксацией мы создаем объект
// класса CheckboxGroup
        grRadio = new CheckboxGroup();
        rd1 = new Checkbox("Mode 1",  grRadio, true);
        rd2 = new Checkbox("Mode 2",  grRadio, false);
        rd3 = new Checkbox("Mode 3",  grRadio, false);
        add(rd1);  //Переключатели добавляются в окно апплета при помощи метода add
        add(rd2);
        add(rd3);
        ch1 = new Choice();  // Список цветов создается как объект класса Choice
        ch1.addItem("White");
        ch1.addItem("Green");
        ch1.addItem("Yellow");
        add(ch1); // Вслед за этим мы добавляем сформированный список в окно апплета
        setBackground(Color.yellow);
// В этом случае метод вызывается для текущего объекта, то есть для нашего
//  апплета. Чтобы установить цвет фона в окнах компонент, мы вызываем метод
// setBackground для соответствующих объектов
        lbFirstName.setBackground(Color.yellow);
        lbSecondName.setBackground(Color.yellow);
        rd1.setBackground(Color.yellow);
        rd2.setBackground(Color.yellow);
        rd3.setBackground(Color.yellow);
        chbox1.setBackground(Color.yellow);
        chbox2.setBackground(Color.yellow);
// Многострочное текстовое поле создается как объект класса TextArea.
// В нем 6 строк и 45 столбцов
        txta = new TextArea("", 6, 45);
        add(txta);
        txta.setBackground(Color.white);
// последнее что делает метод init перед тем как вернуть управление,
// - создает кнопку с надписью Ready и добавляет ее в окно апплета
        btReady = new Button("Ready");
        add(btReady);
    }
    public String getAppletInfo()
    {
        return "Name: FormDemo";
    }
    public void paint(Graphics g)
    {
        Dimension dimAppWndDimension =
                getSize();
        g.setColor(Color.black);
        g.drawRect(0, 0,
                dimAppWndDimension.width  - 1,
                dimAppWndDimension.height - 1);
    }
    // В начале своей работы метод action определяет, какой компонент
    // вызвал событие. Для этого анализируется поле evt.target:
    public boolean action(Event evt,  Object obj)
    {
        Button btn;
        String str1, str2;
        if(evt.target instanceof Button)
        {
// Наш метод action обрабатывает события, вызываемые объектами классов
// Button и Choice. Если событие вызвано компонентом, относящимся к
// какому-либо другому классу, метод возвращает значение false. Этим он
// сигнализирует, что обработка события не выполнялась.
// В случае успешной обработки события метод action возвращает значение true.
// Если событие вызвано кнопкой, наш метод action проверяет, какой именно.
//  Обработка выполняется только в том случае, если через поле evt.target
// передается ссылка на кнопку btReady:
            if(evt.target.equals(btReady))
            {
// В противном случае метод action возвращает значение false, отказываясь от
// обработки события. Что делает обработчик события, создаваемого кнопкой?
// Прежде всего, он сохраняет ссылку на кнопку в рабочей переменной
// (просто для того чтобы показать, как это делается):
                btn = (Button)evt.target;
//Далее наш обработчик события извлекает текстовые строки из однострочных
//текстовых полей, вызывая для этого метод getText. Эти строки записываются в
//рабочие переменные str1 и str2
                str1 = txtFirstName.getText();
                str2 = txtSecondName.getText();
// Затем метод action проверяет состояние переключателей с независимой
// фиксацией chbox1 и chbox2. Если они включены, содержимое соответствующих
// временных переменных добавляется в многострочное текстовое поле txta:

                if(chbox1.getState())
                    txta.append(str1);
                if(chbox2.getState())
                    txta.append(str2);
// Аналогичным образом проверяется состояние переключателей с зависимой
// фиксацией
                if(rd1.getState())
                    txta.append("\nMode 1\n");
                if(rd2.getState())
                    txta.append("\nMode 2\n");
                if(rd3.getState())
                    txta.append("\nMode 3\n");
            }
            else
            {
                return false;
            }
            return true;
        }
        else if(evt.target instanceof Choice)
        {
// Если событие вызвано списокм цветов ch1, то метод action определяет, какая
// строка списка стала выделенной и устанавливает в многострочном поле
// редактирования соответствующий цвет фона. Для определения выделенной
// строки применяется метод getSelectedIndex
            if(evt.target.equals(ch1))
            {
                if(ch1.getSelectedIndex() == 0)
                    txta.setBackground(Color.white);
                if(ch1.getSelectedIndex() == 1)
                    txta.setBackground(Color.green);
                if(ch1.getSelectedIndex() == 2)
                    txta.setBackground(Color.yellow);
            }
        }
        return false;
    }
}
