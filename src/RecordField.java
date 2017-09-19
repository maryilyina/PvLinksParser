public class RecordField {

    private String name;
    private String type;
    private Record record;

    public RecordField(String name, String type, Record record) {
        this.name = name;
        this.type = type;
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
