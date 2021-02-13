package VideoCourse.comporation.localInnerClass;

public class Local {
    public static void main(String[] args) {
        Math math= new Math();
        math.getResult();

    }
}
class Math{
    public void getResult(){
        class Delenie{

            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDellitel() {
                return delitel;
            }

            public void setDellitel(int dellitel) {
                this.delitel = dellitel;
            }
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                return delimoe%delitel;
            }

        }
        Delenie del= new Delenie();

        del.setDellitel(4);
        del.setDelimoe(21);
        System.out.println(del.getChastnoe());
        System.out.println(del.getOstatok());


    }
}