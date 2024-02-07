public interface Component {
    public String getName();

    public String display(String string);

    public int getSize();

    public int getCount();

    public Component search(String name);
}