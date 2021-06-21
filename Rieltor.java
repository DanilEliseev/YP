package ychebka;

public class Rieltor {
    private String FIO;
    private String Number;
    private String Passport;
    private String Email;
    private String Adresd;

    public void setFIO(String FIO) {

        this.FIO = FIO;
    }

    public void setNumber(String Number) {

        this.Number = Number;
    }

    public void setPassport(String Passport){
        this.Passport = Passport;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }
    
      public void setAdresd(String Adresd) {

        this.Adresd = Adresd;
    }


    public String getFIO(){
        return FIO;
    }

    public String getNumber () {
        return Number;
    }

    public String getPassport(){

        return Passport;
    }
    public String getEmail() {
        return Email = Email;
    }
    
      public String getAdresd(){
        return Adresd;
    }


    public void printAboutObject()
    {
        System.out.println("\nФамилия имя очество клиента: " +FIO);
        System.out.println("Номер телефона: " +Number);
        System.out.println("Пасспортные данные: " +Passport);
        System.out.println("Email: " +Email);
        System.out.println("Адрес: " +Adresd);
        System.out.println();
    }




    Rieltor (String FIO, String Number, String Passport, String Email, String Adresd)
    {
        this.FIO = FIO;
        this.Number = Number;
        this.Passport = Passport;
        this.Email  = Email;
        this.Adresd = Adresd;

    }
}
