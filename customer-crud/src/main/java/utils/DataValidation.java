package utils;

/**
 *
 * @author Daniel
 */
public class DataValidation {
    
    public static boolean isValidFields(String ...fields) {
        for(String field: fields) {
            if(field == null || "".equals(field)) return false;
        }
        
        return true;
    }
    
    public static boolean validateNumber(String number) {
        return number.matches("[0-9]+");
    }
}
