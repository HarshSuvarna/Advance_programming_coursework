public class FileTest {
    public static void main(String[] args) {
        File courseworkpdf = new File("courseworkpdf", 1);
        File courseworkzip = new File("coursework zip file", 2);

        Directory coursework = new Directory("coursework");
        coursework.add(courseworkpdf);
        coursework.add(courseworkzip);

        Directory unittests = new Directory("unit tests");
        File test1 = new File("unit test 1", 56);
        unittests.add(test1);

        coursework.add(unittests);

        Directory harsh = new Directory("movies");
        File suvarna = new File("LOTR1", 100);
        File diwakar = new File("LOTR2", 112);

        harsh.add(suvarna);
        harsh.add(diwakar);

        unittests.add(harsh);

        // coursework.remove(courseworkzip);
        System.out.println(coursework.display("+--"));

        System.out.println(coursework.search("unit test 1").getName());
    }
}