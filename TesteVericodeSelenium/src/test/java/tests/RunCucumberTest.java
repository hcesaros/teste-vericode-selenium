package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.ClassRule;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.model.Statement;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        tags = "@TestAll  ",
        glue = {""}
)
class RunTest {

    @ClassRule
    public static TestRule testRule = new TestRule() {
        @Override
        public Statement apply(Statement statement, Description description) {
            return null;
        }
    };

}
