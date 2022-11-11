package nextstep.subway.domain;

import javax.persistence.*;
import java.util.List;

@Embeddable
public class Sections {
    private List<Section> sections;

    public Sections(List<Section> sections) {
        this.sections = sections;
    }

    protected Sections() {}
}
