package org.launchcode.techjobs.oo;

public class PositionType extends JobField {
    public PositionType(String value){
        super(value);
    }

    // Override toString() to return the value
    @Override
    public String toString() {
        return getValue();
    }
   /* private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public void PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

//    @Override
//    public String toString() {
//        return "PositionType{" +
//                "value='" + value + '\'' +
//                '}';
//    }


    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PositionType that = (PositionType) o;
//        return id == that.id && Objects.equals(value, that.value);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, value);
//    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
*/

}