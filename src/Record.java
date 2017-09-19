public class Record {

    private String name;
    private RecordType type;
    private IOC ioc;

    public Record(String name, RecordType type, IOC ioc) {
        this.name = name;
        this.type = type;
        this.ioc = ioc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecordType getType() {
        return type;
    }

    public void setType(RecordType type) {
        this.type = type;
    }

    public IOC getIoc() {
        return ioc;
    }

    public void setIoc(IOC ioc) {
        this.ioc = ioc;
    }

}
