/**
 * @author xiexin
 * @create 2020-04-10 10:48 上午
 */
class Person{
    String age;

    String sex;

    public Person(String age, String sex){
        this.age = age;
        this.sex =sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
public class Test {
    public static void main(String[] args) {
        System.out.println(checkDict("version"));

//        ArrayList<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("3");
//        list.add("2");
//        list.add("5");
//        ArrayList<Person> people = new ArrayList<>();
//        Person a = new Person("12", "a");
//        Person b = new Person("2", "b");
//        Person c = new Person("1", "c");
//        Person d = new Person("11", "d");
//        Person e = new Person("15", "e");
//        people.add(a);
//        people.add(b);
//        people.add(c);
//        people.add(d);
//        people.add(e);
//        Collections.sort(people,new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                if(o1 == null || o2 == null){
//                    return -1;
//                }
//                if(o1.age.length() > o2.age.length()){
//                    return 1;
//                }
//                if(o1.age.length() < o2.age.length()){
//                    return -1;
//                }
//                if(o1.age.compareTo(o2.age) > 0){
//                    return 1;
//                }
//                if(o1.age.compareTo(o2.age) < 0){
//                    return -1;
//                }
//                if(o1.age.compareTo(o2.age) == 0){
//                    return 0;
//                }
//                return 0;
//            }
//        });
//        for (Person po : people){
//            System.out.println(po.getAge());
//        }
//        for(String s:list){
//            System.out.println(s);
//        }
//        String a = 2+"";
//        Integer b = 2;
//        System.out.println(a.equals(b+""));
//        Person a = new Person(18, "男");
//        Person b = a;
//        b.setAge(25);
//        System.out.println(b.getAge());
//        System.out.println(a.getAge());
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        ListNode l3 = l2;
//        l3.val = 4;
//        System.out.println(l2.val);
//        Integer a = new Integer(3);
//        Integer b = a;
//        b = 4;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 31;
//        int ret = 0;
//        while (n != 0) {
//            n &= n-1;
//            ret ++;
//        }
//        System.out.println(ret);
//        Integer test = -2;
//        if( -2 == test){
//            System.out.println("en");
//        }

//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
//
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//
//        java.util.Date time=null;
//        try {
//            time= sdf.parse(sdf.format(new Date()));
//            System.out.println(time);
//        } catch (ParseException e) {
//
//            e.printStackTrace();
//        }
    }
    public static boolean checkDict(String jsonStr) {
        boolean flag = false;
        switch (jsonStr){
            case "version":
            case "traceId":
            case "nodeId":
            case "serviceFramework":
            case "code":
            case "message":
                break;
            default:
                flag = true;
                break;
        }
        return flag;
    }
}
