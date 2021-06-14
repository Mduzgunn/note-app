package com.note.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String title;

    @NotNull
    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    private Category category;

    public Note(){
        super();
    }

    public Note(@NotNull String title,@NotNull String content,Category category){
        super();
        this.title=title;
        this.content=content;
        this.category=category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
