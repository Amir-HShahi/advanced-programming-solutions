public class OrangePhone {
    private static int produceCounter = 0;
    private String name;
    private int imei;

    public OrangePhone(String name, int imei) {
        setName(name);
        setImei(imei);
        produceCounter++;
    }

    
    public OrangePhone() {
        setName("");
        setImei(1);
        produceCounter++;
    }


    @Override
    public String toString() {
        String name = "Name: " + getName() + "\n";
        String imei = "IMEI: " + getImei() + "\n";

        return name + imei;
    }


    public static int getProduceCount() {
        return produceCounter;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        } else {
            this.name = "jPhone";
        }
    }

    public int getImei() {
        return this.imei;
    }

    private void setImei(int imei) {
        if (imei >= 1000) {
            this.imei = imei;
        } else {
            this.imei = 11309;
        }
    }

    
}
