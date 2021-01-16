public class StringManipulator{
    public static String trimAndConcat(String string1, String string2){
        return string1.trim().concat(string2.trim());
    }

    public static Integer getIndexOrNull(String val, char c){
        int index = val.indexOf(c);
        if (index == -1){
            return null;
        }else{
            return index;
        }
    }

    public static Integer getIndexOrNull(String val1, String val2){
        int index2 = val1.indexOf(val2);
        if (index2 == -1){
            return null;
        }else{
            return index2;
        }
    }
    public String concatSubstring(String name1, int val1, int val2, String name2){
        String result2 = name1.substring(val1, val2);
        return result2.concat(name2);
    }
}