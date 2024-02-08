import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
    private String directoryName;
    private List<Component> componentList;
    private static int depth = 0;
    // private int depth = 0;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        componentList = new ArrayList<>();
    }

    public String display(String prefix) {
        StringBuilder output = new StringBuilder();
        output.append(prefix.repeat(depth));
        output.append(this.directoryName + ": (count=" + this.getCount() + ", " + "size=" + this.getSize() + ")\n");
        depth++;
        for (int i = 0; i < componentList.size(); i++) {
            StringBuilder componentPrefix = new StringBuilder();
            componentPrefix.append(prefix.repeat(depth));
            output.append(
                    componentList.get(i) instanceof File ? componentList.get(i).display(componentPrefix.toString())
                            : componentList.get(i).display(prefix));
            if (i < componentList.size() - 1) {
                output.append("\n");
            }
        }
        depth--;
        return output.toString();
    }

    public String getName() {
        return this.directoryName;
    }

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);

    }

    public int getSize() {
        int size = 0;
        for (Component component : componentList) {
            size += component.getSize();
        }
        return size;
    }

    public int getCount() {
        int count = 0;
        for (Component component : componentList) {
            count += component.getCount();
        }
        return count;
    }

    public Component search(String name) {
        for (Component component : componentList) {
            Component searchResult = component.search(name);
            if (searchResult != null) {
                return searchResult;
            }
        }
        return null;
    }

}
