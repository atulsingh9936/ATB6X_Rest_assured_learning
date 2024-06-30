package org.example.Exercise_25_06_2024.listener;

import org.testng.IExecutionListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Custom_Listener implements IExecutionListener, ISuiteListener {

    @Override
    public void onExecutionStart() {
        System.out.println("onexecution start");
        long startTime= System.currentTimeMillis();
        System.out.println(" ****   *** Started execution at - "+ startTime + "****   *** ");
    }

    @Override
    public void onExecutionFinish() {
        long endTime= System.currentTimeMillis();
        System.out.println("****   *** Finished execution at- "+ endTime +"****   *** ");
        System.out.println("onexecution finish");

        // Send email to the QA lead
        //  Write Java code to write the Email to QA lead

    }


}
