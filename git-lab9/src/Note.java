import java.util.ArrayList;
import java.util.List;

public class Note {
    private int id;
    String title;
    String content;

    public Note(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public List<String> notes;
    public Note(){
        notes = new ArrayList<>();
    }
    public void addNote(String note) {
        notes.add(note);
    }
    public void displayNotes() {
        System.out.println("Your Notes:");
        for (String note : notes) {
            System.out.println("- " + note);
        }
    }
}
