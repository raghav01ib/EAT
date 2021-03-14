package org.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.jboss.eap.additional.testsuite.annotations.EAT;

@RestController
@EAT({"modules/testcases/jdkAll/Wildfly/spring/src/main/java#23.0.0","modules/testcases/jdkAll/ServerBeta/spring/src/main/java#21.0.0","modules/testcases/jdkAll/Eap7/spring/src/main/java#7.3.5"})
public class JaxbResource {
    @RequestMapping("/restspring/{resource}")
    String Resource(@PathVariable String resource) {
             return resource;
    }
}