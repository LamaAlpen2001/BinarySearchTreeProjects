public class Benutzerprofil implements ComparableContent<Benutzerprofil>{
    private String benutzername;
    private String passwort;
    
    public Benutzerprofil(String login,String pw){
        System.out.println("Wilkommen bei E&P.inc Benutzerspeicherung. Sie wurden Gespeichert");
        passwort= pw;
        benutzername= login;

    }
    public boolean isLess(Benutzerprofil pBenutzer){
        return (this.benutzername.compareTo(pBenutzer.getBenutzername())<0);
        
    }
    public boolean isGreater(Benutzerprofil pBenutzer){
        return (this.benutzername.compareTo(pBenutzer.getBenutzername())>0);
    }
    public boolean isEqual(Benutzerprofil pBenutzer){
        return (this.benutzername.compareTo(pBenutzer.getBenutzername())==0);
    }
    public String getBenutzername(){
        return benutzername;
    }
}

