public class Emergency {
    private String callerName;
    private String callerPhone;
    private String location;
    private String county;
    private String type; // MEDICAL, FIRE, POLICE
    private String details;
    private java.time.LocalDateTime timeReported;
    private String assignedPSAP;
    private String status; // REPORTED, DISPATCHED, ON_SCENE, RESOLVED
    private String respondingUnits;

    // Constructor, getters, setters
    public Emergency(String name, String phone, String loc, String type, String details) {
        this.callerName = name;
        this.callerPhone = phone;
        this.location = loc;
        this.type = type;
        this.details = details;
        this.timeReported = java.time.LocalDateTime.now();
        this.status = "REPORTED";
    }
}