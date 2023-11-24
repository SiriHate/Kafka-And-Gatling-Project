package load_test;

import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.core.CoreDsl.rampUsersPerSec;

public class LoadingTesting extends Simulation {

    HttpProtocolBuilder httpProtocol = HttpDsl.http.baseUrl("http://localhost:8081");

    public LoadingTesting() {
        this.setUp(Scenario.sendMessageScenario.injectOpen(rampUsersPerSec(10).to(1000).during(10))
        ).protocols(httpProtocol);
    }

}
