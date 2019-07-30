package apertment;


public class Renter {
    private String name;
    private String idCard;
    private String addressHome;
    private String addressWork;
    private int amountInRoom;

    public Renter(String nameRenter, String IDCard, String addressHome, String addressWork, int amountInRoom) {
        this.name = nameRenter;
        this.idCard = IDCard;
        this.addressHome = addressHome;
        this.addressWork = addressWork;
        this.amountInRoom = amountInRoom;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddressHome() {
        return addressHome;
    }

    public void setAddressHome(String addressHome) {
        this.addressHome = addressHome;
    }

    public String getAddressWork() {
        return addressWork;
    }

    public void setAddressWork(String addressWork) {
        this.addressWork = addressWork;
    }

    public int getAmountInRoom() {
        return amountInRoom;
    }

    public void setAmountInRoom(int amountInRoom) {
        this.amountInRoom = amountInRoom;
    }
}
