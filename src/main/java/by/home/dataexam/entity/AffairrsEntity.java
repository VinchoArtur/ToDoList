package by.home.dataexam.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "affairs")
public class AffairrsEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "affairs")
    private String affairs;

    @Column(name = "importance")
    private String importance;

    @Column(name = "affairsId")
    private long affairsId;

    public AffairrsEntity(String userId) {
        this.userId = userId;
    }

    public AffairrsEntity(String userId, String affairs) {
        this.userId = userId;
        this.affairs = affairs;
    }

    public AffairrsEntity(String userId, String affairs, String importance) {
        this.userId = userId;
        this.affairs = affairs;
        this.importance = importance;
    }


    public AffairrsEntity(String userId, String affairs, String importance, long affairsId) {
        this.userId = userId;
        this.affairs = affairs;
        this.importance = importance;
        this.affairsId = affairsId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAffairs() {
        return affairs;
    }

    public void setAffairs(String affairs) {
        this.affairs = affairs;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public long getAffairsId() {
        return affairsId;
    }

    public void setAffairsId(long affairsId) {
        this.affairsId = affairsId;
    }
}
