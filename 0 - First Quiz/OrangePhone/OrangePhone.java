public class OrangePhone {
    // all fields declared as 'private' for encapsulation
    private String name;
    private int imei;

    private static int producedCount = 0;

    /**
     * create new OrangePhone object and set it's name and imei with their setters.
     * Finally increases count of produced OrangePhone.
     * 
     * @param name The {@code String} to set as the object's name
     * @param imei The {@code int} to set as the object's imei
     */
    public OrangePhone(String name, int imei) {
        setName(name);
        setImei(imei);
        addProducedCount();
    }

    /**
     * Used to encapsulate {@code this.name} attribute
     * 
     * @return the value of the object's name attribute
     */
    public String getName() {
        return this.name;
    }

    /**
     * Used to encapsulate {@code this.name} attribute
     * <p>
     * if the name parameter is not empty,
     * it will be set to the object's name attribute.
     * 
     * <p>
     * otherwise 'jPhone' will be set to the object's name attribute.
     * 
     * @param name the {@code String} to set as object's name attribute
     */
    public void setName(String name) {
        if ((name != null) && (!name.isEmpty()))
            this.name = name;
        else
            this.name = "jPhone";
    }

    /**
     * Used to encapsulate {@code this.imei} attribute
     * 
     * @return the value of object's imei attribute
     */
    public int getImei() {
        return this.imei;
    }

    /**
     * Used to encapsulate {@code this.imei} attribute
     * <p>
     * if the imei parameter has 4 digits or more,
     * it will be set to the object's imei attribute.
     * 
     * <p>
     * otherwise 11309 will be set to the object's imei attribute
     * 
     * @param name the {@code int} to set as object's imei attribute
     */
    public void setImei(int imei) {
        if (imei >= 1000)
            this.imei = imei;
        else
            this.imei = 11309; // last 5 digits of my student number
    }

    /**
     * Used to encapsulate {@code producedCount} attribute
     * 
     * <p>
     * get the count of created {@code OrangePhone} objects
     * 
     * @return the value of {@code producedCount}
     */
    public static int getProducedCount() {
        return producedCount;
    }

    /**
     * Used to encapsulate {@code producedCount} attribute
     * 
     * <p>
     * if a {@code OrangePhone} created, add one to the value of
     * {@code producedCount}
     */
    private static void addProducedCount() {
        producedCount++;
    }
}
