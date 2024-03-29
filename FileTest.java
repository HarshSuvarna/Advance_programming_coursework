public class FileTest {

    // public static void main(String[] args) {
    // File courseworkpdf = new File("courseworkpdf", 1);
    // File courseworkzip = new File("coursework zip file", 2);

    // Directory coursework = new Directory("coursework");
    // coursework.add(courseworkpdf);
    // coursework.add(courseworkzip);

    // Directory unittests = new Directory("unit tests");
    // File test1 = new File("unit test 1", 56);
    // unittests.add(test1);

    // coursework.add(unittests);
    // // coursework.remove(courseworkzip);
    // System.out.print(coursework.display("\t"));

    // System.out.println(coursework.search("courseworkpdf").getName());
    // }

    public static void main(String[] args) {
        File settings = new File("settings", 10);
        File familyHoliday = new File("family-holiday", 201);
        File portrait = new File("portrait", 134);
        File wallpaper = new File("wallpaper", 421);
        File ringtone = new File("ringtone", 120);

        Directory root = new Directory("root");
        Directory music = new Directory("music");
        Directory pictures = new Directory("pictures");
        Directory personal = new Directory("personal");

        Directory misc = new Directory("misc");
        root.add(settings);
        root.add(music);
        root.add(pictures);
        pictures.add(personal);
        pictures.add(misc);
        music.add(ringtone);
        misc.add(wallpaper);
        personal.add(familyHoliday);
        personal.add(portrait);
        pictures.remove(personal);
        System.out.println(root.display("\t"));
        System.out.println(root.search("wallpaper").getName());
    }
}