public class OrangePhone {
    //all fields declared as 'private' for encapsulation
    private String name;
    private int imei;

    private static int producedCount = 0;

    /**
     * create new OrangePhone and set it's name and imei with their setters. 
     * Finally increases count of produced OrangePhone.
     *  
     * @param name The {@code String} to set as the phone's name
     * @param imei The {@code int} to set as the phone's imei
     */
    public OrangePhone(String name, int imei) {
        setName(name);
        setImei(imei);
        addProducedCount();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else
            this.name = "jPhone";
    }

    public int getImei() {
        return this.imei;
    }

    public void setImei(int imei) {
        if (imei >= 1000)
            this.imei = imei;
        else
            this.imei = 11309;
    }

    public static int getProducedCount() {
        return producedCount;
    }

    private static void addProducedCount() {
        producedCount++;
    }
}
