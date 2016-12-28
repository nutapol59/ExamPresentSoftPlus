package formatting.Number;


import java.text.DecimalFormat;

//https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

public class DecimalFormatDemo {
    public static  void customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + "  " + pattern + "  " + output);
    }

    public static  void main(String[] args) {  //# จะดูตามเลขที่เราใส่  0 จะ fix ถ้าใส่ ตัวเลขน้อยกว่า format ที่กำหนด 0 จะติดมาด้วย

        customFormat("###,###.###", 12889696.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 999.9);
        customFormat("$###,###.###", 12345.67);
    }
}
