package blah;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SomeController {

    @RequestMapping(method = RequestMethod.POST, value = "/policy-form", produces = "application/json")
    public Map<String, Object> policyFormEndpoint(@RequestBody RequestParameter requestParameter) {
        return new HashMap<>();
    }

}
