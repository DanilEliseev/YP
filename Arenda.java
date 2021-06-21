package ychebka;
public class Arenda {
    private String NazvanieTC;
    private String Floor;
    private String Office;
    private String Konder;
    private String Arendplata;
    private String Plohsad;

     public void setNazvanieTC(String NazvanieTC) {

        this.NazvanieTC = NazvanieTC;
    }
     
    public void setFloor(String Floor) {

        this.Floor = Floor;
    }

    public void setOffice(String Office) {

        this.Office = Office;
    }

    public void setKonder(String Konder) {

        this.Konder = Konder;
    }

    public void setArendplata(String Arendplata){
        this.Arendplata = Arendplata;
    }


    public void setPlohsad(String Plohsad){
        this.Plohsad = Plohsad;
    }

    public String getFloor(){

        return Floor;
    }

    public String getNazvanieTC(){

        return NazvanieTC;
    }

    public String getOffice(){
        return Office;
    }

    public String getKonder () {
        return Konder;
    }

    public String getArendplata(){

        return Arendplata;
    }
    public String getMestoprib() {
        return Plohsad = Plohsad;
    }


    public void printAboutObject()
    {
        System.out.println("Торговый центр: " +NazvanieTC);
        System.out.println("Этаж: " +Floor);
        System.out.println("Офис: " +Office);
        System.out.println("Кондиционер: " +Konder);
        System.out.println("Арендная плата: " +Arendplata);
        System.out.println("Площадь: " +Plohsad);

        System.out.println();
    }

    Arenda (String NazvanieTC, String Floor, String Office, String Konder, String Arendplata,String Plohsad)
    {
        this.NazvanieTC = NazvanieTC;
        this.Floor = Floor;
        this.Office = Office;
        this.Konder = Konder;
        this.Arendplata = Arendplata;
        this.Plohsad  = Plohsad;


    }
}
