------------------Задание 1-----------------------
----------Rectangle----------
package com.company;

public class Rectangle {
    public int sideA;
    public int sideB;
    public Rectangle(int x, int y) {
        super();
        sideA = x;
        sideB = y;
    }
    public boolean equals(Object obj) {
        if(!(obj instanceof Rectangle))
            return false;
        Rectangle ref = (Rectangle)obj;
        return (((this.sideA==ref.sideA)&&(this.sideB==ref.sideB))||
                (this.sideA==ref.sideB)&&(this.sideB==ref.sideA));
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(10,10);
        Rectangle r3 = new Rectangle(20,10);
        System.out.println("r1.equals(r1) == " + r1.equals(r1));
        System.out.println("r1.equals(r2) == " + r1.equals(r2));
        System.out.println("r1.equals(r3) == " + r1.equals(r3));
        System.out.println("r2.equals(r3) == " + r2.equals(r3));
        System.out.println("r1.equals(null) == " + r1.equals(null));
    }
}

----------Book----------
package com.company;

public class Book {
    private String title;
    private String author;
    private int pagesNumber;
    public Book(String title, String author,
                int pagesNumber) {
        super();
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }
    public static void main(String[] args) {
        Book book = new Book("Java2","Sun",1000);
        System.out.println("object is: " + book);
    }
    public String toString(){
        return "Book: " + title + " ( " + author +
                ", " + pagesNumber + " pages )";
    }
}

----------Main----------
package com.company;

public class Main {

    public static void main(String[] args) {
            int i = 1;
            byte b = 1;
            String value = "1000";
            Integer iObj = new Integer(i);
            Byte bObj = new Byte(b);
            System.out.println("while i==b is " + (i==b));
            System.out.println("iObj.equals(bObj) is " + iObj.equals(bObj));
            Long lObj = new Long(value);
            System.out.println("lObj = " +
                    lObj.toString());
            Long sum = new Long(lObj.longValue() + iObj.byteValue() + bObj.shortValue());
            System.out.println("The sum = " +
                    sum.doubleValue());
    }
}

----------Test----------
package com.company;

public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test t = new Test();
        String s1 = "Hello world !!!";
        String s2 = new String("Hello world !!!");
        System.out.println("String`s equally = " +
                (s1.equals(s2)));
        System.out.println(
                "Strings are the same = " + (s1==s2));
    }
}

----------Test2----------
package com.company;

public class Test2 {
    public static void main(String[] args) {
        Test t = new Test();
        String s = "prefix !";
        System.out.println(s);
        s = s.trim();
        System.out.println(s);
        s = s.concat(" suffix");
        System.out.println(s);
    }
}

----------Test3----------
package com.company;

public class Test3 {
    public static void main(String[] args) {
        Test t = new Test();
        String s = new String("ssssss");
        StringBuffer sb =
                new StringBuffer("bbbbbb");
        s.concat("-aaa");
        sb.append("-aaa");
        System.out.println(s);
        System.out.println(sb);
    }
}

----------VehicleStarter----------
package com.company;

interface Vehicle {
    void go();
}
class Automobile implements Vehicle {
    public void go() {
        System.out.println("Automobile go!");
    }
}
class Truck implements Vehicle {
    public Truck(int i) {
        super();
    }
    public void go() {
        System.out.println("Truck go!");
    }
}
public class VehicleStarter {
    public static void main(String[] args) {
        Vehicle vehicle;
        String[] vehicleNames = {"demo.lang.Automobile",
                "demo.lang.Truck", "demo.lang.Tank"};
        for(int i=0; i<vehicleNames.length; i++) {
            try {
                String name = vehicleNames[i];
                System.out.println("look for class for: " + name);
                Class aClass = Class.forName(name);
                System.out.println("creating vehicle...");
                vehicle = (Vehicle)aClass.newInstance();
                System.out.println("create vehicle: " + vehicle.getClass());
                vehicle.go();
            } catch(ClassNotFoundException e) {
                System.out.println("Exception: " + e);
            } catch(InstantiationException e) {
                System.out.println("Exception: " + e);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}

----------Test----------
package test;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        StringBuffer sb = new StringBuffer("aaa");
        System.out.println("Before = " + sb);
        t.doTest(sb);
        System.out.println("After = " + sb);
    }
    void doTest(StringBuffer theSb){
        theSb.append("-bbb");
    }
}

----------Задание 2-------------
----------Code0----------
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class code0 {
    public code0() {
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        System.out.println(" Initialy set date: " + sdf.format(cal.getTime()));
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        System.out.println(" Date with month changed : " + sdf.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH,30);
        System.out.println(" Date with day changed : " + sdf.format(cal.getTime()));

    }
}

----------Code1----------
  
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class code1 {
    public code1() {
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        System.out.println(" Initialy set date: " + sdf.format(cal.getTime()));
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH,30);
        System.out.println(" Date with day and month changed : " + sdf.format(cal.getTime()));
    }
}

----------Code2----------
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class code2 {

    public code2() {
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        cal.set(Calendar.HOUR_OF_DAY,19);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,00);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.add(Calendar.SECOND,75);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.add(Calendar.MONTH,1);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
    }
}


----------Code3----------
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class code3 {

    public code3() {
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        cal.set(Calendar.HOUR_OF_DAY,19);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,00);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.roll(Calendar.SECOND,75);
        System.out.println("Rule 1: " + sdf.format(cal.getTime()));
        cal.roll(Calendar.MONTH,1);
        System.out.println("Rule 2: " + sdf.format(cal.getTime()));
    }
}


----------Code4----------
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class code4 {
    public code4() {
    }
    public static void main(String[] args) {
        code4 test = new code4();
        TimeZone tz = TimeZone.getDefault();
        int rawOffset = tz.getRawOffset();
        System.out.println("Current TimeZone" + tz.getDisplayName() + tz.getID() + "\n\n");
        // Display all available TimeZones
        System.out.println("All Available TimeZones \n");
        String[] idArr = tz.getAvailableIDs();
        for(int cnt=0;cnt < idArr.length;cnt++){
            tz = TimeZone.getTimeZone(idArr[cnt]);
            System.out.println(test.padr(tz.getDisplayName() +
                    tz.getID(),64) + " raw offset=" + tz.getRawOffset() +
                    ";hour offset=(" + tz.getRawOffset()/ (1000 * 60 * 60 ) + ")");
        }
        // Display all available TimeZones same as for Moscow
        System.out.println("\n\n TimeZones same as for Moscow \n");
        idArr = tz.getAvailableIDs(rawOffset);
        for(int cnt=0;cnt < idArr.length;cnt++){
            tz = TimeZone.getTimeZone(idArr[cnt]);
            System.out.println(test.padr(tz.getDisplayName()+
                    tz.getID(),64) + " raw offset=" + tz.getRawOffset() +
                    ";hour offset=(" + tz.getRawOffset()/ (1000 * 60 * 60 ) + ")");
        }
    }
    String padr(String str,int len){
        if(len - str.length() > 0){
            char[] buf = new char[len - str.length()];
            Arrays.fill(buf,' ');
            return str + new String(buf);
        }else{
            return str.substring(0,len);
        }
    }
}

----------Code5----------
  
public class code5 extends java.util.Observable {
    private String name = "";
    public code5(String name) {
        this.name = name;
    }

    public void modify() {
        setChanged();
    }

    public String getName() {
        return name;
    }
}

----------Code6----------
import java.util.ArrayList;
import java.util.Iterator;

public class code6 {
    public code6() {
    }
    public static void main(String[] args) {
        Test t = new Test();
        ArrayList al = new ArrayList();
        al.add("First element");
        al.add("Second element");
        al.add("Third element");
        Iterator it = al.iterator();
        while(it.hasNext()) {
            System.out.println((String)it.next());
        }
        System.out.println("\n");
        al.add(2,"Insertion");
        it = al.iterator();
        while(it.hasNext()){
            System.out.println((String)it.next());
        }
    }
}

----------Code7----------
import java.util.TreeMap;

public class code7 {

    public code7() {
    }
    public static void main(String[] args) {
        Test t = new Test();
        TreeMap tm = new TreeMap();
        tm.put("key","String1");
        System.out.println(tm.get("key"));
        tm.put("key","String2");
        System.out.println(tm.get("key"));
    }
}

----------Code8----------
import java.util.*;

public class code8 {
    private class TestObject {
        private String name = "";
        public TestObject(String name) {
            this.name = name;
        }
    }
    private class MyComparator implements Comparator {
        public int compare(Object l,Object r) {
            String left = (String)l;
            String right = (String)r;
            return -1 * left.compareTo(right);
        }
    }
    public code8() {
    }

    public static void main(String[] args) {
        Test test = new Test();
        Vector v = new Vector();
        v.add("bbbbb");
        v.add("aaaaa");
        v.add("ccccc");
        System.out.println("Default elements order");
        test.dumpList(v);
        Collections.sort(v);
        System.out.println("Default sorting order");
        test.dumpList(v);
        System.out.println("Reverse sorting order with providing imlicit comparator");
        Collections.sort(v,test.new MyComparator());
        test.dumpList(v);
    }

}

----------Code9----------
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Properties;

public class code9 {
    public code9() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        Properties props = new Properties();
        StringWriter sw = new StringWriter();
        sw.write("Key1 = Value1 \n");
        sw.write(" Key2 : Value2 \r\n");
        sw.write(" Key3 Value3 \n ");
        InputStream is = new ByteArrayInputStream(sw.toString().getBytes());

        try {
            props.load(is);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        props.list(System.out);
        props.setProperty("Key1","Modified Value1");
        props.setProperty("Key4","Added Value4");
        props.list(System.out);
    }
}

----------Code10----------
import java.util.Arrays;

public class code10 {
    public code10() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        String[] arr = {"String 1","String 4",
                "String 2","String 3"};
        test.dumpArray(arr);
        Arrays.sort(arr);
        test.dumpArray(arr);
        int ind = Arrays.binarySearch(arr,
                "String 4");
        System.out.println(
                "\nIndex of \"String 4\" = " + ind);
    }

}

----------Code11----------
import java.util.StringTokenizer;

public class code11 {

    public code11() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        String toParse =
                "word1;word2;word3;word4";
        StringTokenizer st =
                new StringTokenizer(toParse,";");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

----------Code12----------
import java.util.Random;

public class code12 {
    public code12() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        Random r = new Random(100);
        // Generating the same sequence numbers
        for(int cnt=0;cnt<9;cnt++){
            System.out.print(r.nextInt() + " ");
        }
        System.out.println();
        r = new Random(100);
        for(int cnt=0;cnt<9;cnt++) {
            System.out.print(r.nextInt() + " ");
        }
        System.out.println();
        // Generating sequence of bytes
        byte[] randArray = new byte[8];
        r.nextBytes(randArray);
        test.dumpArray(randArray);
    }

}

----------Code13----------
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;

public class code13 extends ResourceBundle {

    private Hashtable res = null;
    public code13() {
        res = new Hashtable();
        res.put("TestKey","English Variant");
    }
    public Enumeration getKeys() {
        return res.keys();
    }
    protected Object handleGetObject(String key) throws
            java.util.MissingResourceException {
        return res.get(key);
    }
}

----------Code14----------
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;

public interface code14 {
    public String getBehavior();
    public String getCapital();
}


class Using {
    public Using() {
    }

    public static void main(String[] args) {
        Using u = new Using();
        ResourceBundle rb =
                ResourceBundle.getBundle("lecture.MyResourceBundle", Locale.getDefault());
        System.out.println((String) rb.getObject("Bundle description"));
        code14 be = (code14) rb.getObject("Behavior");
        System.out.println(be.getBehavior());
        System.out.println(be.getCapital());
        rb = ResourceBundle.getBundle("lecture.MyResourceBundle", new Locale("en", "EN"));
        System.out.println((String) rb.getObject("Bundle description"));
        be = (code14) rb.getObject("Behavior");
        System.out.println(be.getBehavior());
        System.out.println(be.getCapital());
    }
}

----------Code15----------
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Vector;


public class code15 {
    public code15() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        ResourceBundle rb = ResourceBundle.getBundle("experiment.MyResource", Locale.getDefault());
        Vector v = (Vector)rb.getObject("VectorKey");
        Itercator it = v.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
