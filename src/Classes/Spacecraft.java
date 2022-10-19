package Classes;

import java.io.Serializable;
import java.util.Comparator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Spacecraft implements Serializable {

    @JsonProperty("uid")
    private String uid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("registry")
    private String registry;
    @JsonProperty("status")
    private String status;
    @JsonProperty("dateStatus")
    private String dateStatus;
    @JsonProperty("spacecraftClass")
    private Object spacecraftClass;
    @JsonProperty("owner")
    private Object owner;
    @JsonProperty("operator")
    private Object operator;

    /**
     * No args constructor for use in serialization
     */
    public Spacecraft() {
    }

    /**
     * @param spacecraftClass
     * @param owner
     * @param uid
     * @param registry
     * @param name
     * @param dateStatus
     * @param operator
     * @param status
     */
    public Spacecraft(String uid, String name,String registry, String status, String dateStatus, Object spacecraftClass, Object owner, Object operator) {
        super();
        this.uid = uid;
        this.name = name;
        this.registry = registry;
        this.status = status;
        this.dateStatus = dateStatus;
        this.spacecraftClass = spacecraftClass;
        this.owner = owner;
        this.operator = operator;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("registry")
    public String getRegistry() {
        return registry;
    }

    @JsonProperty("registry")
    public void setRegistry(String registry) {
        this.registry = registry;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("dateStatus")
    public String getDateStatus() {
        return dateStatus;
    }

    @JsonProperty("dateStatus")
    public void setDateStatus(String dateStatus) {
        this.dateStatus = dateStatus;
    }

    @JsonProperty("spacecraftClass")
    public Object getSpacecraftClass() {
        return spacecraftClass;
    }

    @JsonProperty("spacecraftClass")
    public void setSpacecraftClass(Object spacecraftClass) {
        this.spacecraftClass = spacecraftClass;
    }

    @JsonProperty("owner")
    public Object getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Object owner) {
        this.owner = owner;
    }

    @JsonProperty("operator")
    public Object getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(Object operator) {
        this.operator = operator;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.uid == null ? "" : "uID = " + this.uid + ",\n\t");
        sb.append(this.name == null ? "" : "Name = " + this.name + ",\n\t");
        sb.append(this.registry == null ? "" : "Registry = " + this.registry + ",\n\t");
        sb.append(this.status == null ? "" : "Status = " + this.status + ",\n\t");
        sb.append(this.dateStatus == null ? "" : "Date Status = " + this.dateStatus + ",\n\t");
        sb.append(this.spacecraftClass == null ? "" : "Spacecraft Class = " + this.spacecraftClass + ",\n\t");
        sb.append(this.owner == null ? "" : "Owner = " + this.owner + ",\n\t");
        sb.append(this.operator == null ? "" : "Operator = " + this.operator + ",\n\t");


        if (sb.charAt((sb.length() - 1)) == '\t') {
            sb.setCharAt((sb.length() - 3), ' ');
            sb.setCharAt((sb.length() - 1), '-');

        } else {
            sb.append('-');
        }

        return sb.toString();
    }

    public static  Comparator<Spacecraft> byUIdAsc =Comparator.comparing(o -> o.uid);
    public static  Comparator<Spacecraft> byUIdDesc =(o1, o2) -> o2.uid.compareTo(o1.uid);

    public static  Comparator<Spacecraft> byNameAsc =Comparator.comparing(o -> o.name);
    public static  Comparator<Spacecraft> byNameDesc =(o1, o2) -> o2.name.compareTo(o1.name);

}
