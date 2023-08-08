package store.dmario.tatiaticuserapi.query;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api")
@RequiredArgsConstructor
@Controller
public class QueryController {

    private final QueryService queryService;
    @PostMapping("/query")
    public void questionCreate(@RequestParam String log) {
        queryService.create(log);
    }

    @GetMapping("/ping")
    @ResponseBody
    public String hello() {
        return queryService.pong();
    }
}
