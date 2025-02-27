

import java.text.SimpleDateFormat;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private SimpleDateFormat acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    }

    // Add Accessor and Mutator Methods

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public SimpleDateFormat getAcquisitionDate() {
        return this.acquisitionDate;
    }

    public void setAcquisitionDate(SimpleDateFormat acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public SimpleDateFormat getStatusDate() {
        return this.statusDate;
    }

    public void setStatusDate(SimpleDateFormat statusDate) {
        this.statusDate = statusDate;
    }

    public String getAcquisitionSource() {
        return this.acquisitionSource;
    }

    public void setAcquisitionSource(String acquisitionSource) {
        this.acquisitionSource = acquisitionSource;
    }

    public Boolean isReserved() {
        return this.reserved;
    }

    public Boolean getReserved() {
        return this.reserved;
    }

    public void setReserved(Boolean reserved) {
        this.reserved = reserved;
    }

    public String getTrainingLocation() {
        return this.trainingLocation;
    }

    public void setTrainingLocation(String trainingLocation) {
        this.trainingLocation = trainingLocation;
    }

    public SimpleDateFormat getTrainingStart() {
        return this.trainingStart;
    }

    public void setTrainingStart(SimpleDateFormat trainingStart) {
        this.trainingStart = trainingStart;
    }

    public SimpleDateFormat getTrainingEnd() {
        return this.trainingEnd;
    }

    public void setTrainingEnd(SimpleDateFormat trainingEnd) {
        this.trainingEnd = trainingEnd;
    }

    public String getTrainingStatus() {
        return this.trainingStatus;
    }

    public void setTrainingStatus(String trainingStatus) {
        this.trainingStatus = trainingStatus;
    }

    public String getInServiceCountry() {
        return this.inServiceCountry;
    }

    public void setInServiceCountry(String inServiceCountry) {
        this.inServiceCountry = inServiceCountry;
    }

    public String getInServiceCity() {
        return this.inServiceCity;
    }

    public void setInServiceCity(String inServiceCity) {
        this.inServiceCity = inServiceCity;
    }

    public String getInServiceAgency() {
        return this.inServiceAgency;
    }

    public void setInServiceAgency(String inServiceAgency) {
        this.inServiceAgency = inServiceAgency;
    }

    public String getInServicePOC() {
        return this.inServicePOC;
    }

    public void setInServicePOC(String inServicePOC) {
        this.inServicePOC = inServicePOC;
    }

    public String getInServiceEmail() {
        return this.inServiceEmail;
    }

    public void setInServiceEmail(String inServiceEmail) {
        this.inServiceEmail = inServiceEmail;
    }

    public String getInServicePhone() {
        return this.inServicePhone;
    }

    public void setInServicePhone(String inServicePhone) {
        this.inServicePhone = inServicePhone;
    }

    public String getInServicePostalAddress() {
        return this.inServicePostalAddress;
    }

    public void setInServicePostalAddress(String inServicePostalAddress) {
        this.inServicePostalAddress = inServicePostalAddress;
    }

    public RescueAnimal name(String name) {
        this.name = name;
        return this;
    }

    public RescueAnimal type(String type) {
        this.type = type;
        return this;
    }

    public RescueAnimal gender(String gender) {
        this.gender = gender;
        return this;
    }

    public RescueAnimal age(int age) {
        this.age = age;
        return this;
    }

    public RescueAnimal weight(float weight) {
        this.weight = weight;
        return this;
    }

    public RescueAnimal acquisitionDate(SimpleDateFormat acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
        return this;
    }

    public RescueAnimal statusDate(SimpleDateFormat statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    public RescueAnimal acquisitionSource(String acquisitionSource) {
        this.acquisitionSource = acquisitionSource;
        return this;
    }

    public RescueAnimal reserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    public RescueAnimal trainingLocation(String trainingLocation) {
        this.trainingLocation = trainingLocation;
        return this;
    }

    public RescueAnimal trainingStart(SimpleDateFormat trainingStart) {
        this.trainingStart = trainingStart;
        return this;
    }

    public RescueAnimal trainingEnd(SimpleDateFormat trainingEnd) {
        this.trainingEnd = trainingEnd;
        return this;
    }

    public RescueAnimal trainingStatus(String trainingStatus) {
        this.trainingStatus = trainingStatus;
        return this;
    }

    public RescueAnimal inServiceCountry(String inServiceCountry) {
        this.inServiceCountry = inServiceCountry;
        return this;
    }

    public RescueAnimal inServiceCity(String inServiceCity) {
        this.inServiceCity = inServiceCity;
        return this;
    }

    public RescueAnimal inServiceAgency(String inServiceAgency) {
        this.inServiceAgency = inServiceAgency;
        return this;
    }

    public RescueAnimal inServicePOC(String inServicePOC) {
        this.inServicePOC = inServicePOC;
        return this;
    }

    public RescueAnimal inServiceEmail(String inServiceEmail) {
        this.inServiceEmail = inServiceEmail;
        return this;
    }

    public RescueAnimal inServicePhone(String inServicePhone) {
        this.inServicePhone = inServicePhone;
        return this;
    }

    public RescueAnimal inServicePostalAddress(String inServicePostalAddress) {
        this.inServicePostalAddress = inServicePostalAddress;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", gender='" + getGender() + "'" +
            ", age='" + getAge() + "'" +
            ", weight='" + getWeight() + "'" +
            ", acquisitionDate='" + getAcquisitionDate() + "'" +
            ", statusDate='" + getStatusDate() + "'" +
            ", acquisitionSource='" + getAcquisitionSource() + "'" +
            ", reserved='" + isReserved() + "'" +
            ", trainingLocation='" + getTrainingLocation() + "'" +
            ", trainingStart='" + getTrainingStart() + "'" +
            ", trainingEnd='" + getTrainingEnd() + "'" +
            ", trainingStatus='" + getTrainingStatus() + "'" +
            ", inServiceCountry='" + getInServiceCountry() + "'" +
            ", inServiceCity='" + getInServiceCity() + "'" +
            ", inServiceAgency='" + getInServiceAgency() + "'" +
            ", inServicePOC='" + getInServicePOC() + "'" +
            ", inServiceEmail='" + getInServiceEmail() + "'" +
            ", inServicePhone='" + getInServicePhone() + "'" +
            ", inServicePostalAddress='" + getInServicePostalAddress() + "'" +
            "}";
    }


}
