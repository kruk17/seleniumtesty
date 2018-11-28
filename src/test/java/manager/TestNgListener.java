package manager;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Date;

public class TestNgListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Started Test:  "+result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test: "+ result.getMethod().getMethodName()+" has ended in success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test: "+result.getMethod().getMethodName()+"has ended in failure");
    }

    @Override
    public void onTestSkipped( ITestResult result) {
        System.out.println("Test: "+ result.getMethod().getMethodName()+"has skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test: "+result.getMethod().getMethodName()+"has ended in failure, but...");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println(context.getName()+"has already started"+ " at: "+context.getStartDate());


    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Fininshed: "+ context.getName() +" at: "+context.getEndDate());
    }
}
