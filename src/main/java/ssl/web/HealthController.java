package ssl.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ssl.Foo;

@RestController
@RequestMapping("/dgraph")
public class HealthController {

  @Autowired
  Foo foo;

  @RequestMapping(value = "/health", method = RequestMethod.GET)
  public String health() {
    foo.execute();
    return "healthy son";
  }

}
