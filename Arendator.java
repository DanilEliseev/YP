package ychebka;

public class Arendator {
    private String FIO;
    private String Telefone;
    private String Adress;
    private String Email;
    private String Passport;

    public void setFIO(String FIO) {

        this.FIO = FIO;
    }

    public void setTelefone(String Telefone) {

        this.Telefone = Telefone;
    }

    public void setAdress(String Adress){
        this.Adress = Adress;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public void setPassport(String Passport) {

        this.Passport = Passport;
    }

    public String getFIO(){
        return FIO;
    }

    public String getTelefone () {
        return Telefone;
    }

    public String getAdress(){

        return Adress;
    }
    public String getEmail() {
        return Email = Email;
    }
    
     public String getPassport() {
        return Passport = Passport;
    }

    public void printAboutObject()
    {
        System.out.println("Название компании: " +FIO);
        System.out.println("Контактный номер: " +Telefone);
        System.out.println("Алрес компании: " +Adress);
        System.out.println("Почтовый индекс компании: " +Email);
        System.out.println("Паспотрные данные: " +Passport);
        System.out.println();
    }




    Arendator (String FIO, String Telefone, String Adress, String Email, String Passport)
    {
        this.FIO = FIO;
        this.Telefone = Telefone;
        this.Adress = Adress;
        this.Email  = Email;
        this.Passport  = Passport;


    }
}
