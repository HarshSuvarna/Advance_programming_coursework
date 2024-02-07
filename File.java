public class File implements Component {
    private String fileName;
    private int size;

    public File(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }

    public String getName() {
        return this.fileName;
    }

    public int getSize() {
        return this.size;
    }

    public int getCount() {
        return 1;
    }

    public String display(String prefix) {
        return prefix + this.fileName + " (" + this.size + ")";
    }

    public Component search(String name) {
        if (this.getName().equals(name)) {
            return this;
        }
        return null;
    }

}
