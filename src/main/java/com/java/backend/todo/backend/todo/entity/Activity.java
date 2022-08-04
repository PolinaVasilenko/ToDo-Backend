package com.java.backend.todo.backend.todo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "activity", schema = "todolist", catalog = "postgres")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Cacheable
//@org.hibernate.annotations.Cache(usage = CacheCouncurrencyStrategy.READ_WRITE)
public class Activity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean activated;

    @Column(updatable = false)
    private String vvid;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;
        Activity activity = (Activity) o;
        return id.equals(activity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
