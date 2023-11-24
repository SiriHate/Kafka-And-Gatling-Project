package load_test;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.ScenarioBuilder;

public class Scenario {

    public static ScenarioBuilder sendMessageScenario = CoreDsl
            .scenario("send message scenario")
            .exec(Steps.messageReq);

}
