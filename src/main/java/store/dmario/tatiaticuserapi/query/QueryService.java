package store.dmario.tatiaticuserapi.query;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class QueryService {
    private final QueryRepository queryRepository;

    public void create(String log) {
        Query query = new Query();
        query.setLog(log);
        query.setCreateDate(LocalDateTime.now());
        queryRepository.save(query);
    }

    public String pong() {
        return "pong";
    }
}
