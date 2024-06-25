package org.chenile.samples.secservice.bdd;

import cucumber.api.junit.Cucumber;
import org.chenile.security.test.BaseSecurityTest;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

public class MyRunner extends Runner {
    static BaseSecurityTest baseSecurityTest = new BaseSecurityTest();
    Cucumber cucumber;
    public MyRunner(Class<?> arg) throws InitializationError {
        this.cucumber = new Cucumber(arg);
    }

    @Override
    public Description getDescription() {
        return cucumber.getDescription();
    }

    @Override
    public void run(RunNotifier notifier) {
        cucumber.run(notifier);
    }
}
