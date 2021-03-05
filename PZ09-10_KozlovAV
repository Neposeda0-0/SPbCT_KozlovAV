-----------Задание 1-----------
-------test0-------
public class test0 {

    public static void main(String[] args) {

        Thread t = Thread.currentThread(); // получаем главный поток
        System.out.println(t.getName()); // main
    }
}

-------test1-------
public class test1 {
    public static void main(String[] args) {

        Thread t = Thread.currentThread(); // получаем главный поток
        System.out.println(t); // main
    }
}

-------test2-------
public class test10 {

    public static void main(String[] args) {

        CommonResource commonResource= new CommonResource();
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}

class CommonResource{

    int x=0;
}

class CountThread implements Runnable{

    CommonResource res;
    CountThread(CommonResource res){
        this.res=res;
    }
    public void run(){
        res.x=1;
        for (int i = 1; i < 5; i++){
            System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
            res.x++;
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}

-------test3-------
public class test11 {

    public static void main(String[] args) {

        CommonResource commonResource= new CommonResource();
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}

class CommonResource{

    int x;
    synchronized void increment(){
        x=1;
        for (int i = 1; i < 5; i++){
            System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
            x++;
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}

class CountThread implements Runnable{

    CommonResource res;
    CountThread(CommonResource res){
        this.res=res;
    }

    public void run(){
        res.increment();
    }
}

-------test4-------
  
public class test12 {

    public static void main(String[] args) {

        Store store=new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
// Класс Магазин, хранящий произведенные товары
class Store{
    private int product=0;
    public synchronized void get() {
        while (product<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }
    public synchronized void put() {
        while (product>=3) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }
}
// класс Производитель
class Producer implements Runnable{

    Store store;
    Producer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
// Класс Потребитель
class Consumer implements Runnable{

    Store store;
    Consumer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}

-------test5-------
import java.util.concurrent.Semaphore;

public class test13 {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1); // 1 разрешение
        CommonResource res = new CommonResource();
        new Thread(new CountThread(res, sem, "CountThread 1")).start();
        new Thread(new CountThread(res, sem, "CountThread 2")).start();
        new Thread(new CountThread(res, sem, "CountThread 3")).start();
    }
}
class CommonResource{

    int x=0;
}

class CountThread implements Runnable{

    CommonResource res;
    Semaphore sem;
    String name;
    CountThread(CommonResource res, Semaphore sem, String name){
        this.res=res;
        this.sem=sem;
        this.name=name;
    }

    public void run(){

        try{
            System.out.println(name + " ожидает разрешение");
            sem.acquire();
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){System.out.println(e.getMessage());}
        System.out.println(name + " освобождает разрешение");
        sem.release();
    }
}

-------test6-------
import java.util.concurrent.Semaphore;

public class test14 {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2);
        for(int i=1;i<6;i++)
            new Philosopher(sem,i).start();
    }
}
// класс философа
class Philosopher extends Thread
{
    Semaphore sem; // семафор. ограничивающий число философов
    // кол-во приемов пищи
    int num = 0;
    // условный номер философа
    int id;
    // в качестве параметров конструктора передаем идентификатор философа и семафор
    Philosopher(Semaphore sem, int id)
    {
        this.sem=sem;
        this.id=id;
    }

    public void run()
    {
        try
        {
            while(num<3)// пока количество приемов пищи не достигнет 3
            {
                //Запрашиваем у семафора разрешение на выполнение
                sem.acquire();
                System.out.println ("Философ " + id+" садится за стол");
                // философ ест
                sleep(500);
                num++;

                System.out.println ("Философ " + id+" выходит из-за стола");
                sem.release();

                // философ гуляет
                sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("у философа " + id + " проблемы со здоровьем");
        }
    }
}

-------test7-------
import java.util.concurrent.Phaser;

public class test15 {

    public static void main(String[] args) {

        Phaser phaser = new Phaser(1);
        new Thread(new PhaseThread(phaser, "PhaseThread 1")).start();
        new Thread(new PhaseThread(phaser, "PhaseThread 2")).start();

        // ждем завершения фазы 0
        int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");
        // ждем завершения фазы 1
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");

        // ждем завершения фазы 2
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");

        phaser.arriveAndDeregister();
    }
}

class PhaseThread implements Runnable{

    Phaser phaser;
    String name;

    PhaseThread(Phaser p, String n){

        this.phaser=p;
        this.name=n;
        phaser.register();
    }
    public void run(){

        System.out.println(name + " выполняет фазу " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); // сообщаем, что первая фаза достигнута

        System.out.println(name + " выполняет фазу " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); // сообщаем, что вторая фаза достигнута

        System.out.println(name + " выполняет фазу " + phaser.getPhase());
        phaser.arriveAndDeregister(); // сообщаем о завершении фаз и удаляем с регистрации объекты
    }
}

-----------Задание 2-----------
-------Multi-------

package com.company;
import java.applet.*;
import java.awt.*;
public class Multi extends Applet implements Runnable
{
    private Thread m_Multi = null;
    boolean going = true;

    private boolean m_fStandAlone = false;

    public static void main(String args[]) {

        MultiFrame frame = new MultiFrame("Title");
        frame.show();
        frame.hide();
        frame.resize(frame.insets().left + frame.insets().right + 320,
                frame.insets().top + frame.insets().bottom + 240);

        Multi applet_Combi = new Multi();
        frame.add("Center", applet_Combi);
        applet_Combi.m_fStandAlone = true;
        applet_Combi.init();
        applet_Combi.start();
        frame.show();
    }

    public Multi()
    {
    }

    public String getAppletInfo()
    { return "Name: CombiApplet\r\n" +
            "";
    }

    public void init()
    {
        resize(320, 240);
    }

    public void destroy()
    {
    }

    public void paint(Graphics g)
    {
        g.drawString("Running: " + Math.random(), 10, 20);
    }

    public void start()
    {
        if (m_Multi == null)
        {
            m_Multi = new Thread(this); // создание потока
            m_Multi.start(); // запуск потока
        }
    }

    public void stop()
    {
        if (m_Multi != null)
        {
            going = false;
            m_Multi = null;
        }
    }

    public void run()
    {
        while (true)
        {
            try
            {
                repaint();
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                stop();
            }
        }
    }
}


-------MultiFrame-------

package com.company;
import java.awt.*;
import java.awt.event.*;

class MultiFrame extends Frame
{

    public MultiFrame(String str)
    {   super (str);
        addWindowListener(new MyWindowAdapter());
    }

    class MyWindowAdapter extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            dispose();
            System.exit(0);
        }
    }
}


-------VertScroller-------

package com.sptktjava;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Vector;
public class VertScroller extends Applet implements Runnable, ActionListener{
    String strs[]={"First string", "Second string", "Third string"};
    // текущий размер окна апплета
    private Vector strings;
    private int count = 0;
    private int height;
    private int width;
    private Button startButton, stopButton;
    private Thread animated;
    public void update(Graphics g)
    {
        paint(g);
    }
    public void init()
    {
        strings = new Vector();
        setBackground(Color.YELLOW);
        height = getSize().height;
        width = getSize().width;
        startButton = new Button("Начало движения");
        startButton.addActionListener(this);
        add(startButton);
        stopButton = new Button("Останов движения");
        stopButton.addActionListener(this);
        add(stopButton);
    }
    public void actionPerformed(ActionEvent e)
    {
        if ( e.getSource()==startButton)
        { if(strings.size() == 0 )
        {
            getGraphics().clearRect(0,0,width,height);
            animated = new Thread(this);
            animated.start();
        }
            int x = randomInt(width/2);
            int y = randomInt(height/2);
            int deltax = 1+randomInt(10);
            int deltay = 1+randomInt(10);
            if(count<strs.length)
            {
                strings.addElement(new MyString(strs[count++],x,y,deltax,deltay));
            }
            else
            {
                strings.addElement(new MyString("Простая строка",x,y,deltax,deltay));
            }
        }
        else
        if(e.getSource()==stopButton)
        {
            strings.removeAllElements();
            animated = null;
            count = 0;
        }
        repaint();
    }
    private int randomInt(int max) {
        double x = Math.floor((double)(max+1)*Math.random()) ;
        return (int)(Math.round(x));
    }
    public void run()
    {
        Thread my = Thread.currentThread();
        while (my == animated)
        { repaint();
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            { }
        }
    }
    public void paint(Graphics g)
    {
        MyString str;
        for ( int i = 0; i < strings.size(); i++)
        {
            str =(MyString) strings.elementAt(i);
            g.setColor(getBackground());
            str.draw(g);
            str.move(width,height);
            g.setColor(Color.BLACK);
            g.setColor(getForeground());
            str.draw(g);
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Пример");
        int width = 800;
        int height = 300;
        VertScroller appl = new VertScroller ();
        appl.init();
        frame.getContentPane().add(appl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setVisible(true);
    }
}

-------MyString-------
package com.sptktjava;
import java.awt.*;
public class MyString extends Object // класс для реализации строк
{
    int x,y,deltax,deltay;
    String str;
    public MyString(String str, int x, int y, int deltax, int deltay) {
        this.x = x;
        this.y = y;
        this.deltax = deltax;
        this.deltay = deltay;
        this.str = str;
    }
    public void draw(Graphics g) {
        g.drawString(str,x,y);
    }
    public void move(int width, int height) {
        x = x+ deltax;
        y = y+deltay;
    }
}
