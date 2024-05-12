import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", notes=" + notes +
                '}';
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
            System.out.println("- " + getContent());
        }
    }
    public void deleteNotes(int noteId) {
        for (int i = 0; i < notes.size(); i++) {
                notes.remove(i);
                System.out.println("Note with ID " + noteId + " has been deleted.");
                return;
        }
        System.out.println("Note with ID " + noteId + " not found.");
    }

    public static void main(String[] args) {
        Note note = new Note();
        note.addNote(String.valueOf(new Note(1234, "My Notes","These are my notes")));
        note.addNote(String.valueOf(new Note(5678,"More Notes", "I have more Notes")));
        note.deleteNotes(1234);
    }
}