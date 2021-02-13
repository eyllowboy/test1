package Task3;

public class Task32 {
    public static void main(String[] args) {
        try{checkNumber(-150);}
        catch (CheckException e) {
            e.printStackTrace();
        }
    }
    static void checkNumber(int a) throws CheckException {
        if(a<0){
            throw new CheckException();
        }
        else if(a>100){
            throw new UncheckExeption();
        }
    }
}
