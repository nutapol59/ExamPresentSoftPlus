package Collection;

import java.util.*;

//Collection คือ interface ที่รวมสิ่งที่จะทำให้เราสามารถเก็บสมาชิกไว้ไหนตัวแปรเพียงตัวเดียว  เช่น List Set

//Map คือ การเก็บข้อมูลสมาชิกย่อยๆ โดยค่าที่เก็บ จะมี key และ value เราสามารถจะเรียกดูข้อมูลผ่าน key ได้

//Iterator เป็นตัวช่วยเอาไว้วนรอบ ดึงสมาชิกใน list set ออกมาได้
//
//        hasNext(); ไว้เช็คว่า มีตัวถัดไปมั้ย
//        next(); คือคำสั่งที่บอกว่าเราจะเอาตัวถัดไปมา


public class TestCollection {
    public static void main(String[] args){
        examList();
        examSet();
        examMap();
    }

    public static void examList() {
//        List can duplicate and it's insertion order (เรียงตามที่ใส่)
        List a = new ArrayList<>();  //other Type

        //Generic Types เป็นการกำหนด type ของ object ให้ชัดเจน
        System.out.println("============LIST==============");
        List<String> list = new ArrayList<>();
        list.add("nut");
        list.add("debaze");
        list.add("keng");
        list.add("guy");
        System.out.println(list);

//        ListIterator listIterator = list.listIterator();
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
//
//        for (int i = 0 ; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        for (String s : list) {
//            System.out.println(s);
//        }

    }

    public static void examSet() {
        System.out.println("============SET==============");
        //Set can't duplicate  Sorted auto
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(2);
        set.add(46);
        set.add(6);
        set.add(1);

//        for (Integer i: set ) {
//            System.out.println(i);
//        }

        Iterator<Integer> integerIterator = set.iterator();
//        for(; integerIterator.hasNext();){
//            System.out.println(integerIterator.next());
//        }

        while (integerIterator.hasNext()){
            Integer i = integerIterator.next();
            if(i <  4){
                System.out.println(i);
            }
        }


    }



    public static void examMap() {
        System.out.println("============MAP==============");
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"Debaze");
        map.put(1,"Nut");
        map.put(3,"Keng");
        map.put(4,"Guy");

        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()){
            Integer key = itr.next();
            String val = (String)map.get(key);
            System.out.println(key +" : "+val);
        }

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
