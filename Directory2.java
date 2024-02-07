package file2940447;

import java.util.ArrayList;

public class Directory implements Component {
    private String name;
    private ArrayList<Component> children;
    
    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
    
    public String display(String prefix) {
        return displayHelper(prefix, 0).trim();
    }

    private String displayHelper(String prefix, int depth) {
        String display = "";

        if (depth > 0) {
            for (int i = 0; i < depth - 1; i++) {
                display += prefix;
            }
        }

        if (depth > 0) {
            display += prefix;
        }
        
        display += this.name + ": (count=" + this.getCount() + ", size=" + this.getSize() + ")\n";

        depth++;

        for (Component child : children) {
            if (child instanceof Directory) {
                display += ((Directory) child).displayHelper(prefix, depth);
            } else {
                for (int i = 0; i < depth; i++) {
                    display += prefix;
                }
                display += child.display("") ;
            }
        }

        return display;
    }

    
    public String getName() {
        return this.name;
    }


    public int getSize() {
        int totalSize = 0;
        for (Component child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    public int getCount() {
        int count = 0;
        for (Component child : children) {
            count += child.getCount();
        }
        return count;
    }
    

    public Component search(String name) {
        for (Component child : children) {
            if ( child instanceof File && child.getName().equals(name) ) {
                return this;
            }
            if (child instanceof Directory) {
                Component result = child.search(name);
                if (result != null) {
                    return result;
                } 
            }
        }
        return null;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }
    
    public String toString() {
    	return this.name;
    }
    
}



