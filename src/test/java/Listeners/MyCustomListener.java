package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyCustomListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("TestingDocs>> onTestStart ::" + result.getMethod()
                .getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("TestingDocs>> onTestSuccess ::" + result.getMethod()
                .getMethodName());
    }


    public void onTestFailure(ITestResult result) {
        System.out.println("TestingDocs>> onTestFailure ::" + result.getMethod()
                .getMethodName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("TestingDocs>> onTestSkipped ::" + result.getMethod()
                .getMethodName());
    }

    public void onStart(ITestContext context) {
        System.out.println("TestingDocs>> OnStart ::" + context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("****************TestRun Report Header ********************" );
        System.out.println("Total Passed" + context.getPassedTests());
        System.out.println("Total Failed" + context.getFailedTests());
        System.out.println("Total Skipped" + context.getSkippedTests());
        //System.out.println("dvdav" + context.setAttribute(););
        System.out.println("*****************TestRun Report Footer ********************" );
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
    }
}