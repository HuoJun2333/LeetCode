import java.util.ArrayList;
import java.util.List;

/**
 * @author xiexin
 * @create 2020-04-20 12:44 下午
 */
public class ByteCode {
    public static void main(String[] args) {
        boolean condition = true;
        Double value1 = 1.0D;
        Double value2 = 2.0D;
        Double value3 = null;
        Double result;
//        Double result = condition ? value1 * value2 : value3;
        if (condition){
            result = value1 * value2;
        } else {
            result = value3;
        }
        System.out.println(result + "   ");
        ArrayList<test> a = new ArrayList();
        ArrayList<test> b = new ArrayList();
        for (test aa : a){
            //说明普通字段或者集合，值得进一步比较
            if (aa.getPid() == 0){
                for (test bb : b){
                    //说明普通字段或者集合，值得进一步比较
                    if(bb.getPid() == 0){
                        //说明相同节点的相同普通字段或集合
                        if (aa.getDictNo().equals(bb.getDictNo()) && aa.getNodeNo().equals(bb.getNodeNo())){
                            if ("List".equals(aa.getType())) {
                                List<test> checked = compare(aa.getListParams(), bb.getListParams());
                            } else{
                            }
                        }
                    }
                }
            }
        }
    }
    private static List<test> compare(List<test> a, List<test> b){
        for (test aa : a){
            if (aa.getPid() == 0){
                for (test bb : b){
                    if(bb.getPid() == 0){
                        if (aa.getDictNo().equals(bb.getDictNo()) && aa.getNodeNo().equals(bb.getNodeNo())){

                        }
                    }
                }
            }
        }
        return a;
    }
}
class test{
    private int id;
    private int pid;
    private String type;
    private String dictNo;
    private String nodeNo;
    private List<test> listParams;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDictNo() {
        return dictNo;
    }

    public void setDictNo(String dictNo) {
        this.dictNo = dictNo;
    }

    public String getNodeNo() {
        return nodeNo;
    }

    public void setNodeNo(String nodeNo) {
        this.nodeNo = nodeNo;
    }

    public List<test> getListParams() {
        return listParams;
    }

    public void setListParams(List<test> listParams) {
        this.listParams = listParams;
    }
}
