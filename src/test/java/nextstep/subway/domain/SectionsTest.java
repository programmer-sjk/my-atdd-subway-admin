package nextstep.subway.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SectionsTest {
    @DisplayName("중간에 역을 추가 할 수 있다")
    @Test
    void addMiddleStation() {}

    @DisplayName("상행역을 추가 할 수 있다")
    @Test
    void addUpStation() {}

    @DisplayName("하행역을 추가 할 수 있다")
    @Test
    void addDownStation() {}

    @DisplayName("추가하려는 구간의 지하철 역이 모두 존재하면 추가 할 수 없다")
    @Test
    void addExistStationException() {}

    @DisplayName("추가하려는 구간의 지하철 역이 모두 없으면 추가 할 수 없다")
    @Test
    void addNotExistStationException() {}

    @DisplayName("중간에 존재하는 역을 제거 할 수 있다")
    @Test
    void deleteMiddleStation() {}

    @DisplayName("상행역을 제거 할 수 있다")
    @Test
    void deleteUpStation() {}

    @DisplayName("하행역을 제거 할 수 있다")
    @Test
    void deleteDownStation() {}

    @DisplayName("삭제하려는 지하철 역이 없으면 삭제할 수 없다")
    @Test
    void deleteNotExistStationException() {}

    @DisplayName("마지막 구간은 삭제할 수 없다")
    @Test
    void deleteOneSectionException() {}
}
