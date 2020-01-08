package appLayer;

public class User {
    public boolean isValidUserCredential(String sUserName,String sUserPassword){
        if(sUserName.equals("deepak") && sUserPassword.equals("test123")){
            return true;
        }
        return false;
    }

}
