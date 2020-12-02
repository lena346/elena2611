package elena2611.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question extends AuditModel {
    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    private Long id;

    public Long getId(){
        return id;
    }

    @Column(columnDefinition = "text")
    private String title;

    @Column(columnDefinition = "text")
    private String description;


    public String getDescription(){
        return description;
    }

    public String getTitle(){
        return title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public  void setTitle(String text){
        this.title = text;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}