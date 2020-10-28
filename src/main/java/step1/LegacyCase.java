package step1;

public class LegacyCase {

    public String toTable1Value(String originValue){
        if("Y".equals(originValue)){
            return "1";
        }
        return "0";
    }
    public boolean toTable2Value(String originValue){
        if("Y".equals(originValue)){
            return true;
        }
        return false;
    }
}
