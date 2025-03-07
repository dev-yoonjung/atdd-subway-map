package subway.station.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false)
    private String name;

    @Builder
    public Station(String name) {
        this.name = name;
    }

}
